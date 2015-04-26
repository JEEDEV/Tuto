/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.dao;

import com.alpha.tuto.model.Products;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author bilel
 */
public class ProductDao implements IProductsDao{

     private SessionFactory sessionFactory;
    @Override
    public List<Products> find() {
        return (List<Products>) getSessionFactory().getCurrentSession().getNamedQuery("Products.findAll");
    }

    @Override
    public void addProduct(Products product) {
       getSessionFactory().getCurrentSession().save(product);
    }

    @Override
    public void updateProduct(Products product) {
        getSessionFactory().getCurrentSession().update(product);
    }

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
