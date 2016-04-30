/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.Transfer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YojhanLR
 */
@Local
public interface TransferFacadeLocal {

    void create(Transfer transfer);

    void edit(Transfer transfer);

    void remove(Transfer transfer);

    Transfer find(Object id);

    List<Transfer> findAll();

    List<Transfer> findRange(int[] range);

    int count();
    
}
