package com.stpi.model;

import com.stpi.model.EstacionBicicleta;
import com.stpi.model.Ruta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-05T22:53:28")
@StaticMetamodel(Estacion.class)
public class Estacion_ { 

    public static volatile SingularAttribute<Estacion, String> ubicacion;
    public static volatile ListAttribute<Estacion, EstacionBicicleta> estacionBicicletaList;
    public static volatile SingularAttribute<Estacion, Ruta> rutaId;
    public static volatile SingularAttribute<Estacion, Integer> estacionId;
    public static volatile SingularAttribute<Estacion, String> nombre;

}