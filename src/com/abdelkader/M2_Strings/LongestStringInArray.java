package com.abdelkader.M2_Strings;

public class LongestStringInArray {

    public static void main(String[] args) {
        String[] names = {"Abdelkader" , "Aboubakeur" , "kaddour" , "Houssem"};
        logestString(names);
    }

    public static String logestString(String[] names){
        int index = 0;
        int length = names[0].length();

        for (int i = 0; i < names.length; i++) {
           if (names[i].length() > length){
               index = i;
               length = names[i].length();
           }
        }
        System.out.println(names[index]);
        return names[index];
    }
}
