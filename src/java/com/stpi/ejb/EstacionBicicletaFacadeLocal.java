/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.EstacionBicicleta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YojhanLR
 */
@Local
public interface EstacionBicicletaFacadeLocal {

    void create(EstacionBicicleta estacionBicicleta);

    void edit(EstacionBicicleta estacionBicicleta);

    void remove(EstacionBicicleta estacionBicicleta);

    EstacionBicicleta find(Object id);

    List<EstacionBicicleta> findAll();

    List<EstacionBicicleta> findRange(int[] range);

    int count();
    
}
