package com.javabasic.de.java.clip13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class Compatibility {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()));
        System.out.println(LocalDateTime.ofInstant(Calendar.getInstance().toInstant(), ZoneId.systemDefault()));

        System.out.println(Date.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)));
    }
}
