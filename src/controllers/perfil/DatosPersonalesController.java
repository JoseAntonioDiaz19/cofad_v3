package controllers.perfil;
/*import controladores.modulos.login.LoginController;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelos.entidades.Persona;
import modelos.entidades.Usuario;
import modelos.sql.PersonaSQL;
import modelos.sql.UsuarioSQL;
import vistas.modulos.login.login;
import vistas.modulos.perfil.DatosPersonales;
import vistas.modulos.vistasPrincipales.Principal_GUI;

import javax.sql.DataSource;
/**
 *
 * @author Jose Antonio Diaz
 */
public class DatosPersonalesController {
    /*
    DataSource pool;
    
    DatosPersonales vistaDatosPersonales;
    Persona personaLogueada;
    Principal_GUI mainView;
    

    DatosPersonalesController(DatosPersonales vistaDatosPersonales, 
            Persona personaLogueada, Principal_GUI mainView, 
            DataSource pool) {
       this.vistaDatosPersonales =  vistaDatosPersonales;
       this.personaLogueada = personaLogueada;     
       this.mainView = mainView;
       this.pool = pool;
       inicializar();
    }
    
    private void inicializar(){
        vistaDatosPersonales.setTitle("Datos personales");
        vistaDatosPersonales.setAlwaysOnTop(true);
        vistaDatosPersonales.setLocationRelativeTo(null);
        vistaDatosPersonales.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaDatosPersonales.setSize(850, 463);
        llenarCampos();
        vistaDatosPersonales.btnGuardarCambios.addActionListener(this::guardarCambios);
        vistaDatosPersonales.setVisible(true);
    }
    
    private void llenarCampos(){
        vistaDatosPersonales.txtRfc.setText(personaLogueada.getRFC());
        vistaDatosPersonales.txtCurp.setText(personaLogueada.getCURP());
        vistaDatosPersonales.txtNombre.setText(personaLogueada.getNombre());
        vistaDatosPersonales.txtApPaterno.setText(personaLogueada.getaPaterno());
        vistaDatosPersonales.txtApMaterno.setText(personaLogueada.getaMaterno());
        vistaDatosPersonales.txtCorreoElectronico.setText(personaLogueada.getCorreo_electronico());
        vistaDatosPersonales.txtTelefono.setText(personaLogueada.getNoTelefono());
        vistaDatosPersonales.txtClavePresupuestal.setText((personaLogueada.getClave_presupuestal()));
        vistaDatosPersonales.txtNumTarjeta.setText(personaLogueada.getNo_tarjeta());
        String sexo = personaLogueada.getSexo();
        
        if ("H".equals(sexo)) {
            vistaDatosPersonales.rbtHombre.setSelected(true);
        }else{
            if ("M".equals(sexo)) {
                vistaDatosPersonales.rbtMujer.setSelected(true);
            }else{
                //No se selecciona ninguno
            }
        }
    
    }
    public void guardarCambios(ActionEvent e){
        String rfc = vistaDatosPersonales.txtRfc.getText().toUpperCase();
        String curp = vistaDatosPersonales.txtCurp.getText().toUpperCase();
        String nombre = vistaDatosPersonales.txtNombre.getText().toUpperCase();
        String ape_paterno = vistaDatosPersonales.txtApPaterno.getText().toUpperCase();
        String ape_materno = vistaDatosPersonales.txtApMaterno.getText().toUpperCase();
        String correo_electronico = vistaDatosPersonales.txtCorreoElectronico.getText();
        String telefono = vistaDatosPersonales.txtTelefono.getText();
        String clave_presupuestal = vistaDatosPersonales.txtClavePresupuestal.getText().toUpperCase();
        String num_tarjeta = vistaDatosPersonales.txtNumTarjeta.getText();
        String sexo = vistaDatosPersonales.buttonGroupSexo.getSelection().getActionCommand();
        boolean todoCorrecto = false;
        
        if (clave_presupuestal.equals("")) {
            clave_presupuestal = "XXXXXXXXXXXXXXXXXXXX";
        }
        
        if (num_tarjeta.equals("")) {
            num_tarjeta = "XXXX";
        }
        
        Persona personaActualizar = new Persona();
        personaActualizar.setRFC(rfc);
        personaActualizar.setCURP(curp);
        personaActualizar.setNombre(nombre);
        personaActualizar.setaPaterno(ape_materno);
        personaActualizar.setaMaterno(ape_materno);
        personaActualizar.setCorreo_electronico(correo_electronico);
        personaActualizar.setNoTelefono(telefono);
        personaActualizar.setClave_presupuestal(clave_presupuestal);
        personaActualizar.setNo_tarjeta(num_tarjeta);
        personaActualizar.setSexo(sexo);
        
        if (!rfc.equals("")) {
            if (!curp.equals("")) {
                if (!nombre.equals("")) {
                    if (!ape_paterno.equals("")) {
                        if (!ape_materno.equals("")) {
                            if (!correo_electronico.equals("")) {
                                if (!telefono.equals("")) {
                                    if (vistaDatosPersonales.rbtHombre.isSelected() || 
                                            vistaDatosPersonales.rbtMujer.isSelected()) {
                                            todoCorrecto = true;
                                    }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Seleccione su sexo");}
                                }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir un número de telefono");}
                            }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su correo electrónico");}
                        }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su apellido materno");}
                    }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su apellido paterno");}
                }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su nombre");}
            }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su CURP");}
        }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su RFC");}
        
        
        if (todoCorrecto) {
            PersonaSQL sqlPersona = new PersonaSQL();
            sqlPersona.setDataSource(pool);
            sqlPersona.modificarMisDatosPersonales(personaActualizar, personaLogueada.getRFC());
            JOptionPane.showMessageDialog(vistaDatosPersonales, "Datos actualizados correctamente");
            vistaDatosPersonales.dispose();
            JOptionPane.showMessageDialog(vistaDatosPersonales, "Inicie sesión de nuevo para aplicar los cambios");
            cerrarSesion();
        }
        
    }
    
    public void cerrarSesion(){
            login plog = new login();
            Usuario modeloUsuario = new Usuario();
            UsuarioSQL sqlUsuario = new UsuarioSQL();
        
            LoginController ctrl = new LoginController(plog, modeloUsuario, sqlUsuario, pool);
            mainView.dispose();
    }
*/
}
