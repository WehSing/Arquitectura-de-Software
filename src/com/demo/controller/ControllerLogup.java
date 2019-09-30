package com.demo.controller;
import com.demo.model.ModeloNewUsuario;
import com.demo.model.ModeloUsuarios;
import com.demo.model.entity.NewUsuario;
import com.demo.model.entity.Usuario;
import com.demo.view.VistaLogin;
import com.demo.view.VistaLogup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class ControllerLogup implements ActionListener{
    public ControllerLogup()    {
        
    }
//    public boolean logUp(String claveup,String claveup2){
//        boolean band2 = false;
//        NewUsuario userup= new NewUsuario(claveup,claveup2);
//        band2= ModeloNewUsuario.logUp(userup);
//        return band2;
    VistaLogup vistalogup =new VistaLogup();
    
    VistaLogin vistalogin=new VistaLogin();
    ModeloUsuarios modelousuarios = new ModeloUsuarios();
    boolean usuario;
    
    public ControllerLogup(VistaLogup vistalogup , ModeloUsuarios modelousuarios){
        this.modelousuarios=modelousuarios;
        this.vistalogup=vistalogup;
        this.vistalogup.btnRegistrar.addActionListener(this);
    }
    public void IniciarLogup( ) {
        
    }
    public void actionPerformed(ActionEvent e)  {
        String nombres=vistalogup.txtNombres.getText();
        String apellidos=vistalogup.txtApellido.getText();
        String email= vistalogup.txtUsuario.getText();
        String clave= vistalogup.txtPassword.getText();
        String clave2=vistalogup.txtPassword2.getText();
        usuario=modelousuarios.logup(nombres,apellidos,email, clave);
        if(!clave.equals(clave2))   {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }else   {
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
        }
        
    }
}
