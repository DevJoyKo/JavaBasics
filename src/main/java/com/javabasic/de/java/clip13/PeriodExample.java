package com.javabasic.de.java.clip13;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args){
        LocalDate initialDate = LocalDate.of(2022, 7, 10);
//        LocalDate finalDate = LocalDate.of(2022, 8, 10);
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println("between 7/10~8/10 " + Period.between(initialDate, finalDate).getDays());

        System.out.println(ChronoUnit.DAYS.between(initialDate, finalDate));
    }
}
