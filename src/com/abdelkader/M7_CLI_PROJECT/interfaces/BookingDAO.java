package com.abdelkader.M7_CLI_PROJECT.interfaces;

import com.abdelkader.M7_CLI_PROJECT.model.Booking;

import java.util.List;

public interface BookingDAO {

    void storeBooking(Booking booking);

   List<Booking> selectAllBookings();

    int getTotalBookings();
}
