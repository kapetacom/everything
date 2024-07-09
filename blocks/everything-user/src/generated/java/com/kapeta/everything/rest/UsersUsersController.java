/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.rest;

import com.kapeta.everything.dto.TokenDTO;
import com.kapeta.everything.dto.UserAuthPasswordDTO;
import com.kapeta.everything.dto.UserDTO;
import com.kapeta.everything.dto.UserRegistrationDTO;
import com.kapeta.everything.service.IUsersUsersService;
import com.kapeta.spring.annotation.*;
import jakarta.validation.Valid;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.*;

@RestController
@KapetaController("users")
@RequestMapping("/users")
public class UsersUsersController {

    private final IUsersUsersService service;

    public UsersUsersController(IUsersUsersService service) {
        this.service = service;
    }

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public TokenDTO registerUser(
        @Valid @RequestBody UserRegistrationDTO payload
    ) throws Exception {
        return service.registerUser(payload);
    }

    @ResponseBody
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public TokenDTO authenticate(@Valid @RequestBody UserAuthPasswordDTO auth)
        throws Exception {
        return service.authenticate(auth);
    }

    @ResponseBody
    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public UserDTO getCurrentUser() throws Exception {
        return service.getCurrentUser();
    }

    @ResponseBody
    @RequestMapping(value = "/me", method = RequestMethod.POST)
    public UserDTO updateCurrentUser(@Valid @RequestBody UserDTO user)
        throws Exception {
        return service.updateCurrentUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers() throws Exception {
        return service.getAllUsers();
    }
}
