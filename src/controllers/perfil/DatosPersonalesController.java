package controllers.perfil;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import models.dao.Abreviatura_TituloDAO;
import models.dao.PersonasDAO;
import models.dao.PlantelDAO;
import models.implementation.Abreviatura_TituloDAOImpl;
import models.implementation.PersonasDaoImpl;
import models.implementation.PlantelDaoImpl;
import models.pojo.Abreviatura_Titulo;
import models.pojo.Personas;
import models.pojo.Plantel;
import util.Conexion;
import views.perfil.DatosPersonalesVista;
import views.perfil.PerfilVista;
/**
 *
 * @author Jose Antonio Diaz
 */
public class DatosPersonalesController {
    
    DatosPersonalesVista vistaDatosPersonales;
    Personas personaLogueada;
    PersonasDAO personaDAO = new PersonasDaoImpl(Conexion.getConnection());
    PlantelDAO plantelDAO = new PlantelDaoImpl(Conexion.getConnection());
    ArrayList <Plantel> listaPlanteles;
    ArrayList <Abreviatura_Titulo> listaAbreviatura_Tituo;
    PerfilVista vistaPerfil;
    
    DatosPersonalesController(DatosPersonalesVista vistaDatosPersonales, 
            Personas personaLogueada, PerfilVista vistaPerfil) {
       this.vistaDatosPersonales =  vistaDatosPersonales;
       this.personaLogueada = personaLogueada;   
       this.vistaPerfil = vistaPerfil;
       inicializar();
    }
    
    private void inicializar(){
        vistaDatosPersonales.setTitle("Datos personales");
        vistaDatosPersonales.setAlwaysOnTop(true);
        vistaDatosPersonales.setLocationRelativeTo(null);
        vistaDatosPersonales.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaDatosPersonales.setSize(550, 620);
        llenarCampos();
        vistaDatosPersonales.btnGuardarCambios.addActionListener(this::guardarCambios);
        vistaDatosPersonales.setVisible(true);
    }
    
    private void llenarCampos(){
        personaLogueada = personaDAO.obtenerDatosUsuario(personaLogueada.getRfc());
        llenarComboPlanteles();
        llenarComboTituloProfesional();
       
        vistaDatosPersonales.jRadioBotSi.setEnabled(false);
        vistaDatosPersonales.jRadioButNo.setEnabled(false);
        vistaDatosPersonales.txtRfc.setEditable(false);
        
        if (personaLogueada.isEs_externo()) {
            vistaDatosPersonales.jRadioBotSi.setSelected(true);
        }else{
            vistaDatosPersonales.jRadioButNo.setSelected(true);
        }
        
        if (personaLogueada.getClave_plantel() == null) {
            vistaDatosPersonales.boxPlanteles.setSelectedIndex(0);
        }else{
            vistaDatosPersonales.boxPlanteles.setSelectedItem
                (plantelDAO.obtenerNombrePlantel(personaLogueada.getClave_plantel()));
            
        }
      
        vistaDatosPersonales.txtRfc.setText(personaLogueada.getRfc());
        vistaDatosPersonales.txtCurp.setText(personaLogueada.getCurp());
        vistaDatosPersonales.boxTituloProfesional.setSelectedItem(personaLogueada.getIdAbreviatura_Titulo());
        vistaDatosPersonales.txtNombre.setText(personaLogueada.getNombre());
        vistaDatosPersonales.txtApPaterno.setText(personaLogueada.getApe_paterno());
        vistaDatosPersonales.txtApMaterno.setText(personaLogueada.getApe_materno());
        vistaDatosPersonales.txtCorreoElectronico.setText(personaLogueada.getCorreo());
        vistaDatosPersonales.txtTelefono.setText(personaLogueada.getTelefono());
        vistaDatosPersonales.txtClavePresupuestal.setText((personaLogueada.getClave_presupuestal()));
        vistaDatosPersonales.txtNumTarjeta.setText(personaLogueada.getNum_tarjeta());
        
        if (personaLogueada.getFecha_nac() != null) {
            vistaDatosPersonales.chooserFechaNacimiento.setDate(ParseFecha(personaLogueada.getFecha_nac()));
        }
        
        String sexo = personaLogueada.getSexo();
        if ("H".equals(sexo)) {
            vistaDatosPersonales.rbtHombre.setSelected(true);
        }else{
            if ("M".equals(sexo)) {
                vistaDatosPersonales.rbtMujer.setSelected(true);
            }
        }
    }
    
