package controllers.perfil;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import models.dao.ExperienciaDocenteDAO;
import models.implementation.ExperienciaDocenteDaoImpl;
import models.pojo.ExperienciaDocente;
import models.pojo.Personas;
import util.Conexion;
import views.perfil.ExperienciaDocenteVista;

/**
 * @author Jose Antonio Diaz
 */
public class ExperienciaDocenteController {

    ExperienciaDocenteVista vistaExperienciaDocente;
    Personas personaLogueada;
    DefaultTableModel modelTablaExperienciaDocente;
    ExperienciaDocenteDAO sqlExperienciaDocente = new ExperienciaDocenteDaoImpl(Conexion.getConnection());
    List<ExperienciaDocente> lista;

    ExperienciaDocenteController(ExperienciaDocenteVista vistaExperienciaDocente, Personas personaLogueada) {
        this.vistaExperienciaDocente = vistaExperienciaDocente;
        this.personaLogueada = personaLogueada;
        modelTablaExperienciaDocente = (DefaultTableModel) this.vistaExperienciaDocente.tblExperienciaDocente.getModel();
        vistaExperienciaDocente.btnRegistrar.addActionListener(this::botonRegistrar);
        vistaExperienciaDocente.btnGuardarCambios.addActionListener(this::botonGuardarCambios);
        vistaExperienciaDocente.btnEliminar.addActionListener(this::botonEliminar);
        vistaExperienciaDocente.tblExperienciaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
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
        vistaExperienciaDocente.setTitle("Experiencia docente");
        vistaExperienciaDocente.setAlwaysOnTop(true);
        vistaExperienciaDocente.setLocationRelativeTo(null);
        vistaExperienciaDocente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaExperienciaDocente.setSize(850, 463);
        llenarTablaExperienciaDocente(); 
        vistaExperienciaDocente.btnGuardarCambios.setEnabled(false);
        vistaExperienciaDocente.btnEliminar.setEnabled(false);
        vistaExperienciaDocente.setVisible(true);
    }

    private void llenarTablaExperienciaDocente() {
        modelTablaExperienciaDocente.setNumRows(0);
        lista = sqlExperienciaDocente.GetAllBy(personaLogueada.getRfc());
        int id = 1;
        for (int i = 0; i < lista.size(); i++) {
            modelTablaExperienciaDocente.addRow(new Object[]{
                id++,
                lista.get(i).getMateria(),
                lista.get(i).getMes_inicio() + "-" + lista.get(i).getMes_fin(),
                lista.get(i).getAño()
            });
        }
    }

    private void llenarCampos() {
        int filaSelecExperienciaDocente = vistaExperienciaDocente.tblExperienciaDocente.getSelectedRow();
        String materia = (String.valueOf(vistaExperienciaDocente.tblExperienciaDocente.getValueAt(filaSelecExperienciaDocente, 1)));
        String periodo = (String.valueOf(vistaExperienciaDocente.tblExperienciaDocente.getValueAt(filaSelecExperienciaDocente, 2)));
        int año = Integer.parseInt(String.valueOf(vistaExperienciaDocente.tblExperienciaDocente.getValueAt(filaSelecExperienciaDocente, 3)));

        int id = Integer.parseInt(String.valueOf(vistaExperienciaDocente.tblExperienciaDocente.getValueAt(filaSelecExperienciaDocente, 0)));
        int idproducto = lista.get(id - 1).getIdexperiencia_docente();

        String[] elementosFecha = periodo.split("-");
        String stringMesInicio = elementosFecha[0];
        String stringMesFin = elementosFecha[1];

        int mesInicio = obtenerNumeroMes(stringMesInicio);
        int mesFin = obtenerNumeroMes(stringMesFin);

        vistaExperienciaDocente.chooserMesInicio.setMonth(mesInicio);
        vistaExperienciaDocente.chooserMesFin.setMonth(mesFin);
        vistaExperienciaDocente.chooserAño.setYear(año);
        vistaExperienciaDocente.fieldMateria.setText(materia);
        
        vistaExperienciaDocente.btnGuardarCambios.setEnabled(true);
        vistaExperienciaDocente.btnEliminar.setEnabled(true);
        vistaExperienciaDocente.btnRegistrar.setEnabled(false);

    }
    
