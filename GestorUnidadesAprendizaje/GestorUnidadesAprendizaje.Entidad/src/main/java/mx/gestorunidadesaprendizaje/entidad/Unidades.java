/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gestorunidadesaprendizaje.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "unidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidades.findAll", query = "SELECT u FROM Unidades u")
    , @NamedQuery(name = "Unidades.findByIdUnidad", query = "SELECT u FROM Unidades u WHERE u.idUnidad = :idUnidad")
    , @NamedQuery(name = "Unidades.findByClave", query = "SELECT u FROM Unidades u WHERE u.clave = :clave")
    , @NamedQuery(name = "Unidades.findByNombre", query = "SELECT u FROM Unidades u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Unidades.findByHorasC", query = "SELECT u FROM Unidades u WHERE u.horasC = :horasC")
    , @NamedQuery(name = "Unidades.findByHorasT", query = "SELECT u FROM Unidades u WHERE u.horasT = :horasT")
    , @NamedQuery(name = "Unidades.findByHorasL", query = "SELECT u FROM Unidades u WHERE u.horasL = :horasL")})
public class Unidades implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "horasC")
    private Float horasC;
    @Column(name = "horasT")
    private Float horasT;
    @Column(name = "horasL")
    private Float horasL;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadesidUnidad")
    private Collection<Asignacion> asignacionCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadesidUnidad")

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUnidad")
    private Integer idUnidad;
    @Basic(optional = false)
    @Column(name = "clave")
    private int clave;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;

    public Unidades() {
    }

    public Unidades(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Unidades(Integer idUnidad, int clave, String nombre, float horasC, float horasT, float horasL) {
        this.idUnidad = idUnidad;
        this.clave = clave;
        this.nombre = nombre;
        this.horasC = horasC;
        this.horasT = horasT;
        this.horasL = horasL;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    @XmlTransient
    public Collection<Asignacion> getAsignacionCollection() {
        return asignacionCollection;
    }

    public void setAsignacionCollection(Collection<Asignacion> asignacionCollection) {
        this.asignacionCollection = asignacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidad != null ? idUnidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidades)) {
            return false;
        }
        Unidades other = (Unidades) object;
        if ((this.idUnidad == null && other.idUnidad != null) || (this.idUnidad != null && !this.idUnidad.equals(other.idUnidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.devs.gestorunidadesaprendizaje.entidad.Unidades[ idUnidad=" + idUnidad + " ]";
    }

    public Float getHorasC() {
        return horasC;
    }

    public void setHorasC(Float horasC) {
        this.horasC = horasC;
    }

    public Float getHorasT() {
        return horasT;
    }

    public void setHorasT(Float horasT) {
        this.horasT = horasT;
    }

    public Float getHorasL() {
        return horasL;
    }

    public void setHorasL(Float horasL) {
        this.horasL = horasL;
    }

    
}
