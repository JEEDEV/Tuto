/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.dao;

import com.alpha.tuto.model.Products;
import java.util.List;

/**
 *
 * @author bilel
 */
public interface IProductsDao {
    
    public List<Products> find();
    
    public void addProduct(Products product);
    
    public void updateProduct(Products product);
    
    public void deleteProduct(Products product);
    
}
