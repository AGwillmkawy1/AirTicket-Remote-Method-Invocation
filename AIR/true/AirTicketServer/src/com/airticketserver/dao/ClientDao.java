/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airticketserver.dao;

import com.airticketserver.model.Client;
import com.airticketserver.util.HibernateUtil;
import java.util.List;
import org.hibernate.*;
import org.hibernate.Transaction;

/**
 *
 * @author Plaubert
 */
public class ClientDao {
    Session sn;
    Transaction tr;
    
    public void saveClient(Client client){
        sn=HibernateUtil.getSessionFactory().openSession();
        tr=sn.beginTransaction();
        sn.save(client);
        tr.commit();
        sn.close();
    }
       public void updateClient(Client client){
        sn=HibernateUtil.getSessionFactory().openSession();
        tr=sn.beginTransaction();
        sn.update(client);
        tr.commit();
        sn.close();
    }
       public void deleteClient(Client client){
        sn=HibernateUtil.getSessionFactory().openSession();
        tr=sn.beginTransaction();
        sn.delete(client);
        tr.commit();
        sn.close();
    }
    
    
    
    public List<Client> listClient(){
        sn=HibernateUtil.getSessionFactory().openSession();
        Criteria ctr=sn.createCriteria(Client.class);
        List<Client> lst=ctr.list();
        sn.close();
        return lst;
    }
}
