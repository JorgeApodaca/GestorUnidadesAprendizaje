/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.GestorUnidadesAprendizaje.delegate;

import java.util.List;
import mx.gestorunidadesaprendizaje.entidad.Usuarios;
import mx.devs.persistencia.ServiceLocator;

/**
 *
 * @author EduardoCardona <>
 */
public class DelegateUsuario {
    
    /**
     * Metodo para verificar si el usuario esta registrado en la bd
     * @param password 
     * @param correo
     * @return un tipo usuario si no encuntra el usuario sera null
     */
    public Usuarios login(String password, String correo){
        Usuarios usuario = new Usuarios();
        List<Usuarios> usuarios = ServiceLocator.getInstanceUsuarioDAO().findAll();
        
        for(Usuarios us:usuarios){
            if(us.getPassword().equalsIgnoreCase(password) && us.getClaveUsuario().equalsIgnoreCase(correo)){
                usuario = us;
            }
        }
        return usuario;
    }
    
    /**
     * Metodo de ejemplo para guardar Usuario
     * @param usuario de tipo usuario con id 0 para poder que se cree un id nuevo
     */
    public void saveUsario(Usuarios usuario){
        ServiceLocator.getInstanceUsuarioDAO().save(usuario);
    }
    
}
