package com.principle.singleResponsibility.before;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {


    UserController controller = new UserController();

    @Test
    public void shouldReturnSuccessResponseForValidUserInput() throws IOException {
        //A valid USER JSON String
        final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";
        String actualResponse = controller.createUser(VALID_USER_JSON);
        String expectedResponse = "SUCCESS";
        assertEquals(expectedResponse, actualResponse);
    }


    @Test
    public void shouldReturnErrorResponseForInvalidUserInput() throws IOException {
        //Invalid USER JSON String - email format wrong
        final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";
        String actualResponse = controller.createUser(INVALID_USER_JSON);
        String expectedResponse = "ERROR";
        assertEquals(expectedResponse, actualResponse);
    }
}