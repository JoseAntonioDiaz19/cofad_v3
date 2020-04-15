package controllers.perfil;
/*import controladores.modulos.login.LoginController;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelos.entidades.Persona;
import modelos.entidades.Usuario;
import modelos.sql.UsuarioSQL;
import vistas.modulos.login.login;
import vistas.modulos.usuarios.CambiarContraseña;
import vistas.modulos.vistasPrincipales.Principal_GUI;

import javax.sql.DataSource;
/**
 * @author Jose Antonio Diaz
 */
public class CambiarMiContraseñaController {
    /*
    DataSource dataSource;
    CambiarContraseña vistaCambiarContraseña;
    Persona personaLogueada;
    Usuario modeloUsuario;
    Principal_GUI mainView;

    CambiarMiContraseñaController(CambiarContraseña vistaCambiarContraseña, 
            Persona personaLogueada, Usuario modeloUsuario, Principal_GUI mainView,
            DataSource pool) {
       this.vistaCambiarContraseña = vistaCambiarContraseña;
       this.personaLogueada = personaLogueada;
       this.modeloUsuario = modeloUsuario;
       this.mainView = mainView;
       dataSource = pool;
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
       
        UsuarioSQL sqlUsuario = new UsuarioSQL();
        sqlUsuario.setDataSource(dataSource);
        int idrol = sqlUsuario.obtenerIdrolUsuario(modeloUsuario.getUsuario(), modeloUsuario.getPassword());
        String rfc = personaLogueada.getRFC();
        
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
        login plog = new login();
        Usuario modeloUsuario = new Usuario();
        UsuarioSQL sqlUsuario = new UsuarioSQL();
        
        LoginController ctrl = new LoginController(plog, modeloUsuario, sqlUsuario, dataSource);
    }
    */
}
