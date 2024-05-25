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

public class Client  implements java.io.Serializable{
    
    private String clientId;
    private String fullname;
    private String passportNumber;
    private String phoneNumber;
    

    public Client() {
    }

    public Client(String clientId, String fullname, String passportNumber, String phoneNumber) {
        this.clientId = clientId;
        this.fullname = fullname;
        this.passportNumber = passportNumber;
        this.phoneNumber = phoneNumber;
    }

   
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    
    
}
