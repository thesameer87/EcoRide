package com.ecoride.service;

import com.ecoride.dao.UserDao;
import com.ecoride.model.User;

public class AuthenticationService {
    private UserDao userDao;

    public AuthenticationService() {
        this.userDao = new UserDao();
    }

    public User authenticate(String email, String password) {
        User user = userDao.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
