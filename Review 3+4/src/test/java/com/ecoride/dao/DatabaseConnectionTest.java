package com.ecoride.dao;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    @Test
    void testConnectionSuccess() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            assertNotNull(connection);
        } catch (Exception e) {
            fail("Connection should be successful.");
        }
    }
}
