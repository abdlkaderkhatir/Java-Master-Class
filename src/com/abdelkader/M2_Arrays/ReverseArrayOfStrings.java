package com.abdelkader.M2_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        String[] words = new String[4];
        words[0] = "hello";
        words[1] = "world";
        words[2] = "Abdelkader";
        words[3] = "ayman";
        System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length; i++)
            words[i] = words[i].toUpperCase();
        System.out.println(Arrays.toString(words));

        reverse(words);

    }

    public static String[] reverse(String[] words){
        for(int i = 0, j = words.length - 1; i < j; i++, j--){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(words));
        return words;
    }
}
