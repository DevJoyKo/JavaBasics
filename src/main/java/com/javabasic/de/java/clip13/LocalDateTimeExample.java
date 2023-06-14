package com.javabasic.de.java.clip13;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args){
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2022, Month.APRIL, 20, 6, 30));
        System.out.println(LocalDateTime.parse("2022-08-14T23:06:35.648"));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plusDays(1));
        System.out.println(localDateTime.minusHours(1));
        System.out.println(localDateTime.of(2022, Month.DECEMBER, 20, 6, 30).plusMonths(1));

    }
}
