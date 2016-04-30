/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.TransferConductor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YojhanLR
 */
@Local
public interface TransferConductorFacadeLocal {

    void create(TransferConductor transferConductor);

    void edit(TransferConductor transferConductor);

    void remove(TransferConductor transferConductor);

    TransferConductor find(Object id);

    List<TransferConductor> findAll();

    List<TransferConductor> findRange(int[] range);

    int count();
    
}
