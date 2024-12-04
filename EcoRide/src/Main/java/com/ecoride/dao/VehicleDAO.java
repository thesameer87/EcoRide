package com.ecoride.dao;

import com.ecoride.model.Vehicle;

import java.sql.*;

public class VehicleDAO {
    public Vehicle getVehicleById(int vehicleId) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM Vehicle WHERE vehicle_id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, vehicleId);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    return new Vehicle(resultSet.getInt("vehicle_id"),
                                       resultSet.getInt("owner_id"),
                                       resultSet.getString("model"),
                                       resultSet.getInt("eco_rating"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean saveVehicle(Vehicle vehicle) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO Vehicle (owner_id, model, eco_rating) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, vehicle.getOwnerId());
                statement.setString(2, vehicle.getModel());
                statement.setInt(3, vehicle.getEcoRating());
                return statement.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
