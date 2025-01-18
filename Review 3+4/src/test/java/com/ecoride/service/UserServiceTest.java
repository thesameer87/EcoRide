package com.ecoride.service;

import com.ecoride.model.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void testRegisterUserSuccess() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        assertTrue(userService.register(user));
    }

    @Test
    void testRegisterUserDuplicate() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        userService.register(user);
        assertFalse(userService.register(user));
    }
}
