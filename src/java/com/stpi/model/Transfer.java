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
    @NamedQuery(name = "Transfer.findAll", query = "SELECT t FROM Transfer t"),
    @NamedQuery(name = "Transfer.findByTransferId", query = "SELECT t FROM Transfer t WHERE t.transferId = :transferId"),
    @NamedQuery(name = "Transfer.findByMatricula", query = "SELECT t FROM Transfer t WHERE t.matricula = :matricula"),
    @NamedQuery(name = "Transfer.findByUbicacion", query = "SELECT t FROM Transfer t WHERE t.ubicacion = :ubicacion"),
    @NamedQuery(name = "Transfer.findByEstado", query = "SELECT t FROM Transfer t WHERE t.estado = :estado")})
public class Transfer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transfer_id")
    private Integer transferId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    private String matricula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String ubicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transferId")
    private List<TransferConductor> transferConductorList;

    public Transfer() {
    }

    public Transfer(Integer transferId) {
        this.transferId = transferId;
    }

    public Transfer(Integer transferId, String matricula, String ubicacion, String estado) {
        this.transferId = transferId;
        this.matricula = matricula;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<TransferConductor> getTransferConductorList() {
        return transferConductorList;
    }

    public void setTransferConductorList(List<TransferConductor> transferConductorList) {
        this.transferConductorList = transferConductorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transferId != null ? transferId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transfer)) {
            return false;
        }
        Transfer other = (Transfer) object;
        if ((this.transferId == null && other.transferId != null) || (this.transferId != null && !this.transferId.equals(other.transferId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.Transfer[ transferId=" + transferId + " ]";
    }
    
}
