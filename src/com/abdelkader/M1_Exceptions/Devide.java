package com.abdelkader.M1_Exceptions;

public class Devide {

    public static void main(String[] args) {
        try {
             double number = devide(10 , 0);
             System.out.println(number);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double devide (double a , double b) throws MyCheckedException{
        if (b == 0) {
            throw new MyCheckedException("can not devide by zero");
        }
        return a / b;
    }
}