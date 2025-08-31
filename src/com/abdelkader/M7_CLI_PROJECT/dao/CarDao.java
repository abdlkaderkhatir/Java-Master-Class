package com.abdelkader.M7_CLI_PROJECT.dao;

import com.abdelkader.M7_CLI_PROJECT.model.Car;

public class CarDao {
    private static Car[] cars = new Car[10];
    private static int index = 0;

    public static void addCar(Car car) {

        cars[index++] = car;
    }

    public static Car[] getAllCars() {

        return cars;
    }

    public static Car findById(int id) {
        for (Car c : cars) {
            if (c != null && c.getId() == id) return c;
        }
        return null;
    }
}
