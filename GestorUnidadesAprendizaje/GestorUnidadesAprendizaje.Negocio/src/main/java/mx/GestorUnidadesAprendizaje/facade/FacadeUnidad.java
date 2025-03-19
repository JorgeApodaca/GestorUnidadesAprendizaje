/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.facade;

import mx.GestorUnidadesAprendizaje.delegate.DelegateUnidad;
import mx.gestorunidadesaprendizaje.entidad.Unidades;
import java.util.List;
/**
 *
 * @author EduardoCardona <>
 */
public class FacadeUnidad {
    
    private final DelegateUnidad delegateUnidad;

    public FacadeUnidad() {
        this.delegateUnidad = new DelegateUnidad();
    }
    
    public void guardarUnidad(Unidades unidad){
        delegateUnidad.saveUnidad(unidad);
    }
    
    public List<Unidades> obtenerUnidades() {
        return delegateUnidad.findAllUnidades();
    }
    
    public void eliminarUnidad(Integer id) {
        delegateUnidad.deleteUnidadById(id);
    }

    public Unidades consultarUnidad(Integer id) {
        return delegateUnidad.findUnidadById(id);
    }

    public void modificarUnidad(Unidades unidad) {
        delegateUnidad.updateUnidad(unidad);
    }
}
