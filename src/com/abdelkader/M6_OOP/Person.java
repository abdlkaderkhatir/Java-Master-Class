package com.abdelkader.M6_OOP;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String Name;
    private int age;
    private Address address;
    private Car[] cars;

    public Person(String name, int age, Address address, Car[] cars) {
        Name = name;
        this.age = age;
        this.address = address;
        this.cars = cars;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(Name, person.Name) && Objects.equals(address, person.address) && Arrays.equals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Name, age, address);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
