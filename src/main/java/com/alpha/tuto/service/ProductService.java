/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;


import com.alpha.tuto.dao.IProductsDao;
import com.alpha.tuto.model.Products ;
import java.io.Serializable;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bilel
 */
@Service
@Transactional(readOnly = true)
public class ProductService implements IProductService,Serializable{
    private static final long serialVersionUID = 1L;
     private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
    private IProductsDao productsDao; 

    @Transactional(readOnly = true)
    @Override
    public List<Products > find() {
      
        logger.info(getProductsDao().find().get(0).getName());
        return getProductsDao().find();
    }

    @Transactional(readOnly = false)
    @Override
    public void addOrder(Products  product) {
       getProductsDao().addProduct(product);
               }

    @Transactional(readOnly = false)
    @Override
    public void updateOrder(Products  product) {
        getProductsDao().updateProduct(product);
    }

    @Transactional(readOnly = false)
    @Override
    public void deleteOrder(Products  product) {
       getProductsDao().deleteProduct(product);
    }

    /**
     * @return the productsDao
     */
    public IProductsDao getProductsDao() {
        return productsDao;
    }

    /**
     * @param productsDao the productsDao to set
     */
    public void setProductsDao(IProductsDao productsDao) {
        this.productsDao = productsDao;
    }



    
}
