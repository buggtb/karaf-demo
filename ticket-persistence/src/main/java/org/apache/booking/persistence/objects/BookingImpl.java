package org.apache.booking.persistence.objects;

import org.apache.tickets.objects.Booking;

import javax.persistence.*;

@Entity(name = "BOOKING")
@Table(name = "BOOKING")
public class BookingImpl implements Booking {

    @Id
    //@Column(nullable = false)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column
    public String customer;
    @Column
    public String flight;
    @Column
    public String status;

    public BookingImpl() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getStatus() {
        return status;
    }

    public Booking convert() {
        return null;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}