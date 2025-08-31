package com.abdelkader.M6_OOP;

import java.math.BigDecimal;

public class WorkingWithBigDecimal {
    public static void main(String[] args) {
        //instead of using double which has a precision problem
        double number1 = 0.03;
        double number2 = 0.04;
        double number3 = number2 - number1;

        System.out.println(number3);

        //we use BigDecimal Class
        BigDecimal num1 = new BigDecimal("0.03");
        BigDecimal num2 = new BigDecimal("0.04");
        System.out.println(num2.subtract(num1));
        System.out.println(num2.add(num1));
        //to find if they are equal, if equal it returns 0
        //if larger it returns 1, if smaller it returns -1
        System.out.println(num2.compareTo(BigDecimal.TEN));
        System.out.println(num2.compareTo(BigDecimal.ZERO));
        //to find which is larger
        System.out.println(num2.max(BigDecimal.TEN));
    }
}
