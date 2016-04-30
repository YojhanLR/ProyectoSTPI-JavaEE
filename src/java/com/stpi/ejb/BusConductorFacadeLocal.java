/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.BusConductor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YojhanLR
 */
@Local
public interface BusConductorFacadeLocal {

    void create(BusConductor busConductor);

    void edit(BusConductor busConductor);

    void remove(BusConductor busConductor);

    BusConductor find(Object id);

    List<BusConductor> findAll();

    List<BusConductor> findRange(int[] range);

    int count();
    
}
