package com.abdelkader.M7_CLI_PROJECT.service;


import com.abdelkader.M7_CLI_PROJECT.dao.BookingDao;
import com.abdelkader.M7_CLI_PROJECT.dao.CarDao;
import com.abdelkader.M7_CLI_PROJECT.dao.CustomerDao;
import com.abdelkader.M7_CLI_PROJECT.model.Booking;
import com.abdelkader.M7_CLI_PROJECT.model.Car;
import com.abdelkader.M7_CLI_PROJECT.model.Customer;

public class BookingService {
    private static int bookingIdCounter = 1;

    // حجز سيارة
    public static void bookCar(int customerId, int carId) {
        Customer customer = CustomerDao.findById(customerId);
        Car car = CarDao.findById(carId);

        if (customer == null || car == null) {
            System.out.println("❌ Invalid user or car ID!");
            return;
        }

        if (!car.isAvailable()) {
            System.out.println("❌ Car is already booked!");
            return;
        }

        car.setAvailable(false);
        Booking booking = new Booking(bookingIdCounter++, customer, car);
        BookingDao.addBooking(booking);
        System.out.println("✅ Booking successful: " + booking);
    }

    // عرض كل الحجوزات
    public static void viewAllBookings() {
        Booking[] bookings = BookingDao.getAllBookings();
        System.out.println("\n=== All Bookings ===");
        for (Booking b : bookings) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }

    // عرض حجوزات مستخدم معيّن
    public static void viewUserBookings(int customerId) {
        Booking[] bookings = BookingDao.findByCustomerId(customerId);
        System.out.println("\n=== Bookings for User ID " + customerId + " ===");
        for (Booking b : bookings) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }
}
