package com.demo.controller;

import com.demo.model.ModeloUsuarios;
import com.demo.model.entity.Usuario;
import com.demo.view.VistaCambiarPassword;
import com.demo.view.VistaLogin;
import com.demo.view.VistaLogup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerUsuarios implements ActionListener {
 private Usuario mod;
 private ModeloUsuarios modC;
 private VistaLogin frm;
 private VistaLogup frm2;
 private VistaCambiarPassword frm3;
 public ControllerUsuarios(Usuario mod, ModeloUsuarios modC, VistaLogin frm,VistaLogup frm2,VistaCambiarPassword frm3)    {
     this.mod=mod;
     this.modC=modC;
     this.frm=frm;
     this.frm.jBtnLogin.addActionListener(this);
     this.frm2.btnRegistrar.addActionListener(this);
     this.frm3.btnCambiar.addActionListener(this);
 }
 public void iniciar()  {
     frm.setTitle("MVC");
     frm.setLocationRelativeTo(null);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
     if(e.getSource()== frm2.btnRegistrar)  {
         mod.setNombres(frm2.txtNombres.getText());
         mod.setApellidos(frm2.txtApellido.getText());
         mod.setEmail(frm2.txtUsuario.getText());
         mod.setClave(frm2.txtPassword.getText());
         
         if(modC.registrar(mod))    {
             JOptionPane.showMessageDialog( null, "Usuario Registrado");
         }else  {
             JOptionPane.showMessageDialog(null,"Usuario no Registrado, Compruebe los datos ingresados");
         }
     }
     if(e.getSource()== frm3.btnCambiar)  {
         mod.setEmail(frm3.txtUregistrar.getText());
         mod.setClave(frm3.txtCregistrar.getText());
         
         if(modC.modificar(mod))    {
             JOptionPane.showMessageDialog( null, "Contraseña Cambiada");
         }else  {
             JOptionPane.showMessageDialog(null,"No se puedo Cambiar la Contraseña, Compruebe los datos ingresados");
         }
     }
     if(e.getSource()== frm.jBtnLogin)  {
         mod.setEmail(frm.JtxtUsuario.getText());
         mod.setClave(frm.jTxtClave.getText());
         
         if(modC.login(mod))    {
             JOptionPane.showMessageDialog( null, "Bienvenido");
         }else  {
             JOptionPane.showMessageDialog(null,"Usuario invalido, Compruebe los datos ingresados");
         }
     }
     
 }
}
