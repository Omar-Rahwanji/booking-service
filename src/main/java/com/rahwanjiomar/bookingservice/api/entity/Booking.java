package com.rahwanjiomar.bookingservice.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "BOOKING_TB")
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
//    @GeneratedValue
    long id;
}

