/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airticketserver.model;

import java.util.Date;


/**
 *
 * @author teta
 */

public class Ticket implements java.io.Serializable{
    
    private String ticketNumber;
    private String destination;
    private Date flightDate;
    private String clientId;

    public Ticket() {
    }

    public Ticket(String ticketNumber, String destination, Date flightDate, String clientId) {
        this.ticketNumber = ticketNumber;
        this.destination = destination;
        this.flightDate = flightDate;
        this.clientId = clientId;
    }


    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    
}
