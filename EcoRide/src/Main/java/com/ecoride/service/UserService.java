package com.ecoride.service;

import com.ecoride.dao.UserDAO;
import com.ecoride.model.User;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public boolean registerUser(User user) {
        return userDAO.saveUser(user);
    }

    public User findUserByEmail(String email) {
        return userDAO.getUserByEmail(email);
    }
}
