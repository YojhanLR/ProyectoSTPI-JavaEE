package com.stpi.model;

import com.stpi.model.BusConductor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-02T23:19:01")
@StaticMetamodel(Bus.class)
public class Bus_ { 

    public static volatile SingularAttribute<Bus, Integer> busId;
    public static volatile SingularAttribute<Bus, String> estado;
    public static volatile SingularAttribute<Bus, String> ubicacion;
    public static volatile SingularAttribute<Bus, String> matricula;
    public static volatile ListAttribute<Bus, BusConductor> busConductorList;

}