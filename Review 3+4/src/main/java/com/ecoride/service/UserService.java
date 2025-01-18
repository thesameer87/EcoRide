package com.ecoride.service;

import com.ecoride.dao.UserDao;
import com.ecoride.model.User;

public class UserService {
    private UserDao userDao;

    public UserService() {
        this.userDao = new UserDao();
    }

    public boolean register(User user) {
        return userDao.addUser(user);
    }

    public boolean deleteUser(String email) {
        return userDao.deleteUserByEmail(email);
    }
}
