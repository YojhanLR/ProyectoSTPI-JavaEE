/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stpi.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @NamedQuery(name = "Conductor.findAll", query = "SELECT c FROM Conductor c"),
    @NamedQuery(name = "Conductor.findByConductorId", query = "SELECT c FROM Conductor c WHERE c.conductorId = :conductorId"),
    @NamedQuery(name = "Conductor.findByCedula", query = "SELECT c FROM Conductor c WHERE c.cedula = :cedula"),
    @NamedQuery(name = "Conductor.findByNombre", query = "SELECT c FROM Conductor c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Conductor.findByFechaNac", query = "SELECT c FROM Conductor c WHERE c.fechaNac = :fechaNac"),
    @NamedQuery(name = "Conductor.findByTelefono", query = "SELECT c FROM Conductor c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Conductor.findByDireccion", query = "SELECT c FROM Conductor c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Conductor.findByEstado", query = "SELECT c FROM Conductor c WHERE c.estado = :estado")})
public class Conductor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "conductor_id")
    private Integer conductorId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conductorId")
    private List<TransferConductor> transferConductorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conductorId")
    private List<BusConductor> busConductorList;

    public Conductor() {
    }

    public Conductor(Integer conductorId) {
        this.conductorId = conductorId;
    }

    public Conductor(Integer conductorId, String cedula, String nombre, Date fechaNac, String telefono, String direccion, String estado) {
        this.conductorId = conductorId;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    public Integer getConductorId() {
        return conductorId;
    }

    public void setConductorId(Integer conductorId) {
        this.conductorId = conductorId;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        hash += (conductorId != null ? conductorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conductor)) {
            return false;
        }
        Conductor other = (Conductor) object;
        if ((this.conductorId == null && other.conductorId != null) || (this.conductorId != null && !this.conductorId.equals(other.conductorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.Conductor[ conductorId=" + conductorId + " ]";
    }
    
}
