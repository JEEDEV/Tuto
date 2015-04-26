/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;

import com.alpha.tuto.model.Products ;
import java.util.List;

/**
 *
 * @author bilel
 */
public interface IProductService {
    
    public List<Products > find();
    
    public void addOrder(Products  product);
    
    public void updateOrder(Products  product);
    
    public void deleteOrder(Products  product);
}
