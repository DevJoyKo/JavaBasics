package com.javabasic.de.java.clip13;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args){
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId);

        System.out.println(zoneId);
        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        System.out.println(ZonedDateTime.parse("2023-06-14T20:11:13.406+02:00[Europe/Paris]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);

    }
}
