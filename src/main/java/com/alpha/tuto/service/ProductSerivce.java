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
public class ProductSerivce implements IProductService{
    
    
    private IProductService iProductService; 

    @Override
    public List<Products > find() {
      
        return (List<Products >) getiProductService().find();
    }

    @Override
    public void addOrder(Products  product) {
       getiProductService().addOrder(product);
               }

    @Override
    public void updateOrder(Products  product) {
        getiProductService().updateOrder(product);
    }

    @Override
    public void deleteOrder(Products  product) {
       getiProductService().deleteOrder(product);
    }

    /**
     * @return the iProductService
     */
    public IProductService getiProductService() {
        return iProductService;
    }

    /**
     * @param iProductService the iProductService to set
     */
    public void setiProductService(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    
}
