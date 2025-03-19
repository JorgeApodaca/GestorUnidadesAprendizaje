/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.devs.persistencia;

import mx.devs.dao.ProfesorDAO;
import mx.devs.dao.UsuarioDAO;
import mx.devs.dao.UnidadDAO;
import mx.devs.dao.AsignacionDAO;
/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static ProfesorDAO profesorDAO;
    private static UsuarioDAO usuarioDAO;
    private static UnidadDAO unidadDAO;
    private static AsignacionDAO asignacionDAO;
    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static ProfesorDAO getInstanceProfesorDAO(){
        if(profesorDAO == null){
            profesorDAO = new ProfesorDAO();
            return profesorDAO;
        } else{
            return profesorDAO;
        }
    }
    /**
     * se crea la instancia de usuarioDAO si esta no existe
     */
    public static UsuarioDAO getInstanceUsuarioDAO(){
        if(usuarioDAO == null){
            usuarioDAO = new UsuarioDAO();
            return usuarioDAO;
        } else{
            return usuarioDAO;
        }
    }
    
    /**
     * se crea la instancia para unidad DAO si esta no existe
     */
    public static UnidadDAO getInstanceUnidadDAO(){
        if(unidadDAO == null){
            unidadDAO = new UnidadDAO();
            return unidadDAO;
        } else{
            return unidadDAO;
        }
    }
    
    /**
     * se crea la instancia para asignacion DAO si esta no existe
     */
    public static AsignacionDAO getInstanceAsignacionDAO(){
        if(asignacionDAO == null){
            asignacionDAO = new AsignacionDAO();
            return asignacionDAO;
        } else{
            return asignacionDAO;
        }
    }
}
