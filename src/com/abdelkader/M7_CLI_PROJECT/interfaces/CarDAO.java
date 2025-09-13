package com.abdelkader.M7_CLI_PROJECT.interfaces;

import com.abdelkader.M7_CLI_PROJECT.model.Car;

public interface CarDAO {

    void deleteCar(Car car);

    Car[] selectAllCars();

    Car[] getAllAvailableCars();

    Car[] getAvailableElectricCars();

    Car findById(java.util.UUID id);


    //numberOfAvailableCars
    int numberOfAvailableCars();
    // remove car
    void removeCar(Car car);

    

}