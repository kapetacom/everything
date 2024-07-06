package com.kapeta.everything.service;

import com.kapeta.everything.dto.TokenDTO;
import com.kapeta.everything.dto.TokenWithPasswordDTO;
import com.kapeta.everything.dto.UserAuthPasswordDTO;
import com.kapeta.everything.dto.UserDTO;
import com.kapeta.everything.dto.UserRegistrationDTO;
import java.util.*;

public interface IUsersUsersService {
    TokenDTO registerUser(UserRegistrationDTO payload) throws Exception;

    UserDTO activateUser(TokenDTO token) throws Exception;

    TokenDTO authenticate(UserAuthPasswordDTO auth) throws Exception;

    TokenDTO recoverPassword(String email) throws Exception;

    void applyNewPassword(TokenWithPasswordDTO token) throws Exception;

    UserDTO getCurrentUser() throws Exception;

    UserDTO updateCurrentUser(UserDTO user) throws Exception;
}
