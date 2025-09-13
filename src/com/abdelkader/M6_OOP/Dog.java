package com.abdelkader.M6_OOP;

public class Dog extends  Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("woff woff");
    }
}
