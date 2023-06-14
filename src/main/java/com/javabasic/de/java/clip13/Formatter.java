package com.javabasic.de.java.clip13;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatter {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.APRIL, 25, 6, 30);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        System.out.println(localDateTime.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.KOREA)));

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
