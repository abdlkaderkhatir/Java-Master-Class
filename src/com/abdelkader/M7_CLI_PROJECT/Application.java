package com.abdelkader.M7_CLI_PROJECT;

import com.abdelkader.M7_CLI_PROJECT.service.BookingService;
import com.abdelkader.M7_CLI_PROJECT.service.CarService;
import com.abdelkader.M7_CLI_PROJECT.service.CustomerService;

import java.util.Scanner;

public class Application {

    // ===== Data Store (Arrays) =====
//    static Car[] cars = new Car[10];
//    static Customer[] customers = new Customer[10];
//    static Booking[] bookings = new Booking[20];

    static int carCount = 0, customerCount = 0, bookingCount = 0;

    // ===== Utility Methods =====
    static void seedData() {
//        Car toyota_corolla = new Car(1, "Toyota Corolla", false);
//        Car bmw_i3 = new Car(2, "BMW i3", true);
//        Car tesla_model_3 = new Car(3, "Tesla Model 3", true);
//        Car hyundai_elantra = new Car(4, "Hyundai Elantra", false);

        CarService.addCar(1,"Toyota Corolla" , false);
        CarService.addCar(2,"BMW i3" , true);
        CarService.addCar(3,"Tesla Model 3" , true);
        CarService.addCar(4, "Hyundai Elantra" , false);

//        customers[customerCount++] = new Customer(1, "Ahmed");
//        customers[customerCount++] = new Customer(2, "Sara");

        CustomerService.addCustomer(1,"Abdelkader");
        CustomerService.addCustomer(2,"Sara");
    }

    static void showAvailableCars(boolean onlyElectric) {
//        System.out.println("\n=== Available Cars " + (onlyElectric ? "(Electric)" : "") + " ===");
//        for (Car c : cars) {
//            if (c != null && c.available && (!onlyElectric || c.electric)) {
//                System.out.println(c);
//            }
//        }
        if (onlyElectric){
            CarService.viewAvailableElectricCars();
        }else{
            CarService.viewAvailableCars();
        }
    }

    static void viewAllUsers() {
//        System.out.println("\n=== All Users ===");
//        for (Customer c : customers) {
//            if (c != null) System.out.println(c);
//        }
        CustomerService.viewAllCustomers();
    }

    static void viewAllBookings() {
//        System.out.println("\n=== All Bookings ===");
//        for (Booking b : bookings) {
//            if (b != null) System.out.println(b);
//        }
        BookingService.viewAllBookings();
    }

    static void listUserBookings(int userId) {
//        System.out.println("\n=== Bookings for User " + userId + " ===");
//        for (Booking b : bookings) {
//            if (b != null && b.customer.id == userId) {
//                System.out.println(b);
//            }
//        }

        BookingService.viewUserBookings(userId);
    }

    static void bookCar(int userId, int carId) {
//        Customer customer = null;
//        Car car = null;
//
//        for (Customer c : customers) {
//            if (c != null && c.id == userId) customer = c;
//        }
//        for (Car c : cars) {
//            if (c != null && c.id == carId) car = c;
//        }
//
//        if (customer == null || car == null) {
//            System.out.println("❌ Invalid user or car ID!");
//            return;
//        }
//        if (!car.available) {
//            System.out.println("❌ Car already booked!");
//            return;
//        }
//
//        car.available = false;
//        bookings[bookingCount++] = new Booking(bookingCount + 1, customer, car);
//        System.out.println("✅ Booking successful!");
        BookingService.bookCar(userId, carId);
    }




    public static void main(String[] args) {

        seedData();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Car Booking System =====");
            System.out.println("1. Book car");
            System.out.println("2. List user booked cars");
            System.out.println("3. View all bookings");
            System.out.println("4. Available cars");
            System.out.println("5. Available electric cars");
            System.out.println("6. View all users");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewAllUsers();
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    showAvailableCars(false);
                    System.out.print("Enter Car ID: ");
                    int cid = sc.nextInt();
                    bookCar(uid, cid);
                    break;

                case 2:
                    viewAllUsers();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    listUserBookings(userId);
                    break;

                case 3:
                    viewAllBookings();
                    break;

                case 4:
                    showAvailableCars(false);
                    break;

                case 5:
                    showAvailableCars(true);
                    break;

                case 6:
                    viewAllUsers();
                    break;

                case 7:
                    System.out.println("👋 Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}
