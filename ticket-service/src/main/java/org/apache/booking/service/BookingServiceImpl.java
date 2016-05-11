package org.apache.booking.service;

import org.apache.tickets.BookingService;
import org.apache.tickets.BookingStorage;
import org.apache.tickets.objects.Booking;

import java.util.List;

/**
 * Created by bugg on 10/05/16.
 */
public class BookingServiceImpl implements BookingService {

    BookingStorage bookingStorage;

    public Booking addBooking(Booking booking) {
        booking = bookingStorage.addBooking(booking);
        return booking;
    }

    public void deleteBooking(Long id) {

        bookingStorage.deleteBooking(id);
    }

    public List<? extends Booking> listBookings() {
        return bookingStorage.getAllBookings();
    }

    public Booking get(Long id) {
        return bookingStorage.getBookingByID(id);
    }

    public void updateBooking(Booking booking) {
        bookingStorage.updateBooking(booking);
    }

    public void confirm(Long id) throws Exception {
        Booking booking = bookingStorage.getBookingByID(id);
        booking.setStatus("Confirmed");
        bookingStorage.updateBooking(booking);

    }

    public void cancel(Long id) throws Exception {
        Booking booking = bookingStorage.getBookingByID(id);
        booking.setStatus("Cancelled");
        bookingStorage.updateBooking(booking);

    }

    public void setBookingStorage(BookingStorage bookingStorage) {
        this.bookingStorage = bookingStorage;
    }
}
