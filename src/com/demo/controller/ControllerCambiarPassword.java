package com.demo.controller;
import com.demo.model.ModeloCambiarPassword;
import com.demo.model.entity.CambiarPassword;
public class ControllerCambiarPassword extends Controller{
    public ControllerCambiarPassword()      {
        
    }
    public boolean cambiarpass(String password, String password2)   {
        boolean band3=false;
        CambiarPassword cpassword = new CambiarPassword(password,password2);
        band3=ModeloCambiarPassword.cambiarpass(cpassword);
        return band3;
    }
}
