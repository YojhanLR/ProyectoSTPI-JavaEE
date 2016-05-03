package com.stpi.model;

import com.stpi.model.BusConductor;
import com.stpi.model.TransferConductor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-03T13:20:41")
@StaticMetamodel(Conductor.class)
public class Conductor_ { 

    public static volatile SingularAttribute<Conductor, Date> fechaNac;
    public static volatile SingularAttribute<Conductor, String> estado;
    public static volatile ListAttribute<Conductor, TransferConductor> transferConductorList;
    public static volatile SingularAttribute<Conductor, Integer> conductorId;
    public static volatile SingularAttribute<Conductor, String> cedula;
    public static volatile SingularAttribute<Conductor, String> direccion;
    public static volatile SingularAttribute<Conductor, String> telefono;
    public static volatile SingularAttribute<Conductor, String> nombre;
    public static volatile ListAttribute<Conductor, BusConductor> busConductorList;

}