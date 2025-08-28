package com.abdelkader.M3_Date_Time;

import java.time.*;

public class WorkingWithDatesAndTime {
    public static void main(String[] args) {
        //the current date and time from currently my machine is running
        LocalDateTime now = LocalDateTime.now();

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());

        ///////////////////////////////////////


        System.out.println(time.getHour());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        //to create a date
        LocalDateTime someDate = LocalDateTime.of(
                2022,
                Month.JUNE,
                12,
                14,
                32
        );
        System.out.println(someDate);

        //get all available zones
        for(String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        //get the date and time of a specific zone
        System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));
        //current zone date and time
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());


    }
}
