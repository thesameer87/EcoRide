package com.ecoride.model;

public class User {
    private String name;
    private String email;
    private String password;
    private String memberSince;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.memberSince = "January 2024"; // Example default
    }

    // Getters and Setters
}
