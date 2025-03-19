/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.delegate;

import mx.gestorunidadesaprendizaje.entidad.Unidades;
import mx.devs.persistencia.ServiceLocator;
import java.util.List;
import mx.gestorunidadesaprendizaje.entidad.Asignacion;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateUnidad {
    
    /**
     * Metodo de ejemplo para guardar Unidad
     * @param unidad de tipo unidades con id 0 para que se cree un id nuevo
     */
    public void saveUnidad(Unidades unidad){
        ServiceLocator.getInstanceUnidadDAO().save(unidad);
    }
    
    /**
     * Metodo para obtener una lista con todos los unidades
     *
     * @return List<Unidades> con todos los unidades
     */
    public List<Unidades> findAllUnidades() {
        return ServiceLocator.getInstanceUnidadDAO().findAll();
    }
    
    /**
     * Metodo para buscar un Undad por su ID
     * @param id El ID de la Unidad a buscar
     * @return El Unidad encontrado, o null si no existe
     */
    public Unidades findUnidadById(Integer id) {
        return ServiceLocator.getInstanceUnidadDAO().find(id);
    }

    /**
     * Actualiza los datos de una Unidad
     * @param unidad Objeto Unidades con datos actualizados
     */
    public void updateUnidad(Unidades unidad) {
        ServiceLocator.getInstanceUnidadDAO().update(unidad);
    }

    public void deleteUnidadById(Integer id) {
        Unidades unidad = ServiceLocator.getInstanceUnidadDAO().find(id);
        if (unidad != null) {
            ServiceLocator.getInstanceUnidadDAO().delete(unidad);
        }
    }
}
