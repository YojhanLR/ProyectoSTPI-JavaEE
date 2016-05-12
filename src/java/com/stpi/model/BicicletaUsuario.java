/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@Table(name = "bicicleta_usuario")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@bicicletausuarioId")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BicicletaUsuario.findAll", query = "SELECT b FROM BicicletaUsuario b"),
    @NamedQuery(name = "BicicletaUsuario.findById", query = "SELECT b FROM BicicletaUsuario b WHERE b.id = :id"),
    @NamedQuery(name = "BicicletaUsuario.findByFechaInicio", query = "SELECT b FROM BicicletaUsuario b WHERE b.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "BicicletaUsuario.findByFechaFin", query = "SELECT b FROM BicicletaUsuario b WHERE b.fechaFin = :fechaFin")})
public class BicicletaUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @JoinColumn(name = "bicicleta_id", referencedColumnName = "bicicleta_id")
    @ManyToOne(optional = false)
    private Bicicleta bicicletaId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;

    public BicicletaUsuario() {
    }

    public BicicletaUsuario(Integer id) {
        this.id = id;
    }

    public BicicletaUsuario(Integer id, Date fechaInicio) {
        this.id = id;
        this.fechaInicio = fechaInicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Bicicleta getBicicletaId() {
        return bicicletaId;
    }

    public void setBicicletaId(Bicicleta bicicletaId) {
        this.bicicletaId = bicicletaId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
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
        if (!(object instanceof BicicletaUsuario)) {
            return false;
        }
        BicicletaUsuario other = (BicicletaUsuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.BicicletaUsuario[ id=" + id + " ]";
    }
    
}
