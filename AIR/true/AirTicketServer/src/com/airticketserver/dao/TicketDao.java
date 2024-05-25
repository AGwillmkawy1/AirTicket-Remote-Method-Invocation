/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airticketserver.dao;

import com.airticketserver.model.Client;
import com.airticketserver.model.Ticket;
import com.airticketserver.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Plaubert
 */
public class TicketDao {
    
    Session sn;
    Transaction tr;
    
    public void saveTicket(Ticket tick){
        sn=HibernateUtil.getSessionFactory().openSession();
        tr=sn.beginTransaction();
        sn.save(tick);
        tr.commit();
        sn.close();
    }
    
    public List<Ticket> listTicket(){
        sn=HibernateUtil.getSessionFactory().openSession();
        Criteria ctr=sn.createCriteria(Ticket.class);
        List<Ticket> lst=ctr.list();
        sn.close();
        return lst;
    }
}
