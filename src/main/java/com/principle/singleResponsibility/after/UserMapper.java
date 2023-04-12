package com.principle.singleResponsibility.after;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserMapper {

    ObjectMapper mapper = new ObjectMapper();

    public User map(String userJson) throws IOException {
        return mapper.readValue(userJson, User.class);
    }
}
