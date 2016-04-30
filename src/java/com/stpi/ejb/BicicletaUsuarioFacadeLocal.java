/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.BicicletaUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author YojhanLR
 */
@Local
public interface BicicletaUsuarioFacadeLocal {

    void create(BicicletaUsuario bicicletaUsuario);

    void edit(BicicletaUsuario bicicletaUsuario);

    void remove(BicicletaUsuario bicicletaUsuario);

    BicicletaUsuario find(Object id);

    List<BicicletaUsuario> findAll();

    List<BicicletaUsuario> findRange(int[] range);

    int count();
    
}
