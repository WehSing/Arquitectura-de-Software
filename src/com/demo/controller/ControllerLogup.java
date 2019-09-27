package com.demo.controller;
import com.demo.model.ModeloNewUsuario;
import com.demo.model.entity.NewUsuario;
public class ControllerLogup extends Controller{
    public ControllerLogup()    {
        
    }
    public boolean logUp(String claveup,String claveup2){
        boolean band2 = false;
        NewUsuario userup= new NewUsuario(claveup,claveup2);
        band2= ModeloNewUsuario.logUp(userup);
        return band2;
        
    }
}
