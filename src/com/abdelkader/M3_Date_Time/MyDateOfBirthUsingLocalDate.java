package com.abdelkader.M3_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateOfBirthUsingLocalDate {
    public static void main(String[] args) {
        LocalDate myBirthDate  = LocalDate.of(
                2000,
                03,
                22
        );

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        //print my birth date using LocalDate Method
        System.out.println(myBirthDate.format(dateTimeFormatter));
        //add 100 days to my birth date
        System.out.println(myBirthDate.plusDays(100));
    }
}
