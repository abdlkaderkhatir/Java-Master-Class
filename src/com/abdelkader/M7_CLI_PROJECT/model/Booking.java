package com.abdelkader.M7_CLI_PROJECT.model;

// model/Booking.java
public class Booking {
    private int id;
    private Customer customer;
    private Car car;

    public Booking(int id, Customer customer, Car car) {
        this.id = id;
        this.customer = customer;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking{id=" + id + ", customer=" + customer.getName() +
                ", car=" + car.getModel() + "}";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
