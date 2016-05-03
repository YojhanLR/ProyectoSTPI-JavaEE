package com.stpi.model;

import com.stpi.model.BicicletaUsuario;
import com.stpi.model.EstacionBicicleta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-03T13:20:41")
@StaticMetamodel(Bicicleta.class)
public class Bicicleta_ { 

    public static volatile SingularAttribute<Bicicleta, Integer> bicicletaId;
    public static volatile SingularAttribute<Bicicleta, String> estado;
    public static volatile ListAttribute<Bicicleta, EstacionBicicleta> estacionBicicletaList;
    public static volatile ListAttribute<Bicicleta, BicicletaUsuario> bicicletaUsuarioList;

}