/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.ejb;

import com.stpi.model.EstacionBicicleta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author YojhanLR
 */
@Stateless
public class EstacionBicicletaFacade extends AbstractFacade<EstacionBicicleta> implements EstacionBicicletaFacadeLocal {
    @PersistenceContext(unitName = "Proyecto_STPIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstacionBicicletaFacade() {
        super(EstacionBicicleta.class);
    }
    
}
