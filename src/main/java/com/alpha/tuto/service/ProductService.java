/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;



import com.alpha.tuto.model.Products ;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bilel
 */
@Service(value = "ProductService")
@Transactional(readOnly = true)
public class ProductService implements IProductService,Serializable{
    
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired 
    private SessionFactory sessionFactory;
   
    @Transactional(readOnly = false)
    @Override
    public List<Products> find() {
        List<Products> products = new ArrayList<>();
        for(Products p : products)
        {
            logger.debug(""+p.getPrice());
        }
        return (List<Products>) getSessionFactory().getCurrentSession().getNamedQuery("Products.findAll").list();
        
    }

    @Transactional(readOnly = false)
    @Override
    public void addProduct(Products product) {
       getSessionFactory().getCurrentSession().save(product);
    }

    @Transactional(readOnly = false)
    @Override
    public void updateProduct(Products product) {
        getSessionFactory().getCurrentSession().update(product);
    }

    @Transactional(readOnly = true)
    @Override
    public void deleteProduct(Products product) {
       getSessionFactory().getCurrentSession().delete(product);
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
