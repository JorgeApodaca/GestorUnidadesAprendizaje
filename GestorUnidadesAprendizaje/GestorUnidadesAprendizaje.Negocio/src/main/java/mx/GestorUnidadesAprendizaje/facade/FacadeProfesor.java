/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.facade;

import mx.GestorUnidadesAprendizaje.delegate.DelegateProfesor;
import mx.gestorunidadesaprendizaje.entidad.Profesores;
import java.util.List;
/**
 *
 * @author EduardoCardona <>
 */
public class FacadeProfesor {
    
    private final DelegateProfesor delegateProfesor;

    public FacadeProfesor() {
        this.delegateProfesor = new DelegateProfesor();
    }
    
    public void guardarProfesor(Profesores profesor){
        delegateProfesor.saveProfesor(profesor);
    }
    
    public List<Profesores> obtenerProfesores() {
        return delegateProfesor.findAllProfesores();
    }

    public Profesores consultarProfesor(Integer id) {
        return delegateProfesor.findProfesorById(id);
    }

    /**
     * Metodo para eliminar un Profesor por su ID, con validacion de asignaciones
     *
     * @param id El ID del Profesor a eliminar
     */
    public void eliminarProfesor(Integer id) {
        delegateProfesor.deleteProfesorById(id);
    }
    
    public void modificarProfesor(Profesores profesor) {
        delegateProfesor.updateProfesor(profesor);
    }
}
