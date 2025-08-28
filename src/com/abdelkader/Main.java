package com.abdelkader;

import com.abdelkader.M2_Arrays.ArraysOperations;
import com.abdelkader.M3_Date_Time.Cat;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
//        int age = 21;
//        Point point_a = new Point(10,20);
//        // Arrays
//        int [] numbers = new int[3];
//        int[] colors = {1,2,3,4};
//
//        String a = "hhh";
//
//
//
//        numbers[0]= 1;
//        numbers[2]=2;
//        numbers[1]=0;
//
//
//        Boolean isAdult = age >= 16;
//
//        int x = 0;


//        Foo f = new Foo();
//
//
//        Foo.incrementFoo();
//        Foo.incrementFoo();
//        Foo.incrementFoo();
//
//        f.incrementNumber();
//
//
//        System.out.println("static foo :"+ Foo.foo);
//        System.out.println("nromal :" + f.number);
//
//
//        Foo f2 = new Foo();
//
//        System.out.println("static foo :"+ Foo.foo);
//        System.out.println("nromal :" + f2.number);

//        int[] numbers_2 = {1,3,4,567,7,8};
//
//
//        for (int n : numbers_2) {
//            if (n == 4){
//                break;
//            }
//            System.out.println(n);
//        }



        System.out.println("Time Now : " +   ZonedDateTime.now());

        System.out.println("Time in Cuiaba : " + LocalDateTime.now(ZoneId.of("America/Cuiaba")));
//        for ( String zone : ZoneId.getAvailableZoneIds()) {
//            System.out.println(zone);
//        }

//        try {
//            WorkingWithFiles.main(args);
//            int number = Integer.parseInt("1");
//
//            for (int i = 10; i >= 0 ; i--) {
//                System.out.println(10/i);
//            }
//        }catch (Exception e ){
//            System.out.println(e.getMessage());
//        }




//        Cat rose1 = new Cat("rose");
        Cat rose2 = new Cat("rose");
        Cat rose1 = rose2;

        rose2.setName("star");
        String name2 = "jamila";
        String name = name2;
        name2 = "ahmed";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(rose1.getName());


        ArraysOperations.main(args);



//        System.out.println(x);
//        System.out.println(x);
//
//        Arrays.fill(numbers, -1);
//
//        System.out.println(Arrays.toString(numbers));
//
//        for (int i =0 ; i <= 10 ; i++){
//            System.out.println("Hello " + i);
//            System.out.println("Hello " + i);
//        }

//        System.out.println("Hello world!");
//        System.out.println("Hi");

//        CalculateAgeOfAnyGivenDate.main(args);
//          PrintArgumentsPassedToMainInCapitalLetters.main(args);

//          ReturningNegativeOfaNumber.main(args);
//            SumOfProgramArguments.main(args);
        
    }
}