package com.abdelkader.M2_Arrays;

import java.util.Scanner;

public class PrintingEvenNumbersFromAnArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter 10 Numbers: ");
        Scanner scanner = new Scanner(System.in);
        readNumberFromScanner(numbers,scanner);
        printEvenNumbers(numbers);
    }

    public static void readNumberFromScanner(int[] numbers , Scanner scanner){
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
    }

    public static void printEvenNumbers(int[] numbers){
        System.out.println("Even numbers are: ");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0)
                System.out.print(numbers[i] + " ");
        }
    }


}
