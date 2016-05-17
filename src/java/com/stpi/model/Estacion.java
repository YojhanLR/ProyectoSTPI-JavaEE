/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author YojhanLR
 */
@Entity
@XmlRootElement
@JsonIdentityInfo(generator=JSOGGenerator.class)
@NamedQueries({
    @NamedQuery(name = "Estacion.findAll", query = "SELECT e FROM Estacion e"),
    @NamedQuery(name = "Estacion.findByEstacionId", query = "SELECT e FROM Estacion e WHERE e.estacionId = :estacionId"),
    @NamedQuery(name = "Estacion.findByNombre", query = "SELECT e FROM Estacion e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estacion.findByUbicacion", query = "SELECT e FROM Estacion e WHERE e.ubicacion = :ubicacion")})
public class Estacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "estacion_id")
    private Integer estacionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String ubicacion;
    @JoinColumn(name = "ruta_id", referencedColumnName = "ruta_id")
    @ManyToOne(optional = false)
    private Ruta rutaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estacionId")
    private List<EstacionBicicleta> estacionBicicletaList;

    public Estacion() {
    }

    public Estacion(Integer estacionId) {
        this.estacionId = estacionId;
    }

    public Estacion(Integer estacionId, String nombre, String ubicacion) {
        this.estacionId = estacionId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Integer getEstacionId() {
        return estacionId;
    }

    public void setEstacionId(Integer estacionId) {
        this.estacionId = estacionId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Ruta getRutaId() {
        return rutaId;
    }

    public void setRutaId(Ruta rutaId) {
        this.rutaId = rutaId;
    }

    @XmlTransient
    public List<EstacionBicicleta> getEstacionBicicletaList() {
        return estacionBicicletaList;
    }

    public void setEstacionBicicletaList(List<EstacionBicicleta> estacionBicicletaList) {
        this.estacionBicicletaList = estacionBicicletaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estacionId != null ? estacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estacion)) {
            return false;
        }
        Estacion other = (Estacion) object;
        if ((this.estacionId == null && other.estacionId != null) || (this.estacionId != null && !this.estacionId.equals(other.estacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.Estacion[ estacionId=" + estacionId + " ]";
    }
    
}
