package org.apache.rest;

import org.apache.tickets.BookingRest;
import org.apache.tickets.BookingService;
import org.apache.tickets.objects.Booking;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by bugg on 10/05/16.
 */
public class BookingEndpointsImpl implements BookingRest {

    BookingService bookingService;

    public Response createBooking(Booking booking) {
        Booking finishedbooking = bookingService.addBooking(booking);
        return Response.ok(finishedbooking).build();
    }

    public Response updateBooking(Booking booking) {
        bookingService.updateBooking(booking);
        return Response.ok().build();
    }

    public Response deleteBooking(Long id) {
        bookingService.deleteBooking(id);
        return Response.ok().build();
    }

    public Response getBookings() {
        List<? extends Booking> bookings = bookingService.listBookings();
        return Response.ok(bookings).build();
    }

    public Response getBooking(Long id) {
        Booking booking = bookingService.get(id);
        return Response.ok(booking).build();
    }

    public Response confirmBooking(Long id) {
        try {
            bookingService.confirm(id);
            return Response.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }

    public Response cancelBooking(Long id) {
        try {
            bookingService.cancel(id);
            return Response.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }

    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }
}
