/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alpha.tuto.service;

import com.alpha.tuto.model.Orders;
import java.util.List;

/**
 *
 * @author bilel
 */
public interface ITutoService {
    
   public <T> T save(final T o);
    public void delete(final Object object);
    public <T> T get(final Class<T> type, final Long id);
    public <T> void update(final T o);
    public <T> List<T> getAll(final Class<T> type);
}
