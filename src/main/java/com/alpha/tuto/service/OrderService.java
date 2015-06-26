/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;


import com.alpha.tuto.model.Orders;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bilel
 */
@Service(value = "OrderService")
@Transactional(readOnly = true)
public class OrderService implements IOrderService {
   private SessionFactory sessionFactory;
    
   @Transactional(readOnly = true)
    @Override
    public List<Orders> find() {
        Query query = getSessionFactory().getCurrentSession().getNamedQuery("Orders.findAll");
        return (List<Orders>) query.list();
    }

    @Transactional(readOnly = false)
    @Override
    public void addOrder(Orders order) {
        getSessionFactory().getCurrentSession().save(order);
    }

    @Transactional(readOnly = false)
    @Override
    public void updateOrder(Orders order) {
        getSessionFactory().getCurrentSession().update(order);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteOrder(Orders order) {
       getSessionFactory().getCurrentSession().delete(order);
    }

 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
}
