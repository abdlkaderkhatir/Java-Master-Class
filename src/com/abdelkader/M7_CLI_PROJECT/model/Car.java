package com.abdelkader.M7_CLI_PROJECT.model;

// model/Car.java
public class Car {
    int id;
    String model;
    boolean electric;
    boolean available = true;

    public Car(int id, String model, boolean electric) {
        this.id = id;
        this.model = model;
        this.electric = electric;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return id + " - " + model + " (" + (electric ? "Electric" : "Fuel") + ") - " +
                (available ? "Available" : "Booked");
    }
}
