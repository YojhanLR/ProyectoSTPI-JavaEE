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
@Table(name = "transfer_conductor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransferConductor.findAll", query = "SELECT t FROM TransferConductor t"),
    @NamedQuery(name = "TransferConductor.findById", query = "SELECT t FROM TransferConductor t WHERE t.id = :id"),
    @NamedQuery(name = "TransferConductor.findByKilometrosRecorridos", query = "SELECT t FROM TransferConductor t WHERE t.kilometrosRecorridos = :kilometrosRecorridos"),
    @NamedQuery(name = "TransferConductor.findByFechaInicio", query = "SELECT t FROM TransferConductor t WHERE t.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "TransferConductor.findByFechaFin", query = "SELECT t FROM TransferConductor t WHERE t.fechaFin = :fechaFin")})
public class TransferConductor implements Serializable {
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
    @JoinColumn(name = "transfer_id", referencedColumnName = "transfer_id")
    @ManyToOne(optional = false)
    private Transfer transferId;
    @JoinColumn(name = "conductor_id", referencedColumnName = "conductor_id")
    @ManyToOne(optional = false)
    private Conductor conductorId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;
    @JoinColumn(name = "ruta_id", referencedColumnName = "ruta_id")
    @ManyToOne(optional = false)
    private Ruta rutaId;

    
    public TransferConductor() {
    }

    public TransferConductor(Integer id) {
        this.id = id;
    }

    public TransferConductor(Integer id, float kilometrosRecorridos, Date fechaInicio) {
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

    public Transfer getTransferId() {
        return transferId;
    }

    public void setTransferId(Transfer transferId) {
        this.transferId = transferId;
    }

    public Conductor getConductorId() {
        return conductorId;
    }

    public void setConductorId(Conductor conductorId) {
        this.conductorId = conductorId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
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
        if (!(object instanceof TransferConductor)) {
            return false;
        }
        TransferConductor other = (TransferConductor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.TransferConductor[ id=" + id + " ]";
    }
    
}
