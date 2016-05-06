package com.stpi.model;

import com.stpi.model.Bus;
import com.stpi.model.Conductor;
import com.stpi.model.Ruta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-05T22:53:28")
@StaticMetamodel(BusConductor.class)
public class BusConductor_ { 

    public static volatile SingularAttribute<BusConductor, Bus> busId;
    public static volatile SingularAttribute<BusConductor, Conductor> conductorId;
    public static volatile SingularAttribute<BusConductor, Ruta> rutaId;
    public static volatile SingularAttribute<BusConductor, Date> fechaInicio;
    public static volatile SingularAttribute<BusConductor, Float> kilometrosRecorridos;
    public static volatile SingularAttribute<BusConductor, Integer> id;
    public static volatile SingularAttribute<BusConductor, Date> fechaFin;

}