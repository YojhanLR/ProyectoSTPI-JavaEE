/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.Bicicleta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YojhanLR
 */
@Local
public interface BicicletaFacadeLocal {

    void create(Bicicleta bicicleta);

    void edit(Bicicleta bicicleta);

    void remove(Bicicleta bicicleta);

    Bicicleta find(Object id);

    List<Bicicleta> findAll();

    List<Bicicleta> findRange(int[] range);

    int count();
    
}
