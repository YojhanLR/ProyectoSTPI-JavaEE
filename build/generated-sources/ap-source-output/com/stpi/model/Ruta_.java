package com.stpi.model;

import com.stpi.model.BusConductor;
import com.stpi.model.Estacion;
import com.stpi.model.EstacionBicicleta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-02T23:19:01")
@StaticMetamodel(Ruta.class)
public class Ruta_ { 

    public static volatile ListAttribute<Ruta, EstacionBicicleta> estacionBicicletaList;
    public static volatile SingularAttribute<Ruta, Integer> rutaId;
    public static volatile SingularAttribute<Ruta, Integer> kilometros;
    public static volatile ListAttribute<Ruta, Estacion> estacionList;
    public static volatile SingularAttribute<Ruta, String> nombre;
    public static volatile ListAttribute<Ruta, BusConductor> busConductorList;

}