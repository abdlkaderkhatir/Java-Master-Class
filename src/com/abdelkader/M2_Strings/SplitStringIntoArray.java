package com.abdelkader.M2_Strings;

public class SplitStringIntoArray {

    public static void main(String[] args) {
        String nums = "0.90, 1.00, 9.00, 8.78, 0.01";
        double sum = 0;
        String[] numbers = nums.split(", ");
        for(String i : numbers){
            sum += Double.valueOf(i);
        }
        System.out.println("total = " + sum);
    }
}
