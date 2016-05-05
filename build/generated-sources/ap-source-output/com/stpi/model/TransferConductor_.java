package com.stpi.model;

import com.stpi.model.Conductor;
import com.stpi.model.Transfer;
import com.stpi.model.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-05T13:53:40")
@StaticMetamodel(TransferConductor.class)
public class TransferConductor_ { 

    public static volatile SingularAttribute<TransferConductor, Conductor> conductorId;
    public static volatile SingularAttribute<TransferConductor, Date> fechaInicio;
    public static volatile SingularAttribute<TransferConductor, Float> kilometrosRecorridos;
    public static volatile SingularAttribute<TransferConductor, Integer> id;
    public static volatile SingularAttribute<TransferConductor, Transfer> transferId;
    public static volatile SingularAttribute<TransferConductor, Date> fechaFin;
    public static volatile SingularAttribute<TransferConductor, Usuario> usuarioId;

}