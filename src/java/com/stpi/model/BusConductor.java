/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YojhanLR
 */
@Entity
@Table(name = "bus_conductor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BusConductor.findAll", query = "SELECT b FROM BusConductor b"),
    @NamedQuery(name = "BusConductor.findById", query = "SELECT b FROM BusConductor b WHERE b.id = :id"),
    @NamedQuery(name = "BusConductor.findByKilometrosRecorridos", query = "SELECT b FROM BusConductor b WHERE b.kilometrosRecorridos = :kilometrosRecorridos"),
    @NamedQuery(name = "BusConductor.findByFechaInicio", query = "SELECT b FROM BusConductor b WHERE b.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "BusConductor.findByFechaFin", query = "SELECT b FROM BusConductor b WHERE b.fechaFin = :fechaFin")})
public class BusConductor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kilometros_recorridos")
    private float kilometrosRecorridos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @JoinColumn(name = "bus_id", referencedColumnName = "bus_id")
    @ManyToOne(optional = false)
    private Bus busId;
    @JoinColumn(name = "conductor_id", referencedColumnName = "conductor_id")
    @ManyToOne(optional = false)
    private Conductor conductorId;
    @JoinColumn(name = "ruta_id", referencedColumnName = "ruta_id")
    @ManyToOne(optional = false)
    private Ruta rutaId;

    public BusConductor() {
    }

    public BusConductor(Integer id) {
        this.id = id;
    }

    public BusConductor(Integer id, float kilometrosRecorridos, Date fechaInicio) {
        this.id = id;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.fechaInicio = fechaInicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(float kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Bus getBusId() {
        return busId;
    }

    public void setBusId(Bus busId) {
        this.busId = busId;
    }

    public Conductor getConductorId() {
        return conductorId;
    }

    public void setConductorId(Conductor conductorId) {
        this.conductorId = conductorId;
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
        if (!(object instanceof BusConductor)) {
            return false;
        }
        BusConductor other = (BusConductor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.BusConductor[ id=" + id + " ]";
    }
    
}
