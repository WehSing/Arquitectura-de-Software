package com.demo.controller;

import com.demo.model.ModeloUsuarios;
import com.demo.model.entity.Usuario;
import com.demo.view.VistaLogin;
import com.demo.view.VistaLogup;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.*;


public class ControllerLogin  implements ActionListener{
    VistaLogin vistalogin =new VistaLogin();
    ModeloUsuarios modelousuarios = new ModeloUsuarios();
    Usuario usuario= new Usuario();
    
   
        
    public ControllerLogin(VistaLogin vistalogin , ModeloUsuarios modelousuarios){
        this.modelousuarios=modelousuarios;
        this.vistalogin=vistalogin;
        this.vistalogin.jBtnLogin.addActionListener(this);
        this.vistalogin.jBtnLogup.addActionListener(this);
    }
    public void IniciarLogin( ) {
        
    }
    public void actionPerformed(ActionEvent e)  {
        if(e.getSource()==vistalogin.jBtnLogin) {
        String email= vistalogin.JtxtUsuario.getText();
        String clave= vistalogin.jTxtClave.getText();
        usuario=modelousuarios.verificaPreState(email, clave);
        if(usuario==null)       {
            JOptionPane.showMessageDialog(vistalogin,"Usuario no encontrado");
        }else       {
            JOptionPane.showMessageDialog(vistalogin,"Datos Correctos");
            JOptionPane.showMessageDialog(vistalogin, "Bienvenido");
            vistalogin.setVisible(false);
        }       
        }else if(e.getSource()==vistalogin.jBtnLogup)       {
            VistaLogup vistaup=new VistaLogup();
            vistaup.setVisible(true);
        }
                
        
                       
                
    }
    
       
       
        
}
