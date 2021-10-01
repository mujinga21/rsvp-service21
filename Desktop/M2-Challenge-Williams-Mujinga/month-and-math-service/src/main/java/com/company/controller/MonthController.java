package com.company.controller;


import com.company.models.Month;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {


    private static Month[] months= {

           new Month(1, "January"),
           new Month(2, "February"),
           new Month(3, "March"),
           new Month(4, "April"),
           new Month(5, "May"),
           new Month(6, "June"),
           new Month(7, "July"),
           new Month(8, "August"),
           new Month(9, "September"),
           new Month(10, "October"),
           new Month(11, "November"),
           new Month(12, "December")

   };
    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public int month(@PathVariable int monthNumber) {
        if (monthNumber <= 1 || monthNumber >= 12) {
            throw new IllegalArgumentException("MonthNumber must be between 1 and 12.");
        }

        return monthNumber;
    }

@RequestMapping(value = "/month", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)

    public Month getMonth() {
    Random randomMonth = new Random();
    return months[randomMonth.nextInt(12)];
}
    }











