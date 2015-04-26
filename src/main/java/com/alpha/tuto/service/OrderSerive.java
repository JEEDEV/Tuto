/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;

import com.alpha.tuto.dao.IOrdersDao;
import com.alpha.tuto.model.Orders;
import java.util.List;

/**
 *
 * @author bilel
 */
public class OrderSerive implements IOrderService{
    
    
    private IOrdersDao iOrdersDao; 

    @Override
    public List<Orders> find() {
       
        return (List<Orders>) getiOrdersDao().find();
    }

    @Override
    public void addOrder(Orders order) {
       getiOrdersDao().addOrder(order);
    }

    @Override
    public void updateOrder(Orders order) {
       getiOrdersDao().updateOrder(order);
    }

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
