package com.rahwanjiomar.bookingservice.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staying {
    private long id;
    private String city;
    private Date fromDate;
    private Date toDate;
    String grade;
    long bookingId;
}
