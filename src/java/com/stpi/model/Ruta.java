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
    @NamedQuery(name = "Ruta.findAll", query = "SELECT r FROM Ruta r"),
    @NamedQuery(name = "Ruta.findByRutaId", query = "SELECT r FROM Ruta r WHERE r.rutaId = :rutaId"),
    @NamedQuery(name = "Ruta.findByKilometros", query = "SELECT r FROM Ruta r WHERE r.kilometros = :kilometros"),
    @NamedQuery(name = "Ruta.findByNombre", query = "SELECT r FROM Ruta r WHERE r.nombre = :nombre")})
public class Ruta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ruta_id")
    private Integer rutaId;
    @Basic(optional = false)
    @NotNull
    private int kilometros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutaId")
    private List<BusConductor> busConductorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutaId")
    private List<Estacion> estacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutaId")
    private List<EstacionBicicleta> estacionBicicletaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rutaId")
    private List<TransferConductor> transferConductorList;

   

    public Ruta() {
    }

    public Ruta(Integer rutaId) {
        this.rutaId = rutaId;
    }

    public Ruta(Integer rutaId, int kilometros, String nombre) {
        this.rutaId = rutaId;
        this.kilometros = kilometros;
        this.nombre = nombre;
    }

    public Integer getRutaId() {
        return rutaId;
    }

    public void setRutaId(Integer rutaId) {
        this.rutaId = rutaId;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<BusConductor> getBusConductorList() {
        return busConductorList;
    }

    public void setBusConductorList(List<BusConductor> busConductorList) {
        this.busConductorList = busConductorList;
    }

    @XmlTransient
    public List<Estacion> getEstacionList() {
        return estacionList;
    }

    public void setEstacionList(List<Estacion> estacionList) {
        this.estacionList = estacionList;
    }

    @XmlTransient
    public List<EstacionBicicleta> getEstacionBicicletaList() {
        return estacionBicicletaList;
    }

    public void setEstacionBicicletaList(List<EstacionBicicleta> estacionBicicletaList) {
        this.estacionBicicletaList = estacionBicicletaList;
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
        hash += (rutaId != null ? rutaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ruta)) {
            return false;
        }
        Ruta other = (Ruta) object;
        if ((this.rutaId == null && other.rutaId != null) || (this.rutaId != null && !this.rutaId.equals(other.rutaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.Ruta[ rutaId=" + rutaId + " ]";
    }
    
}
