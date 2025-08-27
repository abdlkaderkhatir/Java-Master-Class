package com.abdelkader.M0_JavaFundamentals;

import java.util.Arrays;

public class SumOfProgramArguments {

    public static void main(String[] args) {
        int sum = 0 , index = 0;
        String[] nonNumberArgs = new String[100];
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                sum += number;
            } catch (NumberFormatException e){
              nonNumberArgs[index] = arg;
              index++;
            }
        }

        System.out.println(sum);
        System.out.println(Arrays.toString(nonNumberArgs));
        for (int i = 0; i < nonNumberArgs.length; i++) {
            System.out.println(nonNumberArgs[index]);
        }
    }
}
