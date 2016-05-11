package org.apache.tickets;


import org.apache.tickets.objects.Booking;

import java.util.List;

/**
 * Created by bugg on 10/05/16.
 */
public interface BookingStorage {

    Booking getBookingByID(Long id);

    List<? extends Booking> getAllBookings();

    Booking addBooking(Booking booking);

    void updateBooking(Booking booking);

    void deleteBooking(Long id);


}
