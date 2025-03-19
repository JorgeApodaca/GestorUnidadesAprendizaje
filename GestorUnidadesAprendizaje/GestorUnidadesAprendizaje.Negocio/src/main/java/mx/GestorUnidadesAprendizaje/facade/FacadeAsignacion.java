/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.facade;

import mx.GestorUnidadesAprendizaje.delegate.DelegateAsignacion;
import mx.gestorunidadesaprendizaje.entidad.Asignacion;
import java.util.List;
/**
 *
 * @author EduardoCardona <>
 */
public class FacadeAsignacion {
    
    private final DelegateAsignacion delegateAsignacion;

    public FacadeAsignacion() {
        this.delegateAsignacion = new DelegateAsignacion();
    }
    
    public void guardarAsignacion(Asignacion asignacion){
        delegateAsignacion.saveAsignacion(asignacion);
    }
    
    public List<Asignacion> obtenerAsignaciones() {
        return delegateAsignacion.findAllAsignaciones();
    }
    
    public void eliminarAsignacion(Integer id) {
        delegateAsignacion.deleteAsignacionById(id);
    }

    public Asignacion consultarAsignacion(Integer id) {
        return delegateAsignacion.findAsignacionById(id);
    }

    public void modificarProfesor(Asignacion asignacion) {
        delegateAsignacion.updateAsignacion(asignacion);
    }
}
