package com.example.demo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateService {

    public LocalTime getTime(){
        return LocalTime.now();
    }

    public String getDate(String format){
        LocalDate localDate = LocalDate.now();
        if(format != null){
            //Datum in einem bestimmten Format zurückgeben
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
            return dtf.format(localDate);
        }
        return localDate.toString();
    }
}
