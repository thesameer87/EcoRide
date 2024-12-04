package com.ecoride.model;

import java.util.Date;

public class Booking {
    private int bookingId;
    private int userId; // User who made the booking
    private int vehicleId; // Vehicle booked
    private Date startTime;
    private Date endTime;

    public Booking(int bookingId, int userId, int vehicleId, Date startTime, Date endTime) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and Setters
    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public Date getStartTime() { return startTime; }
    public void setStartTime(Date startTime) { this.startTime = startTime; }

    public Date getEndTime() { return endTime; }
    public void setEndTime(Date endTime) { this.endTime = endTime; }

    @Override
    public String toString() {
        return "Booking{id=" + bookingId + ", userId=" + userId + ", vehicleId=" + vehicleId + "}";
    }
}
