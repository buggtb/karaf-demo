package org.apache.tickets;


import org.apache.tickets.objects.Booking;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by bugg on 10/05/16.
 */
@Path("/booking")
public interface BookingRest {

    @POST
    @Produces("application/json")
    Response createBooking(Booking booking);

    @PUT
    Response updateBooking(Booking booking);

    @DELETE
    @Path("/{id}")
    Response deleteBooking(@PathParam("id") Long id);

    @GET
    @Produces("application/json")
    Response getBookings();

    @GET
    @Path("/{id}")
    @Produces("application/json")
    Response getBooking(@PathParam("id") Long id);

    @GET
    @Path("/{id}/confirm")
    Response confirmBooking(@PathParam("id") Long id);

    @GET
    @Path("/{id}/cancel")
    Response cancelBooking(@PathParam("id") Long id);
}
