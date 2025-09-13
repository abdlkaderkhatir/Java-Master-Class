//package com.abdelkader.M7_CLI_PROJECT.dao;
//
//
//import com.abdelkader.M7_CLI_PROJECT.model.Booking;
//
//import java.util.UUID;
//
//public class BookingDao {
//    private static Booking[] bookings = new Booking[20];
//    private static int index = 0;
//
//    // إضافة حجز جديد
//    public static void addBooking(Booking booking) {
//        bookings[index++] = booking;
//    }
//
//    // جلب كل الحجوزات
//    public static Booking[] getAllBookings() {
//        return bookings;
//    }
//
//    // البحث عن حجوزات مستخدم معين
//    public static Booking[] findByUserId(int customerId) {
//        Booking[] result = new Booking[20];
//        int i = 0;
//        for (Booking b : bookings) {
//            if (b != null && b.getUser().getId() == customerId) {
//                result[i++] = b;
//            }
//        }
//        return result;
//    }
//}
