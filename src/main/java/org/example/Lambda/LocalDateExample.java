package org.example.Lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateExample {

    public static void main(String[] args) {


        LocalDate d=LocalDate.now();

        System.out.println(d);
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate localDate = LocalDate.of(2022, Month.AUGUST, 30);
        System.out.println(localDate);
    }
}
