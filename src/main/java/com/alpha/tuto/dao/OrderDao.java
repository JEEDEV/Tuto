/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.dao;

import com.alpha.tuto.model.Orders;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;


public class OrderDao implements IOrdersDao{

    private SessionFactory sessionFactory;
    
    @Override
    public List<Orders> find() {
        Query query = getSessionFactory().getCurrentSession().getNamedQuery("Orders.findAll");
        return (List<Orders>) query.list();
    }

    @Override
    public void addOrder(Orders order) {
        getSessionFactory().getCurrentSession().save(order);
    }

    @Override
    public void updateOrder(Orders order) {
        getSessionFactory().getCurrentSession().update(order);
    }

    @Override
    public void deleteOrder(Orders order) {
       getSessionFactory().getCurrentSession().delete(order);
    }

    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
}
