package com.kapeta.everything.service;

import com.kapeta.everything.dto.TokenDTO;
import com.kapeta.everything.dto.UserAuthPasswordDTO;
import com.kapeta.everything.dto.UserDTO;
import com.kapeta.everything.dto.UserRegistrationDTO;
import java.util.*;

public interface IUsersUsersService {
    TokenDTO registerUser(UserRegistrationDTO payload) throws Exception;

    TokenDTO authenticate(UserAuthPasswordDTO auth) throws Exception;

    UserDTO getCurrentUser() throws Exception;

    UserDTO updateCurrentUser(UserDTO user) throws Exception;

    List<UserDTO> getAllUsers() throws Exception;
}
