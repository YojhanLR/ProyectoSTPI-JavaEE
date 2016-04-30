/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.Bus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YojhanLR
 */
@Local
public interface BusFacadeLocal {

    void create(Bus bus);

    void edit(Bus bus);

    void remove(Bus bus);

    Bus find(Object id);

    List<Bus> findAll();

    List<Bus> findRange(int[] range);

    int count();
    
}
