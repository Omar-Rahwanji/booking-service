package com.rahwanjiomar.bookingservice.api.service;

import com.rahwanjiomar.bookingservice.api.entity.Booking;
import com.rahwanjiomar.bookingservice.api.repository.BookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookingService {

    private BookingRepository bookingRepository;

    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }
}
