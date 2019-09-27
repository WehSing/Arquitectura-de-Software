package com.demo.model;
import com.demo.model.entity.CambiarPassword;

public class ModeloCambiarPassword extends Model{
    static public boolean cambiarpass(CambiarPassword cpassword)   {
        boolean band3=false;
        if (cpassword.getPassword().compareTo(cpassword.getPassword2())==0)   {
            band3 = true;
        }else   {
            band3 = false;
        }
        return band3;        
    }
}
