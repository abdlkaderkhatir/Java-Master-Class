package com.abdelkader.M4_Exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            int num = Integer.parseInt("1s");

        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("catch all exceptions");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally always running");
        }
        //catch (NumberFormatException e){System.out.println("input can't be 1s");}
        try{
            File newFile = new File("src/zoz.txt");
            if(!newFile.exists()){
                newFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("file is now created " + e.getMessage());
        }
    }
}
