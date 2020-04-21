package controllers.perfil;

import controllers.login.LoginController;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import models.dao.UserDAO;
import models.implementation.UserDaoImpl;
import models.pojo.Personas;
import models.pojo.Usuarios;
import views.dashboard.DashboardAdmin;
import views.usuarios.CambiarContraseña;
import util.Conexion;
import views.login.Login;

/**
 * @author Jose Antonio Diaz
 */
public class CambiarMiContraseñaController {
    
    CambiarContraseña vistaCambiarContraseña;
    Personas personaLogueada; 
    Usuarios modeloUsuario; 
    DashboardAdmin mainView;
    UserDAO sqlUsuario = new UserDaoImpl(Conexion.getConnection());

    CambiarMiContraseñaController(CambiarContraseña vistaCambiarContraseña, 
            Personas personaLogueada, Usuarios modeloUsuario, 
            DashboardAdmin mainView) {
        
        this.vistaCambiarContraseña =  vistaCambiarContraseña;
        this.personaLogueada = personaLogueada;
        this.modeloUsuario = modeloUsuario;
        this.mainView = mainView;
        
       vistaCambiarContraseña.btnCambiarContraseña.addActionListener(this::cambiarContraseña);
       inicializar();

    }
    
    private void inicializar(){
        vistaCambiarContraseña.setTitle("Cambiar contraseña");
        vistaCambiarContraseña.setLocationRelativeTo(null);
        vistaCambiarContraseña.setSize(302, 230);
        vistaCambiarContraseña.setVisible(true);
        vistaCambiarContraseña.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void cambiarContraseña(ActionEvent e) {
       
        int idrol = sqlUsuario.obtenerIdrolUsuario(modeloUsuario.getUsuario(), modeloUsuario.getPassword());
        String rfc = personaLogueada.getRfc();
        
        String contraseñaNueva = vistaCambiarContraseña.passNueva.getText();
        String contraseñaRepetida = vistaCambiarContraseña.passRepetida.getText();
        
        if (contraseñaNueva.equals(contraseñaRepetida)) {
            sqlUsuario.cambiarContraseña(contraseñaNueva, idrol, rfc);
            JOptionPane.showMessageDialog(vistaCambiarContraseña, "Contraseña cambiada correctamente");
            vistaCambiarContraseña.dispose();
            JOptionPane.showMessageDialog(vistaCambiarContraseña, "Deberá iniciar sesión de nuevo");
            mainView.dispose();
            iniciarSesion();
        }else{
            vistaCambiarContraseña.labelAviso.setText("Las contraseñas no coinciden");
        }
    }
    
    private void iniciarSesion(){
        Login vista = new Login();
        LoginController ctrl = new LoginController(vista);
    }
}
