package com.example.bookingsystem.controller;


import com.example.bookingsystem.model.Booking;
import com.example.bookingsystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;


    @PostMapping("/add")
    public String add(@RequestBody Booking booking){
        bookingService.saveBooking(booking);

        return "Booking Confirmed";
    }

    @GetMapping("/getAll")
    public List<Booking> getAllBookings(){
        return bookingService.getBookings();
    }
}
