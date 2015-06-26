/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.model;

import java.io.Serializable;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bilel
 */
@Entity
@Table(name = "products", catalog = "tuto", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProductNo", query = "SELECT p FROM Products p WHERE p.productNo = :productNo"),
    @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name"),
    @NamedQuery(name = "Products.findByPrice", query = "SELECT p FROM Products p WHERE p.price = :price")})
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_no", nullable = false)
    private Integer productNo;
    @Size(max = 2147483647)
    @Column(name = "name", length = 2147483647)
    private String name;
    @Column(name = "price")
    private float price;
    @OneToMany(mappedBy = "productNo", fetch = FetchType.LAZY)
    private Collection<Orders> ordersCollection;

    public Products() {
    }

    public Products(Integer productNo) {
        this.productNo = productNo;
    }

       public Products(Integer productNo,String name,float price) {
        this.productNo = productNo;
        this.name= name;
        this.price=price;
    }

    
    
    public Integer getProductNo() {
        return productNo;
    }

    public void setProductNo(Integer productNo) {
        this.productNo = productNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @XmlTransient
    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productNo != null ? productNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productNo == null && other.productNo != null) || (this.productNo != null && !this.productNo.equals(other.productNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alpha.tuto.model.Products[ productNo=" + productNo + " ]";
    }
    
}
