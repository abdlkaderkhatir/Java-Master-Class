package com.abdelkader.M1_Strings;

import java.util.Scanner;

public class CapitalizeFirstCharacterOfaString {


    public static void main(String[] args) {
        System.out.println("Please enter chaine");
        Scanner scanner = new Scanner(System.in);
        String  name = scanner.nextLine();

        System.out.println("la chaine" + capitelizeFirstChar(name));

    }

    public static String capitelizeFirstChar(String name){
        char firstLetter = Character.toUpperCase(name.charAt(0));
        char[] list = name.toCharArray();
        list[0] = firstLetter;
        return String.valueOf(list);
    }
}
