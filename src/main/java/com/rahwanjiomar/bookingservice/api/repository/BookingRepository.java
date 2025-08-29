package com.rahwanjiomar.bookingservice.api.repository;

import com.rahwanjiomar.bookingservice.api.entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {

}
