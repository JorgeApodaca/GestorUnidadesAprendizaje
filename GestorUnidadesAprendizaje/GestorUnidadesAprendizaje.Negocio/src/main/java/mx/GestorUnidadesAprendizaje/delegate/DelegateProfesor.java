/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.delegate;

import mx.gestorunidadesaprendizaje.entidad.Profesores;
import mx.gestorunidadesaprendizaje.entidad.Asignacion;
import mx.devs.persistencia.ServiceLocator;
import java.util.List;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateProfesor {
    
    /**
     * Metodo de ejemplo para guardar Profesor
     * @param profesor de tipo usuario con id 0 para que se cree un id nuevo
     */
    public void saveProfesor(Profesores profesor){
        ServiceLocator.getInstanceProfesorDAO().save(profesor);
    }
    
    /**
     * Metodo para obtener una lista con todos los profesores
     *
     * @return List<Profesores> con todos los profesores
     */
    public List<Profesores> findAllProfesores() {
        return ServiceLocator.getInstanceProfesorDAO().findAll();
    }
    
    /**
     * Metodo para buscar un Profesor por su ID
     * @param id El ID del Profesor a buscar
     * @return El Profesor encontrado, o null si no existe
     */
    public Profesores findProfesorById(Integer id) {
        return ServiceLocator.getInstanceProfesorDAO().find(id);
    }

    /**
     * Actualiza los datos de un Profesor
     * @param profesor Objeto Profesores con datos actualizados
     */
    public void updateProfesor(Profesores profesor) {
        ServiceLocator.getInstanceProfesorDAO().update(profesor);
    }

    /**
     * Metodo para eliminar un Profesor por su ID, con validacion de asignaciones
     *
     * @param id El ID del Profesor a eliminar
     */
   public void deleteProfesorById(Integer id) {
        Profesores profesor = ServiceLocator.getInstanceProfesorDAO().find(id);
        if (profesor != null) {
            ServiceLocator.getInstanceProfesorDAO().delete(profesor);
        }
    }
}
