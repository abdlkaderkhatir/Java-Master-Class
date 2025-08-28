package com.abdelkader.M2_Arrays;

import java.util.Arrays;

public class ArraysOperations {

    public static void main(String[] args) {
        // declare and initialize a String array which holds the values "a", "b", "c" and "d"
        // print the array to the console
        String[] chars1 = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(chars1));
        // using your answer above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare
        String[] chars2 = chars1;
        chars2[0] = "z";
        System.out.println("1st array: " + Arrays.toString(chars1));
        System.out.println("2st array: " + Arrays.toString(chars2));
        // using your answer, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare
        System.out.println("===============================");
        String[] chars3 = Arrays.copyOf(chars1, chars1.length);
        chars3[0] = "y";
        System.out.println("1st array: " + Arrays.toString(chars1));
        System.out.println("3st array: " + Arrays.toString(chars3));
    }
}
