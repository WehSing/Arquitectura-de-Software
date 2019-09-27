
package com.demo.controller;

import com.demo.model.ModeloUsuario;
import com.demo.model.entity.Usuario;
import javax.swing.JOptionPane;


public class ControllerLogin extends Controller {
    
//    public ControllerLogin(){
//    
//    }
//    
//    public boolean logIn(String usuario, String clave){
//        boolean band = false;
//        
//        Usuario user = new Usuario(usuario, clave);
//        
//        band = ModeloUsuario.logIn(user);
//        
//        return band;
//    }
    
    public void validarUsuario(String usuarios[], String user, String password )   {
        boolean encontrado=false;
        for(int i=0; i<usuarios.length;i++) {
            if(usuarios[i].equals(user)&& usuarios[i+1].equals(password)){  
               JOptionPane.showMessageDialog(null, "Bienvenido" ) ;
               encontrado=true;
            }                
        }
        if (encontrado==false) {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }  
        
    }
       
        
}
