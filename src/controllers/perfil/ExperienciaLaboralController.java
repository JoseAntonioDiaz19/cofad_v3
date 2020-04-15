package controllers.perfil;

/*import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import modelos.entidades.ExperienciaLaboral;
import modelos.entidades.Persona;
import modelos.sql.ExperienciaLaboralSQL;
import vistas.modulos.perfil.Experiencia_Laboral;

/**
 * @author Jose Antonio Diaz
 */

public class ExperienciaLaboralController {
    /*
    Experiencia_Laboral vistaExperienciaLaboral;
    Persona personaLogueada;
    DefaultTableModel modelTablaExperienciaLaboral;
    ExperienciaLaboralSQL sqlExperienciaLaboral = new ExperienciaLaboralSQL();
    
    ExperienciaLaboralController(Experiencia_Laboral vistaExperienciaLaboral, Persona personaLogueada) {
        this.vistaExperienciaLaboral = vistaExperienciaLaboral;
        this.personaLogueada = personaLogueada;
        modelTablaExperienciaLaboral = (DefaultTableModel)this.vistaExperienciaLaboral.tblExperienciaLaboral.getModel();
        vistaExperienciaLaboral.btnRegistrar.addActionListener(this::Registrar);
        vistaExperienciaLaboral.btnGuardarCambios.addActionListener(this::guardarCambios);
        vistaExperienciaLaboral.btnEliminar.addActionListener(this::eliminar);
         vistaExperienciaLaboral.tblExperienciaLaboral.addMouseListener(new java.awt.event.MouseAdapter() {
       @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
             if(e.getClickCount()==2){
                llenarCampos();
              }
        }});
        inicializar();
    }
    
    private void inicializar(){
        vistaExperienciaLaboral.setTitle("Experiencia laboral");
        vistaExperienciaLaboral.setAlwaysOnTop(true);
        vistaExperienciaLaboral.setLocationRelativeTo(null);
        vistaExperienciaLaboral.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaExperienciaLaboral.setSize(850, 463);
        llenarTablaExperienciaLaboral();
        vistaExperienciaLaboral.setVisible(true);
    }
    
    private void llenarTablaExperienciaLaboral(){
      
        modelTablaExperienciaLaboral.setNumRows(0);
        List<ExperienciaLaboral>lista = sqlExperienciaLaboral.listaExperienciaLaboral(personaLogueada.getRFC());
        for (int i = 0; i < lista.size(); i++) {
            modelTablaExperienciaLaboral.addRow(new Object[]{
                lista.get(i).getIdexperiencia_laboral(),
                lista.get(i).getRfc(),
                lista.get(i).getEmpresa(),
                lista.get(i).getPermanencia(),
                lista.get(i).getActividades(),
                lista.get(i).getPuesto()
            });   
        }
    }

    private void Registrar(ActionEvent e) {
      
       int permanencia;
       String rfc = personaLogueada.getRFC();
       String empresa = vistaExperienciaLaboral.textEmpresa.getText();
    	
       try{
            permanencia = Integer.parseInt(vistaExperienciaLaboral.textPermanencia.getText());
            System.out.println("Valor de permanencia: "+permanencia);
    	}catch(NumberFormatException ex){
            permanencia = 0;
    	}
       
       String actividades = vistaExperienciaLaboral.textActividades.getText();
       String puesto = vistaExperienciaLaboral.textPuesto.getText();
       
        if (!empresa.equals("")) {
            if (!actividades.equals("")) {
                if (!puesto.equals("")) {
                    sqlExperienciaLaboral.registrarExperienciaLaboral(rfc, empresa, permanencia, actividades, puesto);
                    JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Operacion completada correctamente");
                    llenarTablaExperienciaLaboral();
                    vaciarCampos();
                    vistaExperienciaLaboral.btnGuardarCambios.setEnabled(true);
                }else{JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Debe escribir el puesto");}
            }else{JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Debe escribir las actividades");}
        }else{JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Debe escribir el nombre de la empresa");}
       llenarTablaExperienciaLaboral();
    }

    private void guardarCambios(ActionEvent e) {
        int filaSeleccionadaHorario = vistaExperienciaLaboral.tblExperienciaLaboral.getSelectedRow();
        int idexperiencia_laboral = Integer.parseInt(String.valueOf(vistaExperienciaLaboral.tblExperienciaLaboral.getValueAt(filaSeleccionadaHorario, 0)));
        int permanencia;
       
       String rfc = personaLogueada.getRFC();
       String empresa = vistaExperienciaLaboral.textEmpresa.getText();
    	
       try{
            permanencia = Integer.parseInt(vistaExperienciaLaboral.textPermanencia.getText());
            System.out.println(permanencia);
    	}catch(NumberFormatException ex){
            permanencia = 0;
    	}
       
       String actividades = vistaExperienciaLaboral.textActividades.getText();
       String puesto = vistaExperienciaLaboral.textPuesto.getText();
       
        if (!empresa.equals("")) {
            if (!actividades.equals("")) {
                if (!puesto.equals("")) {
                    sqlExperienciaLaboral.editarExperienciaLaboral(idexperiencia_laboral, empresa, permanencia, actividades, puesto);
                    JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Operacion completada correctamente");
                    llenarTablaExperienciaLaboral();
                    vaciarCampos();
                    vistaExperienciaLaboral.btnRegistrar.setEnabled(true);
                    vistaExperienciaLaboral.btnGuardarCambios.setEnabled(false);
                }else{JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Debe escribir el puesto");}
            }else{JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Debe escribir las actividades");}
        }else{JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Debe escribir el nombre de la empresa");}
         
    }

    private void eliminar(ActionEvent e) {
        int filaSeleccionadaHorario = vistaExperienciaLaboral.tblExperienciaLaboral.getSelectedRow();
        int idexperiencia_laboral = Integer.parseInt(String.valueOf(vistaExperienciaLaboral.tblExperienciaLaboral.getValueAt(filaSeleccionadaHorario, 0)));
        int res = JOptionPane.showConfirmDialog(vistaExperienciaLaboral, "Confirmar eliminación");
       
        if (res == JOptionPane.YES_OPTION) {
            sqlExperienciaLaboral.eliminarExperienciaLaboral(idexperiencia_laboral);
            JOptionPane.showMessageDialog(vistaExperienciaLaboral, "Operacion completada correctamente");
            llenarTablaExperienciaLaboral();
        }
    }
    
    private void llenarCampos(){
        vistaExperienciaLaboral.btnRegistrar.setEnabled(false);
        vistaExperienciaLaboral.btnGuardarCambios.setEnabled(true);
        int filaSeleccionadaHorario = vistaExperienciaLaboral.tblExperienciaLaboral.getSelectedRow();
        int idexperiencia_laboral = Integer.parseInt(String.valueOf(vistaExperienciaLaboral.tblExperienciaLaboral.getValueAt(filaSeleccionadaHorario, 0)));
        
        ExperienciaLaboral experienciaLaboral = sqlExperienciaLaboral.datosExperienciaLaboral(idexperiencia_laboral);
        vistaExperienciaLaboral.textActividades.setText(experienciaLaboral.getActividades());
        vistaExperienciaLaboral.textEmpresa.setText(experienciaLaboral.getEmpresa());
        vistaExperienciaLaboral.textPermanencia.setText(""+experienciaLaboral.getPermanencia());
        vistaExperienciaLaboral.textPuesto.setText(experienciaLaboral.getPuesto());
    }
    
    private void vaciarCampos(){
        vistaExperienciaLaboral.textActividades.setText("");
        vistaExperienciaLaboral.textEmpresa.setText("");
        vistaExperienciaLaboral.textPermanencia.setText("");
        vistaExperienciaLaboral.textPuesto.setText("");
    }*/
}
