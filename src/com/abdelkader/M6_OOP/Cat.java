package com.abdelkader.M6_OOP;

public class Cat extends  Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaaaaw");
    }
}
