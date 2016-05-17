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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YojhanLR
 */
@Entity
@XmlRootElement
@JsonIdentityInfo(generator=JSOGGenerator.class)
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByAdministradorId", query = "SELECT a FROM Administrador a WHERE a.administradorId = :administradorId"),
    @NamedQuery(name = "Administrador.findByCedula", query = "SELECT a FROM Administrador a WHERE a.cedula = :cedula"),
    @NamedQuery(name = "Administrador.findByNombre", query = "SELECT a FROM Administrador a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Administrador.findByCorreo", query = "SELECT a FROM Administrador a WHERE a.correo = :correo"),
    @NamedQuery(name = "Administrador.findByUsername", query = "SELECT a FROM Administrador a WHERE a.username = :username"),
    @NamedQuery(name = "Administrador.findByPassword", query = "SELECT a FROM Administrador a WHERE a.password = :password")})
public class Administrador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "administrador_id")
    private Integer administradorId;
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
    @Size(min = 1, max = 100)
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    private String password;

    public Administrador() {
    }

    public Administrador(Integer administradorId) {
        this.administradorId = administradorId;
    }

    public Administrador(Integer administradorId, String cedula, String nombre, String correo, String username, String password) {
        this.administradorId = administradorId;
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.username = username;
        this.password = password;
    }

    public Integer getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(Integer administradorId) {
        this.administradorId = administradorId;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (administradorId != null ? administradorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.administradorId == null && other.administradorId != null) || (this.administradorId != null && !this.administradorId.equals(other.administradorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.stpi.model.Administrador[ administradorId=" + administradorId + " ]";
    }
    
}
