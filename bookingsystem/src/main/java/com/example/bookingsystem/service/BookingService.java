package com.example.bookingsystem.service;

import com.example.bookingsystem.model.Booking;

import java.util.List;

public interface BookingService {
    public Booking saveBooking(Booking booking);

    public List<Booking> getBookings();
}
