package com.ecoride.dao;

import com.ecoride.model.User;

import java.sql.*;

public class UserDAO {
    public User getUserByEmail(String email) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM User WHERE email = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, email);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    return new User(resultSet.getInt("user_id"),
                                    resultSet.getString("name"),
                                    resultSet.getString("email"),
                                    resultSet.getString("password"),
                                    resultSet.getInt("eco_score"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean saveUser(User user) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO User (name, email, password, eco_score) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, user.getName());
                statement.setString(2, user.getEmail());
                statement.setString(3, user.getPassword());
                statement.setInt(4, user.getEcoScore());
                return statement.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
