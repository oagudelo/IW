/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUIPO
 */
@Entity
@Table(name = "EMPELADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empelado.findAll", query = "SELECT e FROM Empelado e")
    , @NamedQuery(name = "Empelado.findByNombre", query = "SELECT e FROM Empelado e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empelado.findByCodigo", query = "SELECT e FROM Empelado e WHERE e.codigo = :codigo")
    , @NamedQuery(name = "Empelado.findByCargo", query = "SELECT e FROM Empelado e WHERE e.cargo = :cargo")
    , @NamedQuery(name = "Empelado.findBySueldo", query = "SELECT e FROM Empelado e WHERE e.sueldo = :sueldo")})
public class Empelado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "CODIGO")
    private String codigo;
    @Size(max = 13)
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "SUELDO")
    private Integer sueldo;

    public Empelado() {
    }

    public Empelado(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empelado)) {
            return false;
        }
        Empelado other = (Empelado) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Empelado[ codigo=" + codigo + " ]";
    }
    
}
