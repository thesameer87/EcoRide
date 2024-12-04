package com.ecoride.service;

import com.ecoride.dao.BookingDAO;
import com.ecoride.model.Booking;

public class BookingService {
    private BookingDAO bookingDAO = new BookingDAO();

    public boolean bookVehicle(Booking booking) {
        return bookingDAO.saveBooking(booking);
    }
}
