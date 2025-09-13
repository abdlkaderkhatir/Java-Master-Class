package com.abdelkader.M7_CLI_PROJECT.service;


import com.abdelkader.M7_CLI_PROJECT.dao.BookingArrayDataAccessService;
import com.abdelkader.M7_CLI_PROJECT.interfaces.CarDAO;
import com.abdelkader.M7_CLI_PROJECT.model.Booking;
import com.abdelkader.M7_CLI_PROJECT.model.Car;
import com.abdelkader.M7_CLI_PROJECT.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class BookingService {

    private final BookingArrayDataAccessService bookingArrayDataAccessService;
    private final UserService userService;
    private final CarService carService;

    public BookingService(BookingArrayDataAccessService bookingArrayDataAccessService, UserService userService,
                          CarService carService) {
        this.bookingArrayDataAccessService = bookingArrayDataAccessService;
        this.userService = userService;
        this.carService = carService;
    }

    public void addNewBooking(UUID bookingID, User user, Car car, boolean isCanceled) {
        bookingArrayDataAccessService.storeBooking(new Booking(bookingID, user, car, LocalDateTime.now(), isCanceled));
    }

    public List<Booking> getBookings() {
        return bookingArrayDataAccessService.selectAllBookings();
    }

    public int numberOfBookings() {
        return bookingArrayDataAccessService.getTotalBookings();
    }

    public void startBookingProcess(Scanner scanner) {
        var isBookingCar = true;
        var isSelectingUser = false;
        var isBooked = false;
        while (isBookingCar) {
            try {
                if(carService.numberOfAvailableCars() == 0) {
                    break;
                }
                carService.displayAllAvailableCarsMenu();
                System.out.println("-> Select car reg number (Press 7 to go back to previous menu) ");
                String carSelected = scanner.next();
                var carRegNumber = Integer.parseInt(carSelected);
                if (carRegNumber == 7) {
                    break;
                }
                for (Car car : carService.getCars()) {
                    if (car == null) {
                        continue;
                    }
                    if (carRegNumber == car.getRegNumber()) {
                        carRegNumber = car.getRegNumber();
                        isSelectingUser = true;
                        while (isSelectingUser) {
                            try {
                                userService.displaySelectUserIDMenu();
                                String userSelected = scanner.next().trim();
                                if (userSelected.equals("7".trim())) {
                                    isBooked = true;
                                    break;
                                }
                                UUID userID = UUID.fromString(userSelected);
                                for (User user : userService.getAllUsers()) {
                                    if (user.getId().equals(userID)) {
                                        UUID bookingID = UUID.randomUUID();
                                        addNewBooking(bookingID, user, car, false);
                                        carService.removeCar(car);
                                        System.out.println("\n\nSuccess! Booked car with reg number " + carRegNumber +
                                                " for user " + user);
                                        System.out.println("Booking reference: " + bookingID);
                                        car.setAvailable(false);
                                        isSelectingUser = false;
                                        isBookingCar = false;
                                        isBooked = true;
                                        break;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                System.out.println("\n\nYour input is invalid. Try again!\n\n");
                            }
                        }
                    }
                }
                if (!isBooked) {
                    System.out.println("\n\nYour input is invalid. Try again!\n\n");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("\n\nYour input is invalid. Try again!\n\n");
            }
        }
    }

    public void viewAllUserBookedCars(Scanner scanner) {
        var isSelectingUser = true;
        while(isSelectingUser) {
            try {
                userService.displaySelectUserIDMenu();
                String userSelected = scanner.next();
                if (userSelected.equals("7".trim())) {
                    break;
                }
                for (User user : userService.getAllUsers()) {
                    if (user == null) {
                        continue;
                    }
                    List<Booking> bookingsMadeByUser = new ArrayList<>();
                    var totalUserBookings = 0;
                    if (user.getId().equals(UUID.fromString(userSelected))) {
                        for (int i = 0; i < getBookings().size(); i++) {
                            if (getBookings().get(i).getUser().equals(user)) {
                                bookingsMadeByUser.add(getBookings().get(i));
                                totalUserBookings++;
                            }
                        }
                        isSelectingUser = false;
                        if (totalUserBookings == 0) {
                            System.out.println("\n\nNo cars have been booked by this user.\n\n");
                        } else {
                            System.out.println("\n\nBookings made by " + user + "\n\n");
                            for (Booking booking : bookingsMadeByUser) {
                                if (booking != null) {
                                    System.out.println(booking);
                                }
                            }
                        }
                        break;
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("\n\nYour input is invalid. You must enter a user ID.\n\n");
            }
        }
    }

    public void viewAllBookings() {
        if (numberOfBookings() == 0) {
            System.out.println("\n\nNo bookings have been made.");
        } else {
            displayAllBookings();
        }
    }

    public void displayAllBookings() {
        for (Booking booking : getBookings()) {
            if (booking == null) {
                break;
            }
            System.out.println(booking);
        }
    }
}
//
//public class BookingService {
//    private static int bookingIdCounter = 1;
//
//    // حجز سيارة
//    public  void bookCar(int customerId, int carId) {
////        User user = UserArrayDataAccessService.findById(customerId);
//        User user = null;
//        Car car = CarDao.findById(carId);
//
//        if (user == null || car == null) {
//            System.out.println("❌ Invalid user or car ID!");
//            return;
//        }
//
//        if (!car.isAvailable()) {
//            System.out.println("❌ Car is already booked!");
//            return;
//        }
//
//        car.setAvailable(false);
//        Booking booking = new Booking(bookingIdCounter++, user, car);
//        BookingDao.addBooking(booking);
//        System.out.println("✅ Booking successful: " + booking);
//    }
//
//    // عرض كل الحجوزات
//    public  void viewAllBookings() {
//        Booking[] bookings = BookingDao.getAllBookings();
//        System.out.println("\n=== All Bookings ===");
//        for (Booking b : bookings) {
//            if (b != null) {
//                System.out.println(b);
//            }
//        }
//    }
//
//    // عرض حجوزات مستخدم معيّن
//    public  void viewUserBookings(int customerId) {
//        Booking[] bookings = BookingDao.findByUserId(customerId);
//        System.out.println("\n=== Bookings for User ID " + customerId + " ===");
//        for (Booking b : bookings) {
//            if (b != null) {
//                System.out.println(b);
//            }
//        }
//    }
//}
