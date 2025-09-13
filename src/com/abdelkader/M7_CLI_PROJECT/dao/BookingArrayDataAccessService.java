package com.abdelkader.M7_CLI_PROJECT.dao;

import com.abdelkader.M7_CLI_PROJECT.interfaces.BookingDAO;
import com.abdelkader.M7_CLI_PROJECT.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingArrayDataAccessService  implements BookingDAO {
    private final List<Booking> bookings;
    private int totalBookings;

    public BookingArrayDataAccessService() {
        this.bookings = new ArrayList<>();
        this.totalBookings = 0;
    }

    public void storeBooking(Booking booking) {
        bookings.add(booking);
        totalBookings++;
    }

    public List<Booking> selectAllBookings() {
        return new ArrayList<>(bookings);
    }


    public int getTotalBookings() {
        return totalBookings;
    }
}
