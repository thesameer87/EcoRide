package com.ecoride.dao;

import com.ecoride.model.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    private UserDao userDao;

    @BeforeEach
    void setUp() {
        userDao = new UserDao();
    }

    @Test
    void testAddUserSuccess() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        assertTrue(userDao.addUser(user));
    }

    @Test
    void testFindByEmail() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        userDao.addUser(user);
        assertEquals(user, userDao.findByEmail("john.doe@example.com"));
    }

    @Test
    void testDeleteUserByEmail() {
        User user = new User("John Doe", "john.doe@example.com", "password123");
        userDao.addUser(user);
        assertTrue(userDao.deleteUserByEmail("john.doe@example.com"));
    }
}