    private void botonRegistrar(ActionEvent e) {
        
        String rfc = personaLogueada.getRfc();
        String materia = vistaExperienciaDocente.fieldMateria.getText();
        String mes_inicio = obtenerNombreMes(vistaExperienciaDocente.chooserMesInicio.getMonth() + 1);
        String mes_fin = obtenerNombreMes(vistaExperienciaDocente.chooserMesFin.getMonth() + 1);
        int año = vistaExperienciaDocente.chooserAño.getYear();
        
        boolean datosLlenos = false;
        if (!materia.equals("")) {
            datosLlenos = true;
        }else{JOptionPane.showMessageDialog(vistaExperienciaDocente, "Debe de llenar el campo de materia");}
        
        if (datosLlenos) {
            ExperienciaDocente nuevaExperienciaDocente = new ExperienciaDocente();
            nuevaExperienciaDocente.setMateria(materia);
            nuevaExperienciaDocente.setMes_inicio(mes_inicio);
            nuevaExperienciaDocente.setMes_fin(mes_fin);
            nuevaExperienciaDocente.setAño(año);
            nuevaExperienciaDocente.setRfc(rfc);
            
            boolean registroCorrecto;
            try {
                registroCorrecto =sqlExperienciaDocente.Insert(nuevaExperienciaDocente);
                if (registroCorrecto) {
                    JOptionPane.showMessageDialog(vistaExperienciaDocente, "La experiencia docente fue guardada correctamente");
                    vistaExperienciaDocente.fieldMateria.setText("");
                    llenarTablaExperienciaDocente();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }


    private void botonGuardarCambios(ActionEvent e) {
        String rfc = personaLogueada.getRfc();
        String materia = vistaExperienciaDocente.fieldMateria.getText();
        String mes_inicio = obtenerNombreMes(vistaExperienciaDocente.chooserMesInicio.getMonth() + 1);
        String mes_fin = obtenerNombreMes(vistaExperienciaDocente.chooserMesFin.getMonth() + 1);
        int año = vistaExperienciaDocente.chooserAño.getYear();
        
        int filaSeleccionadaProducto = vistaExperienciaDocente.tblExperienciaDocente.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(vistaExperienciaDocente.tblExperienciaDocente.getValueAt(filaSeleccionadaProducto, 0)));
        
        int idexperiencia_docente = lista.get(id - 1).getIdexperiencia_docente();
        
        boolean datosLlenos = false;
        if (!materia.equals("")) {
            datosLlenos = true;
        }else{JOptionPane.showMessageDialog(vistaExperienciaDocente, "Debe de llenar el campo de materia");}
        
        if (datosLlenos) {
            ExperienciaDocente nuevaExperienciaDocente = new ExperienciaDocente();
            nuevaExperienciaDocente.setMateria(materia);
            nuevaExperienciaDocente.setMes_inicio(mes_inicio);
            nuevaExperienciaDocente.setMes_fin(mes_fin);
            nuevaExperienciaDocente.setAño(año);
            nuevaExperienciaDocente.setRfc(rfc);
            nuevaExperienciaDocente.setIdexperiencia_docente(idexperiencia_docente);
            
            boolean registroCorrecto;
            try {
                registroCorrecto =sqlExperienciaDocente.Update(nuevaExperienciaDocente);
                if (registroCorrecto) {
                    JOptionPane.showMessageDialog(vistaExperienciaDocente, "La experiencia docente fue guardada correctamente");
                    vistaExperienciaDocente.fieldMateria.setText("");
                    vistaExperienciaDocente.btnGuardarCambios.setEnabled(false);
                    vistaExperienciaDocente.btnEliminar.setEnabled(false);
                    vistaExperienciaDocente.btnRegistrar.setEnabled(true);
                    llenarTablaExperienciaDocente();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
      
    }

    private void botonEliminar(ActionEvent e) {
        ExperienciaDocente expDocenteEliminar = new ExperienciaDocente();
        
        int filaSeleccionadaProducto = vistaExperienciaDocente.tblExperienciaDocente.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(vistaExperienciaDocente.tblExperienciaDocente.getValueAt(filaSeleccionadaProducto, 0)));
        
        int idexperiencia_docente = lista.get(id - 1).getIdexperiencia_docente();
        expDocenteEliminar.setIdexperiencia_docente(idexperiencia_docente);
        
        int res = JOptionPane.showConfirmDialog(vistaExperienciaDocente, "Confirmar eliminación");
        if (res == JOptionPane.YES_OPTION) {
            sqlExperienciaDocente.Delete(expDocenteEliminar);
            JOptionPane.showMessageDialog(vistaExperienciaDocente, "Operacion completada correctamente");
            vistaExperienciaDocente.fieldMateria.setText("");
            vistaExperienciaDocente.btnGuardarCambios.setEnabled(false);
            vistaExperienciaDocente.btnEliminar.setEnabled(false);
            vistaExperienciaDocente.btnRegistrar.setEnabled(true);
            llenarTablaExperienciaDocente();
        }
    }


    private String obtenerNombreMes(int mes) {
        String nombreMes;
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Invalid month";
                break;
        }
        return nombreMes;
    }

    private int obtenerNumeroMes(String mes) {
        int numeroMes;
        switch (mes) {
            case "ENERO":
                numeroMes = 0;
                break;
            case "FEBRERO":
                numeroMes = 1;
                break;
            case "MARZO":
                numeroMes = 2;
                break;
            case "ABRIL":
                numeroMes = 3;
                break;
            case "MAYO":
                numeroMes = 4;
                break;
            case "JUNIO":
                numeroMes = 5;
                break;
            case "JULIO":
                numeroMes = 6;
                break;
            case "AGOSTO":
                numeroMes = 7;
                break;
            case "SEPTIEMBRE":
                numeroMes = 8;
                break;
            case "OCTUBRE":
                numeroMes = 9;
                break;
            case "NOVIEMBRE":
                numeroMes = 10;
                break;
            case "DICIEMBRE":
                numeroMes = 11;
                break;
            default:
                numeroMes = -1;
                break;
        }
        return numeroMes;
    }

}
