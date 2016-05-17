/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YojhanLR
 */
@Entity
@Table(name = "estacion_bicicleta")
@XmlRootElement
@JsonIdentityInfo(generator=JSOGGenerator.class)
@NamedQueries({
    @NamedQuery(name = "EstacionBicicleta.findAll", query = "SELECT e FROM EstacionBicicleta e"),
    @NamedQuery(name = "EstacionBicicleta.findById", query = "SELECT e FROM EstacionBicicleta e WHERE e.id = :id")})
public class EstacionBicicleta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @JoinColumn(name = "estacion_id", referencedColumnName = "estacion_id")
    @ManyToOne(optional = false)
    private Estacion estacionId;
    @JoinColumn(name = "bicicleta_id", referencedColumnName = "bicicleta_id")
    @ManyToOne(optional = false)
    private Bicicleta bicicletaId;
    @JoinColumn(name = "ruta_id", referencedColumnName = "ruta_id")
    @ManyToOne(optional = false)
    private Ruta rutaId;

    public EstacionBicicleta() {
    }

    public EstacionBicicleta(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estacion getEstacionId() {
        return estacionId;
    }

    public void setEstacionId(Estacion estacionId) {
        this.estacionId = estacionId;
    }

    public Bicicleta getBicicletaId() {
        return bicicletaId;
    }

    public void setBicicletaId(Bicicleta bicicletaId) {
        this.bicicletaId = bicicletaId;
    }

    public Ruta getRutaId() {
        return rutaId;
    }

    public void setRutaId(Ruta rutaId) {
        this.rutaId = rutaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstacionBicicleta)) {
            return false;
        }
        EstacionBicicleta other = (EstacionBicicleta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.EstacionBicicleta[ id=" + id + " ]";
    }
    
}
