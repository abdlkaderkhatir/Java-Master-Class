package com.abdelkader.M0_JavaFundamentals;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class CalculateAgeOfAnyGivenDate {

    public static void main(String[] args) {

        int year,month,day;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth day: ");
        day = scanner.nextInt();

        System.out.println("Enter your birth month");
        month = scanner.nextInt();

        System.out.println("Enter your birth year");
        year = scanner.nextInt();

        String monthInString = switch (month){
            case 1 -> String.valueOf(Month.JANUARY);
            case 2 -> String.valueOf(Month.FEBRUARY);
            case 3 -> String.valueOf(Month.MARCH);
            case 4 -> String.valueOf(Month.APRIL);
            case 5 -> String.valueOf(Month.MAY);
            case 6 -> String.valueOf(Month.JUNE);
            case 7 -> String.valueOf(Month.JULY);
            case 8 -> String.valueOf(Month.AUGUST);
            case 9 -> String.valueOf(Month.SEPTEMBER);
            case 10 -> String.valueOf(Month.OCTOBER);
            case 11 -> String.valueOf(Month.NOVEMBER);
            case 12 -> String.valueOf(Month.DECEMBER);
            default -> String.valueOf(Month.valueOf("wrong entry"));
        };

        LocalDate userDate =  LocalDate.of(year, Month.valueOf(monthInString), day);

//        LocalDate userDate = LocalDate.of(year,month,day);

        age(userDate);

    }

    public static void age(LocalDate userDate){

        LocalDate localDate = LocalDate.now();

        Period period = Period.between(localDate , userDate);

        System.out.println("you have " + period.getYears() + " years, "
                + period.getMonths() + " months and "
                + period.getDays() + " days");
    }
}
