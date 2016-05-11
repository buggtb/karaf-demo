package org.apache.rest;

import org.apache.tickets.objects.Booking;

import java.util.Random;

public class BookingImpl implements Booking {

    private Long id;
    private String customer;
    private String flight;
    private String status;

    public BookingImpl() {
    }

    public BookingImpl(String customer, String flight) throws Exception {
        this.id = new Random().nextLong();
        this.customer = customer;
        this.flight = flight;
        this.status = "WAITING";
    }

    public BookingImpl(String customer, String flight, String status) throws Exception {
        this.id = new Random().nextLong();
        this.customer = customer;
        this.flight = flight;
        if (!status.equalsIgnoreCase("waiting") && !status.equalsIgnoreCase("confirm") && !status.equalsIgnoreCase("cancel")) {
            throw new IllegalArgumentException("Invalid status value");
        }
        this.status = status;
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

    public void setStatus(String status) throws Exception {
        if (!status.equalsIgnoreCase("waiting") && !status.equalsIgnoreCase("confirm") && !status.equalsIgnoreCase("cancel")) {
            throw new IllegalArgumentException("Invalid status value");
        }
        this.status = status;
    }

}