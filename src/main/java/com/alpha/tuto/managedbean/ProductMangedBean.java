/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.managedbean;

import com.alpha.tuto.model.Products;
import com.alpha.tuto.service.IProductService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 
@ManagedBean(name="productBean")
@RequestScoped
public class ProductMangedBean implements Serializable{
    
    private List<Products> products;
    @ManagedProperty(value = "#{ProductService}")
    private IProductService productService; 
     private static final Logger logger = LoggerFactory.getLogger(ProductMangedBean.class);
    @PostConstruct
    public void init() {
        setProducts(getProductService().find());
        logger.debug(""+products.size());

    }

    /**
     * @return the products
     */
    public List<Products> getProducts() {
        
        if(products==null)
        {
  
            products.add(new Products(1,"test",12.5f));
            products.add(new Products(1,"test",12.5f));
        }
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Products> products) {
        this.products = products;
    }

    /**
     * @return the productService
     */
    public IProductService getProductService() {
        return productService;
    }

    /**
     * @param productService the productService to set
     */
    public void setProductService(IProductService productService) {
        this.productService = productService;
    }
     
   
}
