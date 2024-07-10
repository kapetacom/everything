package com.kapeta.everything.service;

import com.kapeta.everything.dto.TokenDTO;
import com.kapeta.everything.dto.UserAuthPasswordDTO;
import com.kapeta.everything.dto.UserDTO;
import com.kapeta.everything.dto.UserRegistrationDTO;
import com.kapeta.everything.repositories.users.User;
import com.kapeta.everything.repositories.users.UserRepository;
import com.kapeta.spring.security.provider.JWTCreatorService;
import com.nimbusds.jwt.SignedJWT;
import org.modelmapper.ModelMapper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersUsersService implements IUsersUsersService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final BCryptPasswordEncoder passwordEncoder;
    private final JWTCreatorService jwtCreatorService;

    public UsersUsersService(UserRepository userRepository, ModelMapper modelMapper, BCryptPasswordEncoder passwordEncoder, JWTCreatorService jwtCreatorService) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.jwtCreatorService = jwtCreatorService;
    }

    @Override
    public TokenDTO registerUser(UserRegistrationDTO payload) {
        if (userRepository.findByEmail(payload.getEmail()).isPresent()) {
            throw new RuntimeException("User already exists");
        }

        User user = modelMapper.map(payload, User.class);
        user.setPassword(passwordEncoder.encode(payload.getPassword()));
        userRepository.save(user);

        SignedJWT token = jwtCreatorService.createToken(user.getEmail());

        TokenDTO tokenDTO = new TokenDTO();
        tokenDTO.setToken(token.serialize());
        return tokenDTO;
    }

    @Override
    public TokenDTO authenticate(UserAuthPasswordDTO auth) {
        Optional<User> userOptional = userRepository.findByEmail(auth.getEmail());
        if (userOptional.isEmpty()) {
            throw new RuntimeException("Invalid email or password");
        }

        User user = userOptional.get();

        if (!passwordEncoder.matches(auth.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid email or password");
        }

        SignedJWT token = jwtCreatorService.createToken(user.getEmail());

        TokenDTO tokenDTO = new TokenDTO();
        tokenDTO.setToken(token.serialize());
        return tokenDTO;
    }

    @Override
    public UserDTO getCurrentUser() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        return modelMapper.map(userOptional.get(), UserDTO.class);
    }

    @Override
    public UserDTO updateCurrentUser(UserDTO userDTO) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        User user = userOptional.get();
        user.setName(userDTO.getName());
        userRepository.save(user);

        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    @PreAuthorize("isFullyAuthenticated()")
    public List<UserDTO> getAllUsers() throws Exception {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .toList();
    }
}
