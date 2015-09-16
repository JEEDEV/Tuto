/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.criteria.*;
/**
 *
 * @author bilel
 */
@Service(value = "TutoService")
@Transactional(readOnly = true)
public class TutoService implements ITutoService,Serializable {
   
    @Autowired
    private SessionFactory sessionFactory;
 
 
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = false)
    @Override
    public <T> T save(T o) {
       return (T) sessionFactory.getCurrentSession().save(o); 
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Object object) {
      sessionFactory.getCurrentSession().delete(object); 
    }

    @Transactional(readOnly = true)
    @Override
    public <T> T get(Class<T> type, Long id) {
       return (T) sessionFactory.getCurrentSession().get(type, id);  
    }

    @Transactional(readOnly = false)
    @Override
    public <T> void update(T o) {
        sessionFactory.getCurrentSession().update(o);
    }

    @Transactional(readOnly = true)
    @Override
    public <T> List<T> getAll(Class<T> type) {
       return sessionFactory.getCurrentSession().createCriteria(type).list();
    }
    
}
