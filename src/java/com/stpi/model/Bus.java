/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b"),
    @NamedQuery(name = "Bus.findByBusId", query = "SELECT b FROM Bus b WHERE b.busId = :busId"),
    @NamedQuery(name = "Bus.findByEstado", query = "SELECT b FROM Bus b WHERE b.estado = :estado"),
    @NamedQuery(name = "Bus.findByMatricula", query = "SELECT b FROM Bus b WHERE b.matricula = :matricula"),
    @NamedQuery(name = "Bus.findByUbicacion", query = "SELECT b FROM Bus b WHERE b.ubicacion = :ubicacion")})
public class Bus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bus_id")
    private Integer busId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    private String matricula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    private String ubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busId")
    private List<BusConductor> busConductorList;

    public Bus() {
    }

    public Bus(Integer busId) {
        this.busId = busId;
    }

    public Bus(Integer busId, String estado, String matricula, String ubicacion) {
        this.busId = busId;
        this.estado = estado;
        this.matricula = matricula;
        this.ubicacion = ubicacion;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @XmlTransient
    public List<BusConductor> getBusConductorList() {
        return busConductorList;
    }

    public void setBusConductorList(List<BusConductor> busConductorList) {
        this.busConductorList = busConductorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (busId != null ? busId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.busId == null && other.busId != null) || (this.busId != null && !this.busId.equals(other.busId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.Bus[ busId=" + busId + " ]";
    }
    
}
