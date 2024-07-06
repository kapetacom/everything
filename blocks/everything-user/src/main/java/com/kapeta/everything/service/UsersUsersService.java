package com.kapeta.everything.service;

import com.kapeta.everything.dto.TokenDTO;
import com.kapeta.everything.dto.TokenWithPasswordDTO;
import com.kapeta.everything.dto.UserAuthPasswordDTO;
import com.kapeta.everything.dto.UserDTO;
import com.kapeta.everything.dto.UserRegistrationDTO;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class UsersUsersService implements IUsersUsersService {

    @Override
    public TokenDTO registerUser(UserRegistrationDTO payload) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public UserDTO activateUser(TokenDTO token) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public TokenDTO authenticate(UserAuthPasswordDTO auth) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public TokenDTO recoverPassword(String email) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public void applyNewPassword(TokenWithPasswordDTO token) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public UserDTO getCurrentUser() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public UserDTO updateCurrentUser(UserDTO user) {
        throw new RuntimeException("Not implemented");
    }
}
