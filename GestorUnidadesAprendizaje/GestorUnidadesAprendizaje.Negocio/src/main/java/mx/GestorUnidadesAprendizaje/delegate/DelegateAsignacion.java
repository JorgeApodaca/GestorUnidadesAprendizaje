/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.delegate;

import mx.gestorunidadesaprendizaje.entidad.Asignacion;
import mx.devs.persistencia.ServiceLocator;
import java.util.List;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateAsignacion {
    
    /**
     * Metodo de ejemplo para guardar una asignacion
     * @param asignacion de tipo asignacion con id 0 para que se cree un id nuevo
     */
    public void saveAsignacion(Asignacion asignacion){
        ServiceLocator.getInstanceAsignacionDAO().save(asignacion);
    }
    
    /**
     * Metodo para obtener una lista con todos las asignaciones
     *
     * @return List<Asignacion> con todos las asignaciones
     */
    public List<Asignacion> findAllAsignaciones() {
        return ServiceLocator.getInstanceAsignacionDAO().findAll();
    }
    
    /**
     * Metodo para buscar una Asignacion por su ID
     * @param id El ID de la asignacion a buscar
     * @return La Asignacion encontrada, o null si no existe
     */
    public Asignacion findAsignacionById(Integer id) {
        return ServiceLocator.getInstanceAsignacionDAO().find(id);
    }

    /**
     * Actualiza los datos de un Asignacion
     * @param asignacion Objeto Asignaciones con datos actualizados
     */
    public void updateAsignacion(Asignacion asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().update(asignacion);
    }

    /**
     * Elimina un Asignacion por ID
     * @param id Identificador de la asignacion a eliminar
     */
    /**
     * Metodo para eliminar una Asignacion por su ID
     * @param id El ID de la Asignacion a eliminar
     */
    public void deleteAsignacionById(Integer id) {
        Asignacion asignacion = ServiceLocator.getInstanceAsignacionDAO().find(id);
        if (asignacion != null) {
            ServiceLocator.getInstanceAsignacionDAO().delete(asignacion);
        }
    }
}
