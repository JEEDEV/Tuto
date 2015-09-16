/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;

import com.alpha.tuto.model.Products;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 *
 * @author bilel
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@TransactionConfiguration(transactionManager = "transactionManager")
public class ProductServiceTest {

    private static ClassPathXmlApplicationContext context;
    @Autowired
    private static ITutoService productService;
    
    private static final Logger logger = LoggerFactory.getLogger("Test");
    
    public ProductServiceTest() {
    }
   

    /**
     * @return the context
     */
    public static ClassPathXmlApplicationContext getContext() {
        return context;
    }

    /**
     * @param aContext the context to set
     */
    public static void setContext(ClassPathXmlApplicationContext aContext) {
        context = aContext;
    }

    /**
     * @return the productService
     */
    public static ITutoService getProductService() {
        return productService;
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
       
       context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/applicationContext.xml");
       System.out.println(context.getBeanDefinitionNames().length);
       
        for (int i=0 ; i<context.getBeanDefinitionNames().length;i++)
        {
            
            logger.info("context.getDisplayName : " + context.getBeanDefinitionNames()[i]);
            
        }
        
       productService=(ITutoService) context.getBean("TutoService");
    }

  

    /**
     * Test of addOrder method, of class ProductSerivce.
     */
    
     @Test
    public void testfind() {
        logger.info("addOrder");
        
          List<Products> products = new ArrayList<Products>();

        logger.info("ProductSerivce not null: " + (null != getProductService()));
        products=getProductService().getAll(Products.class);
        for(Products p : products)
        {
            logger.info("Prix "+ p.getPrice() );
        }
        // TODO review the generated test code and remove the default call to fail.

    }
 /*
     @Test
    public void testAddOrder() {
        logger.info("addOrder");
        Products product = new Products();
        product.setProductNo(8);
        product.setName("Test");
        product.setPrice(10.5f);
        getProductService().addProduct(product);
        logger.info("Product Added with sucess");
        
        // TODO review the generated test code and remove the default call to fail.
        
    }*/
    
}