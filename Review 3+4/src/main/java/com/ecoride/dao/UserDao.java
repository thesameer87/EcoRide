package com.ecoride.dao;

import com.ecoride.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private Map<String, User> userDb = new HashMap<>();

    public boolean addUser(User user) {
        if (userDb.containsKey(user.getEmail())) {
            return false;
        }
        userDb.put(user.getEmail(), user);
        return true;
    }

    public User findByEmail(String email) {
        return userDb.get(email);
    }

    public boolean deleteUserByEmail(String email) {
        return userDb.remove(email) != null;
    }
}
