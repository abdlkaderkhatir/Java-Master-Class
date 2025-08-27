package com.abdelkader.M2_Strings;

public class RemoveStringSpaces {

    public static void main(String[] args) {
        String name = "  Abdel   Kader   Khatir  ";

        String result = name.replaceAll("\\s+", "");

        System.out.println(result); // AbdelKaderKhatir
    }
}
