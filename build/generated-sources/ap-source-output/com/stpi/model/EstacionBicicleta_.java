package com.stpi.model;

import com.stpi.model.Bicicleta;
import com.stpi.model.Estacion;
import com.stpi.model.Ruta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-05T22:53:28")
@StaticMetamodel(EstacionBicicleta.class)
public class EstacionBicicleta_ { 

    public static volatile SingularAttribute<EstacionBicicleta, Bicicleta> bicicletaId;
    public static volatile SingularAttribute<EstacionBicicleta, Ruta> rutaId;
    public static volatile SingularAttribute<EstacionBicicleta, Integer> id;
    public static volatile SingularAttribute<EstacionBicicleta, Estacion> estacionId;

}