package com.abdelkader.M6_OOP;

public class Main {

    public static void main(String[] args) {
        // we cant instantiate because we can know what type of animals
        // Animal animal = new Animal("foo");

        // but instead we can do like that
        Animal rosie = new Cat("Rosie");
        Animal fox = new Dog("Fox");
    }
}
