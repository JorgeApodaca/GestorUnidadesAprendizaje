/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.integracion;

import mx.GestorUnidadesAprendizaje.facade.FacadeProfesor;
import mx.GestorUnidadesAprendizaje.facade.FacadeUsuario;
import mx.GestorUnidadesAprendizaje.facade.FacadeUnidad;
import mx.GestorUnidadesAprendizaje.facade.FacadeAsignacion;
/**
 *
 * @author EduardoCardona <>
 */
public class ServiceFacadeLocator {
    
    private static FacadeProfesor facadeProfesor;
    private static FacadeUsuario facadeUsuario;
    private static FacadeUnidad facadeUnidad;
    private static FacadeAsignacion facadeAsignacion;
    
    
    public static FacadeProfesor getInstanceFacadeProfesor() {
        if (facadeProfesor == null) {
            facadeProfesor = new FacadeProfesor();
            return facadeProfesor;
        } else {
            return facadeProfesor;
        }
    }
    
    public static FacadeUsuario getInstanceFacadeUsuario() {
        if (facadeUsuario == null) {
            facadeUsuario = new FacadeUsuario();
            return facadeUsuario;
        } else {
            return facadeUsuario;
        }
    }
    public static FacadeUnidad getInstanceFacadeUnidad() {
        if (facadeUnidad == null) {
            facadeUnidad = new FacadeUnidad();
            return facadeUnidad;
        } else {
            return facadeUnidad;
        }
    }
    public static FacadeAsignacion getInstanceFacadeAsignacion() {
        if (facadeAsignacion == null) {
            facadeAsignacion = new FacadeAsignacion();
            return facadeAsignacion;
        } else {
            return facadeAsignacion;
        }
    }
}
