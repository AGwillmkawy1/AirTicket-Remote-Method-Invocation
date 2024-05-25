/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airticketserver.service;

import com.airticketserver.model.Client;
import com.airticketserver.model.Ticket;
import com.airticketserver.util.HibernateUtil;
import java.rmi.*;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 * @author Plaubert
 */
public interface ServiceIFC extends Remote{
    
    public void saveTicket(Ticket tick) throws RemoteException;
    
    public List<Ticket> listTicket() throws RemoteException;
    
    public void saveClient(Client client)throws RemoteException;
    public void deleteClient(Client client)throws RemoteException;
    public void updateClient(Client client)throws RemoteException;
    
    public List<Client> listClient() throws RemoteException;
}
