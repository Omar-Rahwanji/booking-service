package com.rahwanjiomar.bookingservice.api.controller;

import com.rahwanjiomar.bookingservice.api.entity.Booking;
import com.rahwanjiomar.bookingservice.api.service.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@AllArgsConstructor
public class BookingController {

    private BookingService bookingService;

    @PostMapping("/book")
    private Booking book(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }

//    @PostMapping("/flight")
//    private Booking bookFlight(@RequestBody BookingRequest bookingRequest) {
//
//    }
}
