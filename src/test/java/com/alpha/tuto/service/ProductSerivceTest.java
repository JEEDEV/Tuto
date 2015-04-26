/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;

import com.alpha.tuto.model.Products;

import java.util.List;
import javax.annotation.Resource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author bilel
 */
 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration(locations={"classpath*:/applicationContext.xml"})
public class ProductSerivceTest {
    @Resource
    private static ProductSerivce productSerivce;

    /**
     * @return the productSerivce
     */
    public static ProductSerivce getProductSerivce() {
        return productSerivce;
    }

    /**
     * @param aProductSerivce the productSerivce to set
     */
    public static void setProductSerivce(ProductSerivce aProductSerivce) {
        productSerivce = aProductSerivce;
    }

    
    public ProductSerivceTest() {
    }
  
    @Test
    public void testFind() {
        System.out.println("find");
        ProductSerivce instance = new ProductSerivce();
        List<Products> expResult = null;
        List<Products> result = instance.find();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrder method, of class ProductSerivce.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Products product = new Products();
        product.setProductNo(1);
        product.setName("Test");
        product.setPrice(10.5f);
        getProductSerivce().addOrder(product);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of updateOrder method, of class ProductSerivce.
     */
    @Test
    public void testUpdateOrder() {
        System.out.println("updateOrder");
        Products product = null;
        ProductSerivce instance = new ProductSerivce();
        instance.updateOrder(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteOrder method, of class ProductSerivce.
     */
    @Test
    public void testDeleteOrder() {
        System.out.println("deleteOrder");
        Products product = null;
        ProductSerivce instance = new ProductSerivce();
        instance.deleteOrder(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getiProductService method, of class ProductSerivce.
     */
    @Test
    public void testGetiProductService() {
        System.out.println("getiProductService");
        ProductSerivce instance = new ProductSerivce();
        IProductService expResult = null;
        IProductService result = instance.getiProductService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setiProductService method, of class ProductSerivce.
     */
    @Test
    public void testSetiProductService() {
        System.out.println("setiProductService");
        IProductService iProductService = null;
        ProductSerivce instance = new ProductSerivce();
        instance.setiProductService(iProductService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
