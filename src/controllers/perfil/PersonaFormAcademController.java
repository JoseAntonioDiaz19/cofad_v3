package controllers.perfil;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import models.dao.Formacion_AcademicaDAO;
import models.dao.PersonaFormAcademDAO;
import models.implementation.Formacion_AcademicaDaoImpl;
import models.implementation.PersonaFormAcademDaoImpl;
import models.pojo.Formacion_Academica;
import models.pojo.PersonaFormacionAcademica;
import models.pojo.Personas;
import views.perfil.PersonaFormAcademVista;
import util.Conexion;

/**
 * @author Jose Antonio Diaz
 */
public class PersonaFormAcademController {

    PersonaFormAcademVista vistaFormacion_academica;
    Personas personaLogueada;
    DefaultTableModel modelTablaFormacionAcademica;
    PersonaFormAcademDAO sqlFormacionAcademica = new PersonaFormAcademDaoImpl(Conexion.getConnection());
    Formacion_AcademicaDAO formacionAcademicaDao = new Formacion_AcademicaDaoImpl(Conexion.getConnection());
    List<PersonaFormacionAcademica> listaPersonaFormAcadem;
    List<Formacion_Academica> listaFormacionAcademica;

    PersonaFormAcademController(PersonaFormAcademVista vistaFormacion_academica, Personas personaLogueada) {
        this.vistaFormacion_academica = vistaFormacion_academica;
        this.personaLogueada = personaLogueada;
        modelTablaFormacionAcademica = (DefaultTableModel) this.vistaFormacion_academica.tblFormacionAcademica.getModel();
        vistaFormacion_academica.btnRegistrar.addActionListener(this::Registrar);
        vistaFormacion_academica.btnGuardarCambios.addActionListener(this::guardarCambios);
        vistaFormacion_academica.btnEliminar.addActionListener(this::eliminar);
        vistaFormacion_academica.tblFormacionAcademica.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 2) {
                    llenarCampos();
                }
            }
        });
        inicializar();
    }

    private void inicializar() {
        vistaFormacion_academica.setTitle("Formación académica");
        vistaFormacion_academica.setAlwaysOnTop(true);
        vistaFormacion_academica.setLocationRelativeTo(null);
        vistaFormacion_academica.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaFormacion_academica.setSize(850, 463);
        llenarTablaFormacionAcademica();
        llenarComboFormacionAcademica();
        vistaFormacion_academica.btnRegistrar.setEnabled(true);
        vistaFormacion_academica.btnGuardarCambios.setEnabled(false);
        vistaFormacion_academica.btnEliminar.setEnabled(false);
        vistaFormacion_academica.setVisible(true);
    }

    private void llenarTablaFormacionAcademica() {
        modelTablaFormacionAcademica.setNumRows(0);
        listaPersonaFormAcadem = sqlFormacionAcademica.GetAllBy(personaLogueada.getRfc());
        int id = 1;
        for (int i = 0; i < listaPersonaFormAcadem.size(); i++) {
            modelTablaFormacionAcademica.addRow(new Object[]{
                id++,
                listaPersonaFormAcadem.get(i).getFormacion_academica(),
                listaPersonaFormAcadem.get(i).getInstitucion(),
                listaPersonaFormAcadem.get(i).getTitulacion(),
                listaPersonaFormAcadem.get(i).getCedula_profesional()
            });
        }
    }

    private void llenarCampos() {
        vistaFormacion_academica.btnRegistrar.setEnabled(false);
        vistaFormacion_academica.btnGuardarCambios.setEnabled(true);
        vistaFormacion_academica.btnEliminar.setEnabled(true);
        
        int filaSeleccionadaFormacion = vistaFormacion_academica.tblFormacionAcademica.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(vistaFormacion_academica.tblFormacionAcademica.getValueAt(filaSeleccionadaFormacion, 0)));
        
        String formacion_academica = listaPersonaFormAcadem.get(id - 1).getFormacion_academica();
        String institucion = listaPersonaFormAcadem.get(id - 1).getInstitucion();
        String titulacion = listaPersonaFormAcadem.get(id - 1).getTitulacion();
        String cedula_profesional =  listaPersonaFormAcadem.get(id - 1).getCedula_profesional();
        
        vistaFormacion_academica.textCedula.setText(cedula_profesional);
        vistaFormacion_academica.textInstitucion.setText(institucion);
        vistaFormacion_academica.textTitulacion.setText(titulacion);
        vistaFormacion_academica.boxFormacionAcademica.setSelectedItem(formacion_academica);
         
    }

    private void Registrar(ActionEvent e) {

       String rfc = personaLogueada.getRfc();
       int indexFormacion_academica = vistaFormacion_academica.boxFormacionAcademica.getSelectedIndex();
       String institucion = vistaFormacion_academica.textInstitucion.getText();
       String titulacion = vistaFormacion_academica.textTitulacion.getText();
       String cedula_profesional = vistaFormacion_academica.textCedula.getText();
       
        int idformacion_academica = listaFormacionAcademica.get(indexFormacion_academica - 1).getIdformacion_academica();
       
        if (cedula_profesional.equals("")) {
            cedula_profesional = "NO ESPECIFICADO";
        }
        
        PersonaFormacionAcademica nuevoPersonaFormacion = new PersonaFormacionAcademica();
        nuevoPersonaFormacion.setRfc(rfc);
        nuevoPersonaFormacion.setIdformacion_academica(idformacion_academica);
        nuevoPersonaFormacion.setInstitucion(institucion);
        nuevoPersonaFormacion.setTitulacion(titulacion);
        nuevoPersonaFormacion.setCedula_profesional(cedula_profesional);

        boolean camposLlenos = false;
        if (indexFormacion_academica != 0) {
            if (!institucion.equals("")) {
                if (!titulacion.equals("")) {
                    camposLlenos = true;
                }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el titulo adquirido");}
            }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el nombre de la institución");}
        }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe elegir un tipo de formación");}
       llenarTablaFormacionAcademica();
       
        if (camposLlenos) {
           try {
                sqlFormacionAcademica.Insert(nuevoPersonaFormacion);
                JOptionPane.showMessageDialog(vistaFormacion_academica, "Operacion completada correctamente");
                vaciarCampos();
                llenarTablaFormacionAcademica();
           } catch (SQLException ex) {
               System.out.println(ex);
           }
        }
    }

    private void guardarCambios(ActionEvent e) {
        
        int indexFormacion_academica = vistaFormacion_academica.boxFormacionAcademica.getSelectedIndex();
        int idformacion_academica = listaFormacionAcademica.get(indexFormacion_academica - 1).getIdformacion_academica();
       
        String rfc = personaLogueada.getRfc();
        String institucion = vistaFormacion_academica.textInstitucion.getText();
        String titulacion = vistaFormacion_academica.textTitulacion.getText();
        String cedula_profesional = vistaFormacion_academica.textCedula.getText();
        
        int filaSeleccionadaFormacion = vistaFormacion_academica.tblFormacionAcademica.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(vistaFormacion_academica.tblFormacionAcademica.getValueAt(filaSeleccionadaFormacion, 0)));
        int idpersona_formacionacademica =  listaPersonaFormAcadem.get(id - 1).getIdpersona_formacionacademica();
     
        if (cedula_profesional.equals("")) {
            cedula_profesional = "NO ESPECIFICADO";
        }
        
        PersonaFormacionAcademica nuevoPersonaFormacion = new PersonaFormacionAcademica();
        nuevoPersonaFormacion.setIdpersona_formacionacademica(idpersona_formacionacademica);
        nuevoPersonaFormacion.setRfc(rfc);
        nuevoPersonaFormacion.setIdformacion_academica(idformacion_academica);
        nuevoPersonaFormacion.setInstitucion(institucion);
        nuevoPersonaFormacion.setTitulacion(titulacion);
        nuevoPersonaFormacion.setCedula_profesional(cedula_profesional);

        boolean camposLlenos = false;
        if (indexFormacion_academica != 0) {
            if (!institucion.equals("")) {
                if (!titulacion.equals("")) {
                    camposLlenos = true;
                }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el titulo adquirido");}
            }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el nombre de la institución");}
        }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe elegir un tipo de formación");}
       llenarTablaFormacionAcademica();
       
        if (camposLlenos) {
           try {
               sqlFormacionAcademica.Update(nuevoPersonaFormacion);
                JOptionPane.showMessageDialog(vistaFormacion_academica, "Operacion completada correctamente");
                vaciarCampos();
                llenarTablaFormacionAcademica();
                vistaFormacion_academica.btnRegistrar.setEnabled(true);
                vistaFormacion_academica.btnGuardarCambios.setEnabled(false);
                vistaFormacion_academica.btnEliminar.setEnabled(false);
           } catch (SQLException ex) {
               System.out.println(ex);
           }

        }
    }

    private void eliminar(ActionEvent e) {
        int filaSeleccionadaFormacion = vistaFormacion_academica.tblFormacionAcademica.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(vistaFormacion_academica.tblFormacionAcademica.getValueAt(filaSeleccionadaFormacion, 0)));
        int idpersona_formacionacademica =  listaPersonaFormAcadem.get(id - 1).getIdpersona_formacionacademica();
        
        PersonaFormacionAcademica eliminarPersonaFormacion = new PersonaFormacionAcademica();
        eliminarPersonaFormacion.setIdpersona_formacionacademica(idpersona_formacionacademica);
        
        int res = JOptionPane.showConfirmDialog(vistaFormacion_academica, "Confirmar eliminación");
       
        if (res == JOptionPane.YES_OPTION) {
            sqlFormacionAcademica.Delete(eliminarPersonaFormacion);
            JOptionPane.showMessageDialog(vistaFormacion_academica, "Operacion completada correctamente");
            vistaFormacion_academica.btnRegistrar.setEnabled(true);
            vistaFormacion_academica.btnGuardarCambios.setEnabled(false);
            vistaFormacion_academica.btnEliminar.setEnabled(false);
            vaciarCampos();
            llenarTablaFormacionAcademica();
        }
    }

    private void vaciarCampos() {
       vistaFormacion_academica.boxFormacionAcademica.setSelectedIndex(0);
       vistaFormacion_academica.textInstitucion.setText("");
       vistaFormacion_academica.textTitulacion.setText("");
       vistaFormacion_academica.textCedula.setText("");
    }
    
    private void llenarComboFormacionAcademica(){
        listaFormacionAcademica = formacionAcademicaDao.GetAll();
        int iteraciones = listaFormacionAcademica.size();
        for (int i = 0; i < iteraciones; i++) {
            vistaFormacion_academica.boxFormacionAcademica.addItem
                (listaFormacionAcademica.get(i).getFormacion_academica());
        } 
    }
}