    public void guardarCambios(ActionEvent e){
        String rfc = vistaDatosPersonales.txtRfc.getText().toUpperCase();
        int indicePlantel = Integer.parseInt(String.valueOf(vistaDatosPersonales.boxPlanteles.getSelectedIndex()));
        String clave_plantel;
        if (indicePlantel == 0) {
            clave_plantel = null;
        }else{
            clave_plantel = listaPlanteles.get(indicePlantel - 1).getClave_plantel();
        }
       
        String idabreviatura_titulo = String.valueOf(vistaDatosPersonales.boxTituloProfesional.getSelectedItem());
        String curp = vistaDatosPersonales.txtCurp.getText().toUpperCase();
        String nombre = vistaDatosPersonales.txtNombre.getText().toUpperCase();
        String ape_paterno = vistaDatosPersonales.txtApPaterno.getText().toUpperCase();
        String ape_materno = vistaDatosPersonales.txtApMaterno.getText().toUpperCase();
        String sexo = vistaDatosPersonales.buttonGroupSexo.getSelection().getActionCommand();
       
        String fecha_nacimiento = null;
        if (vistaDatosPersonales.chooserFechaNacimiento.getDate() != null) {
            capturarFecha(vistaDatosPersonales.chooserFechaNacimiento.getDate());
        }
        
        String correo_electronico = vistaDatosPersonales.txtCorreoElectronico.getText();
        String telefono = vistaDatosPersonales.txtTelefono.getText();
        String clave_presupuestal = vistaDatosPersonales.txtClavePresupuestal.getText().toUpperCase();
        String num_tarjeta = vistaDatosPersonales.txtNumTarjeta.getText();
       
        boolean todoCorrecto = false;
        
        if (clave_presupuestal.equals("")) {
            clave_presupuestal = "XXXXXXXXXXXXXXXXXXXX";
        }
        
        if (num_tarjeta.equals("")) {
            num_tarjeta = "XXXX";
        }
        
        Personas personaActualizar = new Personas();
        personaActualizar.setRfc(rfc);
        personaActualizar.setClave_plantel(clave_plantel);
        personaActualizar.setIdAbreviatura_Titulo(idabreviatura_titulo);
        personaActualizar.setCurp(curp);
        personaActualizar.setNombre(nombre);
        personaActualizar.setApe_paterno(ape_materno);
        personaActualizar.setApe_materno(ape_materno);
        personaActualizar.setCorreo(correo_electronico);
        personaActualizar.setTelefono(telefono);
        personaActualizar.setClave_presupuestal(clave_presupuestal);
        personaActualizar.setNum_tarjeta(num_tarjeta);
        personaActualizar.setSexo(sexo);
        personaActualizar.setFecha_nac(fecha_nacimiento);
        
        if (!rfc.equals("")) {
            if (!curp.equals("")) {
                if (!nombre.equals("")) {
                    if (!ape_paterno.equals("")) {
                        if (!ape_materno.equals("")) {
                            if (!correo_electronico.equals("")) {
                                if (!telefono.equals("")) {
                                    if (vistaDatosPersonales.rbtHombre.isSelected() || 
                                            vistaDatosPersonales.rbtMujer.isSelected()) {
                                        if (vistaDatosPersonales.chooserFechaNacimiento.getDate() != null) {
                                            if (vistaDatosPersonales.boxTituloProfesional.getSelectedIndex() !=0) {
                                                todoCorrecto = true;
                                            }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Seleccione una abreviatura de titulo profesional");}
                                        }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Seleccione una fecha");}
                                    }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Seleccione su sexo");}
                                }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir un número de telefono");}
                            }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su correo electrónico");}
                        }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su apellido materno");}
                    }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su apellido paterno");}
                }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su nombre");}
            }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su CURP");}
        }else{JOptionPane.showMessageDialog(vistaDatosPersonales, "Debe escribir su RFC");}
        
        
        if (todoCorrecto) {
            personaDAO.modificarMisDatosPersonales(personaActualizar, personaLogueada.getRfc());
            JOptionPane.showMessageDialog(vistaDatosPersonales, "Datos actualizados correctamente");
            
            String nombre_plantel = personaDAO.obtenerNombrePlantel(clave_plantel);
            vistaPerfil.labelNombre.setText("NOMBRE: " + nombre +" "+ ape_paterno +" "+ ape_materno);
            vistaPerfil.labelRFC.setText("RFC: " + rfc);
            vistaPerfil.labelPlantel.setText("PLATEL: " + nombre_plantel);
            vistaDatosPersonales.dispose();
        }
    }
    
    private void llenarComboPlanteles(){
        listaPlanteles = (ArrayList<Plantel>) plantelDAO.GetAll();
        int iteraciones = listaPlanteles.size();
        for (int i = 0; i < iteraciones; i++) {
            vistaDatosPersonales.boxPlanteles.addItem(listaPlanteles.get(i).getPlantel());
        } 
    } 
    
    public void llenarComboTituloProfesional(){
        Abreviatura_TituloDAO abrevitura_titulo = new Abreviatura_TituloDAOImpl(Conexion.getConnection());
        listaAbreviatura_Tituo = (ArrayList<Abreviatura_Titulo>) abrevitura_titulo.GetAll();
        int iteraciones = listaAbreviatura_Tituo.size();
        for (int i = 0; i < iteraciones; i++) {
            vistaDatosPersonales.boxTituloProfesional.addItem(listaAbreviatura_Tituo.get(i).getIdabreviatura_titulo());
        }
    }
    
    public static Date ParseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
    private String capturarFecha(Date fecha){
        String formato = "yyyy-MM-dd";
        Date fechaInicio = fecha;
        SimpleDateFormat sdf  = new SimpleDateFormat(formato);
        return sdf.format(fechaInicio);
    }
}
