package com.ecoride;

import com.ecoride.service.UserService;
import com.ecoride.service.VehicleService;
import com.ecoride.service.BookingService;
import com.ecoride.model.User;
import com.ecoride.model.Vehicle;
import com.ecoride.model.Booking;

import java.util.Date;

public class EcoRideApp {
    public static void main(String[] args) {
        // Sample User, Vehicle, and Booking operations
        UserService userService = new UserService();
        VehicleService vehicleService = new VehicleService();
        BookingService bookingService = new BookingService();

        // Registering a User
        User user = new User(0, "John Doe", "john.doe@example.com", "securepassword", 85);
        userService.registerUser(user);

        // Adding a Vehicle
        Vehicle vehicle = new Vehicle(0, 1, "Tesla Model S", 95);
        vehicleService.addVehicle(vehicle);

        // Making a Booking
        Booking booking = new Booking(0, 1, 1, new Date(), new Date(System.currentTimeMillis() + 3600000)); // Booking for 1 hour
        bookingService.bookVehicle(booking);
    }
}
