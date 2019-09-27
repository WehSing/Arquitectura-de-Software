
package com.demo.model;
import com.demo.model.entity.NewUsuario;
/**
 *
 * @author sergio
 */
public class ModeloNewUsuario {
    static public boolean logUp(NewUsuario userup)   {
        boolean band2=false;
        if (userup.getClaveup().compareTo(userup.getClaveup2())==0)   {
            band2 = true;
        }else   {
            band2 = false;
        }
        return band2;        
    }
}
