package org.apache.tickets.objects;

/**
 * Created by bugg on 11/05/16.
 */
public interface Booking {
    void setStatus(String confirmed) throws Exception;
    public Long getId();

    public void setId(Long id);

    public String getCustomer();

    public void setCustomer(String customer);

    public String getFlight();

    public void setFlight(String flight);

    public String getStatus();

}
