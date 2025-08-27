package com.abdelkader.M0_JavaFundamentals;

public class PrintArgumentsPassedToMainInCapitalLetters {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg.toUpperCase());
        }
    }
}
