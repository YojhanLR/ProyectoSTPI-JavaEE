package com.stpi.model;

import com.stpi.model.TransferConductor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-03T13:20:41")
@StaticMetamodel(Transfer.class)
public class Transfer_ { 

    public static volatile SingularAttribute<Transfer, String> ubicacion;
    public static volatile SingularAttribute<Transfer, String> estado;
    public static volatile ListAttribute<Transfer, TransferConductor> transferConductorList;
    public static volatile SingularAttribute<Transfer, String> matricula;
    public static volatile SingularAttribute<Transfer, Integer> transferId;

}