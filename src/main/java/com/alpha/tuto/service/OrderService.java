/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;

import com.alpha.tuto.dao.IOrdersDao;
import com.alpha.tuto.model.Orders;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bilel
 */
@Service
@Transactional(readOnly = true)
public class OrderService implements IOrderService {
    
    
    private IOrdersDao iOrdersDao; 

    @Transactional(readOnly = true)
    @Override
    public List<Orders> find() {
       
        return getiOrdersDao().find();
    }

    @Transactional(readOnly = false)
    @Override
    public void addOrder(Orders order) {
       getiOrdersDao().addOrder(order);
    }

    @Transactional(readOnly = false)
    @Override
    public void updateOrder(Orders order) {
       getiOrdersDao().updateOrder(order);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteOrder(Orders order) {
      getiOrdersDao().updateOrder(order);
    }

    /**
     * @return the iOrdersDao
     */
    public IOrdersDao getiOrdersDao() {
        return iOrdersDao;
    }

    /**
     * @param iOrdersDao the iOrdersDao to set
     */
    public void setiOrdersDao(IOrdersDao iOrdersDao) {
        this.iOrdersDao = iOrdersDao;
    }
    
}
