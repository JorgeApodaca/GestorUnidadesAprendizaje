/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gestorunidadesaprendizaje.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "asignacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignacion.findAll", query = "SELECT a FROM Asignacion a")
    , @NamedQuery(name = "Asignacion.findByIdAsignacion", query = "SELECT a FROM Asignacion a WHERE a.idAsignacion = :idAsignacion")})
public class Asignacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idAsignacion")
    private Integer idAsignacion;
    @JoinColumn(name = "profesores_numero_profesor", referencedColumnName = "idProfesor")
    @ManyToOne(optional = false)
    private Profesores profesoresNumeroProfesor;
    @JoinColumn(name = "unidades_idUnidad", referencedColumnName = "idUnidad")
    @ManyToOne(optional = false)
    private Unidades unidadesidUnidad;

    public Asignacion() {
    }

    public Asignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Profesores getProfesoresNumeroProfesor() {
        return profesoresNumeroProfesor;
    }

    public void setProfesoresNumeroProfesor(Profesores profesoresNumeroProfesor) {
        this.profesoresNumeroProfesor = profesoresNumeroProfesor;
    }

    public Unidades getUnidadesidUnidad() {
        return unidadesidUnidad;
    }

    public void setUnidadesidUnidad(Unidades unidadesidUnidad) {
        this.unidadesidUnidad = unidadesidUnidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignacion != null ? idAsignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignacion)) {
            return false;
        }
        Asignacion other = (Asignacion) object;
        if ((this.idAsignacion == null && other.idAsignacion != null) || (this.idAsignacion != null && !this.idAsignacion.equals(other.idAsignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.devs.gestorunidadesaprendizaje.entidad.Asignacion[ idAsignacion=" + idAsignacion + " ]";
    }
    
}
