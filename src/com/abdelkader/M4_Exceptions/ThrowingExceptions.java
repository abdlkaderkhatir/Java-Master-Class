package com.abdelkader.M4_Exceptions;

import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) {
        anna();
//        foo(10,20);
    }

    // I can't throw a checked exception here, I need to use a try/catch block
    public static void foo(int a, int b) throws IOException {
        if(a == 0 || b == 0) throw new ArithmeticException("arguments can't be 0");
        System.out.println( a / b );
    }
    static void john() throws IOException{
//        try {
            foo(20, 0);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
    }
    static void jamila() throws IOException{
        john();
    }
    static void anna() {
        try {
            jamila();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("2 catch exception");
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }
    }
    // I have to handle this exception because it's a checked exception
    // Here each method is throwing the exception to the next one
    // to transfer the responsibility of handling the exception to another class
}
