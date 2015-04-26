/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.dao;

import com.alpha.tuto.model.Orders;
import java.util.List;

/**
 *
 * @author bilel
 */
public interface IOrdersDao {
    
    public List<Orders> find();
    
    public void addOrder(Orders order);
    
    public void updateOrder(Orders order);
    
    public void deleteOrder(Orders order);
    
}
