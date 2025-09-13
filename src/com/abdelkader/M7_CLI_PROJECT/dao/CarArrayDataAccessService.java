package com.abdelkader.M7_CLI_PROJECT.dao;

import com.abdelkader.M7_CLI_PROJECT.interfaces.CarDAO;
import com.abdelkader.M7_CLI_PROJECT.model.Car;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
 

public class CarArrayDataAccessService implements CarDAO {

    private final List<Car> cars;
    private int availableCars;
    private int availableElectricCars;

    public CarArrayDataAccessService() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car(1234, UUID.fromString("95231e5f-6069-4939-b647-97917211995b"), new BigDecimal("45.00"), "TOYOTA", false, true));
        this.cars.add(new Car(1234, UUID.fromString("95231e5f-6069-4939-b647-97917211995b"), new BigDecimal("45.00"), "TOYOTA", false, true));
        this.cars.add(new Car(5555, UUID.fromString("4b9b59b7-28dd-4e9e-9d02-f565a39664cd"), new BigDecimal("90.00"), "TESLA", true, true));
        this.cars.add(new Car(6789, UUID.fromString("0f0c4660-2a78-4014-a782-123de26d5276"), new BigDecimal("65.00"), "MERCEDES", false, true));
        this.cars.add(new Car(3434, UUID.fromString("6b7e1e37-ccf3-417d-9c73-1f9bec2d6bd7"), new BigDecimal("120.00"), "NISSAN", true, true));
        this.cars.add(new Car(9999, UUID.fromString("afff42d5-0590-4166-9d27-15109cf98681"), new BigDecimal("87.00"), "HONDA", false, true));
        availableCars = cars.size();
        availableElectricCars = 2;
    }

    @Override
    public void deleteCar(Car car) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) == car) {
                cars.set(i, null);
                if (car.isElectric()) {
                    availableElectricCars--;
                }
                availableCars--;
            }
        }
    }

    @Override
    public List<Car> selectAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getAllAvailableCars() {
        List<Car> availableCars = new ArrayList<>(this.availableCars);
        for (Car car : cars) {
            if (car != null) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    @Override
    public List<Car> getAvailableElectricCars() {
        List<Car> availableElectricCars = new ArrayList<>(this.availableElectricCars);
        for (Car car : cars) {
            if (car != null && car.isElectric()) {
                availableElectricCars.add(car);
            }
        }
        return availableElectricCars;
    }


    @Override
    public Car findById(UUID id) {
        for (Car car : cars) {
            if (car != null && car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }


    @Override
    public void removeCar(Car car) {
        deleteCar(car);
    }


    @Override
    public int numberOfAvailableCars() {
        return availableCars;
    }
}