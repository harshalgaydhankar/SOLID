package com.principle.singleResponsibility.after;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private UserValidator userValidator = new UserValidator();
    private UserPersistenceService persistenceService = new UserPersistenceService();
    private UserMapper mapper = new UserMapper();
    
    //Create a new user
    public String createUser(String userJson) throws IOException {

        User user = mapper.map(userJson);

        boolean valid = userValidator.validateUser(user);

        if(!valid) {
            return "ERROR";
        }
        persistenceService.save(user);

        return "SUCCESS";
    }

}