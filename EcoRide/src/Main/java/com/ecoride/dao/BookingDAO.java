package com.ecoride.dao;

import com.ecoride.model.Booking;

import java.sql.*;

public class BookingDAO {
    public boolean saveBooking(Booking booking) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO Booking (user_id, vehicle_id, start_time, end_time) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, booking.getUserId());
                statement.setInt(2, booking.getVehicleId());
                statement.setTimestamp(3, new Timestamp(booking.getStartTime().getTime()));
                statement.setTimestamp(4, new Timestamp(booking.getEndTime().getTime()));
                return statement.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
