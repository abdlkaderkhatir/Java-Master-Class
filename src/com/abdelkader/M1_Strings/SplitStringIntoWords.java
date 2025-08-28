package com.abdelkader.M1_Strings;

import java.util.Scanner;

public class SplitStringIntoWords {

    public static void main(String[] args) {
        //create a method to split a sentence into separate words
        System.out.println("please enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        words(sentence);
    }
    public static void words(String sentence){
        String[] words = sentence.split(" ");
        for (String word : words)
            System.out.print(word + ", ");
    }
}
