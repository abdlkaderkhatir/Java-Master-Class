package com.amigoscode.M0_JavaFundamentals;

import java.util.Scanner;

public class ReturningNegativeOfaNumber {

    public static void main(String[] args) {
        System.out.println("Enter the NUmber You want to get the Negative of: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("negative of " + number +  " is " + negative(number));
    }


    public static int negative(int num){
        return  num - (2 * num);
    }
}
