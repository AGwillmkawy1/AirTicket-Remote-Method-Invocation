/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airticketserver.service;

import com.airticketserver.dao.ClientDao;
import com.airticketserver.dao.TicketDao;
import com.airticketserver.model.Client;
import com.airticketserver.model.Ticket;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Plaubert
 */
public class ServiceIMP extends UnicastRemoteObject implements ServiceIFC{

    public ServiceIMP() throws RemoteException {
    }

    @Override
    public void saveTicket(Ticket tick) throws RemoteException {
        TicketDao tk=new TicketDao();
        tk.saveTicket(tick);
    }

    @Override
    public List<Ticket> listTicket() throws RemoteException {
        TicketDao tk=new TicketDao();
        return tk.listTicket();
    }

    @Override
    public void saveClient(Client client) throws RemoteException {
        ClientDao cld=new ClientDao();
        cld.saveClient(client);
    }

    @Override
    public List<Client> listClient() throws RemoteException {
         ClientDao cld=new ClientDao();
         return cld.listClient();
    }

    @Override
    public void deleteClient(Client client) throws RemoteException {
        ClientDao dao=new ClientDao();
        dao.deleteClient(client);
    }

    @Override
    public void updateClient(Client client) throws RemoteException {
       ClientDao dao=new ClientDao();
       dao.updateClient(client);
    }
    
}
