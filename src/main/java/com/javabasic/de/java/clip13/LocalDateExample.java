package com.javabasic.de.java.clip13;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(LocalDate.of(2022, 02, 20));
        System.out.println(LocalDate.parse("2022-02-20"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        DayOfWeek today = LocalDate.now().getDayOfWeek();
        System.out.println(today);

        int twelve = LocalDate.parse("2022-06-12").getDayOfMonth();
        System.out.println(twelve);

        System.out.println(LocalDate.now().isLeapYear());
        System.out.println("윤년? "+LocalDate.parse("2024-01-01").isLeapYear());

        System.out.println(LocalDate.parse("2022-06-12").isBefore(LocalDate.parse("2022-06-11")));
        System.out.println(LocalDate.parse("2022-06-11").isAfter(LocalDate.parse("2022-06-12")));

        LocalDateTime beginningOfDay = LocalDate.parse("2022-06-01").atStartOfDay();
        System.out.println(beginningOfDay);

        LocalDate firstDayOfMonth = LocalDate.parse("2022-06-01").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);

    }
}
