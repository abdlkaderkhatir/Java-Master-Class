package com.abdelkader.M7_CLI_PROJECT.service;


import com.abdelkader.M7_CLI_PROJECT.dao.CarDao;
import com.abdelkader.M7_CLI_PROJECT.model.Car;

public class CarService {

    // إضافة سيارة جديدة
    public static void addCar(int id, String model, boolean electric) {
        Car car = new Car(id, model, electric);
        CarDao.addCar(car);
    }

    // عرض كل السيارات
    public static void viewAllCars() {
        Car[] cars = CarDao.getAllCars();
        System.out.println("\n=== All Cars ===");
        for (Car c : cars) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    // عرض السيارات المتوفرة
    public static void viewAvailableCars() {
        Car[] cars = CarDao.getAllCars();
        System.out.println("\n=== Available Cars ===");
        for (Car c : cars) {
            if (c != null && c.isAvailable()) {
                System.out.println(c);
            }
        }
    }

    // عرض السيارات الكهربائية المتوفرة
    public static void viewAvailableElectricCars() {
        Car[] cars = CarDao.getAllCars();
        System.out.println("\n=== Available Electric Cars ===");
        for (Car c : cars) {
            if (c != null && c.isAvailable() && c.isElectric()) {
                System.out.println(c);
            }
        }
    }

    // البحث عن سيارة
    public static Car getCarById(int id) {
        return CarDao.findById(id);
    }
}

