package com.abdelkader.M7_CLI_PROJECT.service;


import com.abdelkader.M7_CLI_PROJECT.dao.CarArrayDataAccessService;
import com.abdelkader.M7_CLI_PROJECT.interfaces.CarDAO;
import com.abdelkader.M7_CLI_PROJECT.model.Car;

import java.util.UUID;

public class CarService {

    private CarArrayDataAccessService carArrayDataAccessService;

    public CarService(CarArrayDataAccessService carArrayDataAccessService){

        this.carArrayDataAccessService = carArrayDataAccessService;
    }

    // إضافة سيارة جديدة
//    public static void addCar(Car car) {
//
//        carArrayDataAccessService.addCar(car);
//    }

    // عرض كل السيارات
    public  void viewAllCars() {
        Car[] cars = carArrayDataAccessService.selectAllCars();
        System.out.println("\n=== All Cars ===");
        for (Car c : cars) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    // عرض السيارات المتوفرة
    public  void viewAvailableCars() {
        Car[] cars = carArrayDataAccessService.getAllAvailableCars();
        System.out.println("\n=== Available Cars ===");
        for (Car c : cars) {
                System.out.println(c);
        }
    }

    // عرض السيارات الكهربائية المتوفرة
    public  void viewAvailableElectricCars() {
        Car[] cars = carArrayDataAccessService.getAvailableElectricCars();
        System.out.println("\n=== Available Electric Cars ===");
        for (Car c : cars) {
                System.out.println(c);
        }
    }

    // البحث عن سيارة
    public  Car getCarById(UUID id) {
        return carArrayDataAccessService.findById(id);
    }


    // numberOfAvailableCars
    public int numberOfAvailableCars() {
        return carArrayDataAccessService.numberOfAvailableCars();
    }


    // displayAllAvailableCarsMenu
    public void displayAllAvailableCarsMenu() {
        Car[] cars = carArrayDataAccessService.getAllAvailableCars();
        System.out.println("\n=== Select Car ID ===");
        for (Car c : cars) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }


    // getCars
    public Car[] getCars() {
        return carArrayDataAccessService.selectAllCars();
    }

    // removeCar
    public void removeCar(Car car) {
        carArrayDataAccessService.removeCar(car);
    }
}

