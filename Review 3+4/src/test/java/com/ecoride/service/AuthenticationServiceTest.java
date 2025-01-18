package com.ecoride.service;

import com.ecoride.model.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServiceTest {
    private AuthenticationService authService;

    @BeforeEach
    void setUp() {
        authService = new AuthenticationService();
    }

    @Test
    void testAuthenticateSuccess() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        authService.register(user);
        assertNotNull(authService.authenticate("john.doe@example.com", "password123"));
    }

    @Test
    void testAuthenticateFailure() {
        assertNull(authService.authenticate("wrong.email@example.com", "password123"));
    }
}
