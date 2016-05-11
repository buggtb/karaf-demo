package org.apache.tickets;


import org.apache.tickets.objects.Booking;

import java.util.List;

/**
 * Created by bugg on 10/05/16.
 */
public interface BookingService {

    Booking addBooking(Booking booking);

    void deleteBooking(Long id);

    List<? extends Booking> listBookings();

    Booking get(Long id);

    void updateBooking(Booking booking);

    void confirm(Long id) throws Exception;

    void cancel(Long id) throws Exception;


}
