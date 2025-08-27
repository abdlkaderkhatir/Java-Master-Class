package com.abdelkader.M2_Strings;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Jamila";
        String name1 = new String("Jamila");
        String name2 = "Ahmed";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(" names   ".trim());
        System.out.println("  ".isBlank());
        System.out.println("  ".isEmpty());
        System.out.println(name.substring(1,4));
        System.out.println(name.replace("J", "G"));
        System.out.println(name.concat(" " + name2));
        System.out.println(name + " " + name2);
        System.out.println(name == name1);
        System.out.println(name1.equals(name));
        String[] names = {"ahmed", "mohamed", "aya", "jana"};
        String namesJoined = String.join(", ", names);
        System.out.println(namesJoined);
    }
}
