package com.rahwanjiomar.bookingservice.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private long id;
    private String fromCity;
    private String toCity;
    private Date dateTime;
    String grade;
    boolean isTwoWay;
    long bookingId;
}
