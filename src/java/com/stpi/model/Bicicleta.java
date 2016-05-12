/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@bicicletaId")
@NamedQueries({
    @NamedQuery(name = "Bicicleta.findAll", query = "SELECT b FROM Bicicleta b"),
    @NamedQuery(name = "Bicicleta.findByBicicletaId", query = "SELECT b FROM Bicicleta b WHERE b.bicicletaId = :bicicletaId"),
    @NamedQuery(name = "Bicicleta.findByEstado", query = "SELECT b FROM Bicicleta b WHERE b.estado = :estado")})
public class Bicicleta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bicicleta_id")
    private Integer bicicletaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bicicletaId")
    private List<BicicletaUsuario> bicicletaUsuarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bicicletaId")
    private List<EstacionBicicleta> estacionBicicletaList;

    public Bicicleta() {
    }

    public Bicicleta(Integer bicicletaId) {
        this.bicicletaId = bicicletaId;
    }

    public Bicicleta(Integer bicicletaId, String estado) {
        this.bicicletaId = bicicletaId;
        this.estado = estado;
    }

    public Integer getBicicletaId() {
        return bicicletaId;
    }

    public void setBicicletaId(Integer bicicletaId) {
        this.bicicletaId = bicicletaId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<BicicletaUsuario> getBicicletaUsuarioList() {
        return bicicletaUsuarioList;
    }

    public void setBicicletaUsuarioList(List<BicicletaUsuario> bicicletaUsuarioList) {
        this.bicicletaUsuarioList = bicicletaUsuarioList;
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
        hash += (bicicletaId != null ? bicicletaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bicicleta)) {
            return false;
        }
        Bicicleta other = (Bicicleta) object;
        if ((this.bicicletaId == null && other.bicicletaId != null) || (this.bicicletaId != null && !this.bicicletaId.equals(other.bicicletaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.Bicicleta[ bicicletaId=" + bicicletaId + " ]";
    }
    
}
