package org.apache.booking.persistence;

import org.apache.tickets.BookingStorage;
import org.apache.booking.persistence.objects.BookingImpl;
import org.apache.tickets.objects.Booking;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;
import org.ops4j.pax.cdi.api.Properties;
import org.ops4j.pax.cdi.api.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by bugg on 10/05/16.
 */
@OsgiServiceProvider(classes = { BookingStorage.class })
@Properties({
        @Property(name = "service.exported.interfaces", value = "*")
})
@Singleton
@Transactional
public class BookingPersistence implements BookingStorage {

    @PersistenceContext(unitName = "systemdbunit")
    EntityManager em;

    List<Booking> bookings = new ArrayList<Booking>();

    @Override
    @Transactional(Transactional.TxType.SUPPORTS)
    public Booking getBookingByID(Long id) {
        //BookingImpl booking = em.find(BookingImpl.class, id);
        Booking booking = null;
        try {
            booking = new BookingImpl();
            return booking;
        } catch (Exception e) {
            e.printStackTrace();
        }
return null;
    }

    public List<? extends Booking> getAllBookings() {
        //CriteriaQuery<BookingImpl> query = em.getCriteriaBuilder().createQuery(BookingImpl.class);
        //List<? extends BookingImpl> list = em.createQuery(query.select(query.from(BookingImpl.class))).getResultList();

        return bookings;
    }

    public Booking addBooking(Booking booking) {
        System.out.println("persisting");
        //BookingImpl mybooking = (BookingImpl) booking;
        //mybooking.setId(new Random().nextLong());
        //em.persist(mybooking);
        //em.flush();
        this.bookings.add(booking);
        System.out.println("persisted");
        return booking;
    }

    public void updateBooking(Booking booking) {
        em.merge(booking);
    }

    public void deleteBooking(Long id) {
        em.remove(getBookingByID(id));
    }
}
