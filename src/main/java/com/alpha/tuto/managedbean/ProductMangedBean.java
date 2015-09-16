/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.managedbean;

import com.alpha.tuto.model.Products;
import com.alpha.tuto.service.ITutoService;
import com.alpha.tuto.service.ITutoService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.faces.bean.ViewScoped;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


 
@ManagedBean(name="productBean")
@ViewScoped
public class ProductMangedBean implements Serializable{
    
    private List<Products> products;
    private Integer productNo;
    private String name;
    private float price;
    private Products selectedproduct;
    
    @ManagedProperty(value = "#{TutoService}")
    private ITutoService tutoService; 
    private static final Logger logger = Logger.getLogger(ProductMangedBean.class);
    
     @PostConstruct
    public void init() {
        products=tutoService.getAll(Products.class);
      //  setProducts(getProductService().find());
        logger.setLevel(Level.INFO);
        logger.info(getProducts().size());
       
        for(Products p : products)
        {
            logger.info("produit "+ p.toString() );
        }

    }

    public void addProduct(){};
    
    public void updateProduct(){};
    
    public void deleteProduct(){};
    
    public void onSelectProduct(Products products){};
    
    /**
     * @return the products
     */
    public List<Products> getProducts() {
     
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Products> products) {
        this.products = products;
    }



    /**
     * @return the productNo
     */
    public Integer getProductNo() {
        return productNo;
    }

    /**
     * @param productNo the productNo to set
     */
    public void setProductNo(Integer productNo) {
        this.productNo = productNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the selectedproduct
     */
    public Products getSelectedproduct() {
        return selectedproduct;
    }

    /**
     * @param selectedproduct the selectedproduct to set
     */
    public void setSelectedproduct(Products selectedproduct) {
        this.selectedproduct = selectedproduct;
    }

    /**
     * @return the tutoService
     */
    public ITutoService getTutoService() {
        return tutoService;
    }

    /**
     * @param tutoService the tutoService to set
     */
    public void setTutoService(ITutoService tutoService) {
        this.tutoService = tutoService;
    }
     
   
}
