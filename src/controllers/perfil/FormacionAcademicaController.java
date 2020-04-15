package controllers.perfil;
/*import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import modelos.entidades.Persona;
import modelos.entidades.Persona_FormacionAcademica;
import modelos.sql.FormacionAcademicaSQL;
import vistas.modulos.perfil.FormacionAcademica;*/
/**
 * @author Jose Antonio Diaz
 */
public class FormacionAcademicaController {
    /*
    FormacionAcademica vistaFormacion_academica;
    Persona personaLogueada;
    DefaultTableModel modelTablaFormacionAcademica;
    FormacionAcademicaSQL sqlFormacionAcademica = new FormacionAcademicaSQL();

    FormacionAcademicaController(FormacionAcademica vistaFormacion_academica, 
            Persona personaLogueada) {
        
        this.vistaFormacion_academica = vistaFormacion_academica;
        this.personaLogueada = personaLogueada;
        modelTablaFormacionAcademica = (DefaultTableModel)this.vistaFormacion_academica.tblFormacionAcademica.getModel();
        vistaFormacion_academica.btnRegistrar.addActionListener(this::Registrar);
        vistaFormacion_academica.btnGuardarCambios.addActionListener(this::guardarCambios);
        vistaFormacion_academica.btnEliminar.addActionListener(this::eliminar);
        vistaFormacion_academica.tblFormacionAcademica.addMouseListener(new java.awt.event.MouseAdapter() {
       @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
             if(e.getClickCount() == 2){
                llenarCampos();
              }
        }});
        inicializar();
    }
    
    private void inicializar(){
        vistaFormacion_academica.setTitle("Formación académica");
        vistaFormacion_academica.setAlwaysOnTop(true);
        vistaFormacion_academica.setLocationRelativeTo(null);
        vistaFormacion_academica.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaFormacion_academica.setSize(850, 463);
        llenarTablaFormacionAcademica();
        vistaFormacion_academica.setVisible(true);
    }

    private void llenarTablaFormacionAcademica() {
        modelTablaFormacionAcademica.setNumRows(0);
        List<Persona_FormacionAcademica>lista = sqlFormacionAcademica.listaFormacionAcademica(personaLogueada.getRFC());
        for (int i = 0; i < lista.size(); i++) {
            modelTablaFormacionAcademica.addRow(new Object[]{
                lista.get(i).getIdpersona_formacion_academica(),
                lista.get(i).getRfc(),
                lista.get(i).getFormacion_academica(),
                lista.get(i).getInstitucion(),
                lista.get(i).getTitulacion(),
                lista.get(i).getCedula_profesional(),
                lista.get(i).getClave_carrera()
            });   
        }
    }
    
    private void llenarCampos(){
        
        vistaFormacion_academica.btnRegistrar.setEnabled(false);
        vistaFormacion_academica.btnGuardarCambios.setEnabled(true);
        int filaSeleccionadaFormacion = vistaFormacion_academica.tblFormacionAcademica.getSelectedRow();
        int idpersona_formacion_academica = Integer.parseInt(String.valueOf(vistaFormacion_academica.tblFormacionAcademica.getValueAt(filaSeleccionadaFormacion, 0)));
        Persona_FormacionAcademica formacion = sqlFormacionAcademica.datosFormacionAcademica(idpersona_formacion_academica);
        vistaFormacion_academica.boxFormacionAcademica.setSelectedIndex(formacion.getIdformacion_academica());
        vistaFormacion_academica.textInstitucion.setText(formacion.getInstitucion());
        vistaFormacion_academica.textTitulacion.setText(formacion.getTitulacion());
        vistaFormacion_academica.textCedula.setText(formacion.getCedula_profesional());
        vistaFormacion_academica.textClaveCarrera.setText(formacion.getClave_carrera());
    }

    private void Registrar(ActionEvent e) {

       String rfc = personaLogueada.getRFC();
       int idexperiencia_laboral = vistaFormacion_academica.boxFormacionAcademica.getSelectedIndex();
       String institucion = vistaFormacion_academica.textInstitucion.getText();
       String titulacion = vistaFormacion_academica.textTitulacion.getText();
       String cedula_profesional = vistaFormacion_academica.textCedula.getText();
       String clave_carrera = vistaFormacion_academica.textClaveCarrera.getText();
       
        if (cedula_profesional.equals("")) {
            cedula_profesional = "NO ESPECIFICADO";
        }
        if (clave_carrera.equals("")) {
            clave_carrera = "NO ESPECIFICADO";
        }
       
        if (idexperiencia_laboral != 0) {
            if (!institucion.equals("")) {
                if (!titulacion.equals("")) {
                        sqlFormacionAcademica.registrarFormacionAcademica(rfc, idexperiencia_laboral, institucion, titulacion, cedula_profesional, clave_carrera);
                        JOptionPane.showMessageDialog(vistaFormacion_academica, "Operacion completada correctamente");
                        llenarTablaFormacionAcademica();
                        vaciarCampos();
                        vistaFormacion_academica.btnGuardarCambios.setEnabled(true);
                }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el titulo adquirido");}
            }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el nombre de la institución");}
        }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe elegir un tipo de formación");}
       llenarTablaFormacionAcademica();
    }

    private void guardarCambios(ActionEvent e) {
        int filaSeleccionadaFormacion = vistaFormacion_academica.tblFormacionAcademica.getSelectedRow();
        int idpersona_formacion_academica = Integer.parseInt(String.valueOf(vistaFormacion_academica.tblFormacionAcademica.getValueAt(filaSeleccionadaFormacion, 0)));
       String rfc = personaLogueada.getRFC();
       int idexperiencia_laboral = vistaFormacion_academica.boxFormacionAcademica.getSelectedIndex();
       String institucion = vistaFormacion_academica.textInstitucion.getText();
       String titulacion = vistaFormacion_academica.textTitulacion.getText();
       String cedula_profesional = vistaFormacion_academica.textCedula.getText();
       String clave_carrera = vistaFormacion_academica.textClaveCarrera.getText();
       
        if (cedula_profesional.equals("")) {
            cedula_profesional = "NO ESPECIFICADO";
        }
        if (clave_carrera.equals("")) {
            clave_carrera = "NO ESPECIFICADO";
        }
       
        if (idexperiencia_laboral != 0) {
            if (!institucion.equals("")) {
                if (!titulacion.equals("")) {
                    sqlFormacionAcademica.editarFormacionAcademica(idpersona_formacion_academica, rfc, idexperiencia_laboral, institucion, titulacion, cedula_profesional, clave_carrera);
                    JOptionPane.showMessageDialog(vistaFormacion_academica, "Operacion completada correctamente");
                    llenarTablaFormacionAcademica();
                    vaciarCampos();
                    vistaFormacion_academica.btnRegistrar.setEnabled(true);
                    vistaFormacion_academica.btnGuardarCambios.setEnabled(false);
                }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el titulo adquirido");}
            }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe escribir el nombre de la institución");}
        }else{JOptionPane.showMessageDialog(vistaFormacion_academica, "Debe elegir un tipo de formación");}
       llenarTablaFormacionAcademica();
    }

    private void eliminar(ActionEvent e) {
        int filaSeleccionadaHorario = vistaFormacion_academica.tblFormacionAcademica.getSelectedRow();
        int idexperiencia_laboral = Integer.parseInt(String.valueOf(vistaFormacion_academica.tblFormacionAcademica.getValueAt(filaSeleccionadaHorario, 0)));
        int res = JOptionPane.showConfirmDialog(vistaFormacion_academica, "Confirmar eliminación");
       
        if (res == JOptionPane.YES_OPTION) {
            sqlFormacionAcademica.eliminarFormacionAcademica(idexperiencia_laboral);
            JOptionPane.showMessageDialog(vistaFormacion_academica, "Operacion completada correctamente");
            llenarTablaFormacionAcademica();
        }
    }

    private void vaciarCampos() {
       vistaFormacion_academica.boxFormacionAcademica.setSelectedIndex(0);
       vistaFormacion_academica.textInstitucion.setText("");
       vistaFormacion_academica.textTitulacion.setText("");
       vistaFormacion_academica.textCedula.setText("");
       vistaFormacion_academica.textClaveCarrera.setText("");
    }
    */
}
