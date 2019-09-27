
package demomvc;

import com.demo.controller.ControllerUsuarios;
import com.demo.model.ModeloUsuarios;
import com.demo.model.entity.Usuario;
import com.demo.view.VistaCambiarPassword;
import com.demo.view.VistaLogin;
import com.demo.view.VistaLogup;

public class DemoMVC {

   
    public static void main(String[] args) {
        Usuario mod = new Usuario();
        ModeloUsuarios modC=new ModeloUsuarios();
        VistaLogin frm=new VistaLogin();
        VistaLogup frm2=new VistaLogup();
        VistaCambiarPassword frm3=new VistaCambiarPassword();
        ControllerUsuarios ctrl= new ControllerUsuarios(mod,modC,frm,frm2,frm3);
        ctrl.iniciar();
        frm.setVisible(true);
    }
    
}
