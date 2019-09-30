
package demomvc;

import com.demo.controller.ControllerLogin;
import com.demo.controller.ControllerLogup;
import com.demo.model.ModeloUsuarios;
import com.demo.view.VistaLogin;
import com.demo.view.VistaLogup;




public class DemoMVC {

   
    public static void main(String[] args) {
     VistaLogin vistalog=new VistaLogin();
     ModeloUsuarios modelusuarios=new ModeloUsuarios();
     ControllerLogin controlog=new ControllerLogin(vistalog,modelusuarios);
     vistalog.setVisible(true);
     vistalog.setLocationRelativeTo(null);
     VistaLogup vistalogup=new VistaLogup();   
     ControllerLogup controlup=new ControllerLogup(vistalogup,modelusuarios);
     vistalogup.setVisible(true);
     vistalogup.setLocationRelativeTo(null);
    }
    
}
