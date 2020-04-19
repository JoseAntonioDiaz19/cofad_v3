package controllers.personas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import util.Bloq_Mayus;
import util.FrameHijo;
import views.personas.Personal;
import models.implementation.PersonasTblVistaDaoImpl;
import models.pojo.PersonasTblVista;
import util.Conexion;
import views.personas.JDialog_GestionarPersonal;
import models.dao.PersonasTblVistaDAO;

public class PersonasController {
    
    Personal vistaPersonas;
    PersonasTblVistaDAO personasTblVistaDao;
    
    DefaultTableModel modeloTablaPersona;

    int cantidadPlanteles = 0;
    int cantidadDepartamentos = 0;
    int seleccion = 0;

    public PersonasController(Personal vistaPersonas) {
        this.vistaPersonas = vistaPersonas;
        personasTblVistaDao = new PersonasTblVistaDaoImpl(Conexion.getConnection());
        crear();
    }
    
    private void crear()
    {
        vistaPersonas.txtFiltrado.setDocument(new Bloq_Mayus());
        vistaPersonas.jScrollTablaPersonal.getViewport().setBackground(Color.WHITE);
        modeloTablaPersona = (DefaultTableModel) vistaPersonas.tblPersonal.getModel();

        llenarTablaPersonas();

        vistaPersonas.btnRegistrarPersonal.addActionListener(this::nuevo);

        vistaPersonas.menuItemEditar.addActionListener(this::itemEditarPersonal);
        vistaPersonas.menuItemEstatusDesactivar.addActionListener(this::itemDesactivarPersonal);
        vistaPersonas.menuItemEstatusActivar.addActionListener(this::itemActivarPersonal);
        vistaPersonas.txtFiltrado.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                txtBusqueda(evt);
            }
        });
    }
    
    public void nuevo(ActionEvent evt) {
        JDialog_GestionarPersonal vistaPersona = new JDialog_GestionarPersonal(FrameHijo.obtenerPadre(vistaPersonas), true);
        RegistrarPersonalController ctrl = new RegistrarPersonalController(vistaPersona);
    }

    public void txtBusqueda(KeyEvent evt) {
        String patron = vistaPersonas.txtFiltrado.getText();
        List<PersonasTblVista>lista = personasTblVistaDao.GetAllBy(patron);
        llenarTablaPersonas(lista);
    }

    private void llenarTablaPersonas() {
        List<PersonasTblVista>lista = personasTblVistaDao.GetAll();
        for (int i = 0; i < lista.size(); i++) {
            modeloTablaPersona.addRow(new Object[]{
                lista.get(i).getRfc(),
                lista.get(i).getCurp(),
                lista.get(i).getApe_paterno(),
                lista.get(i).getApe_materno(),
                lista.get(i).getNombre(),
                lista.get(i).getPuesto(),
                lista.get(i).getCargo(),
                lista.get(i).getStatus()
            });
        }
    }
    
    private void llenarTablaPersonas(List<PersonasTblVista> lista) {
        modeloTablaPersona.setNumRows(0);

        for (int i = 0; i < lista.size(); i++) {
            modeloTablaPersona.addRow(new Object[]{
                lista.get(i).getRfc(),
                lista.get(i).getCurp(),
                lista.get(i).getApe_paterno(),
                lista.get(i).getApe_materno(),
                lista.get(i).getNombre(),
                lista.get(i).getPuesto(),
                lista.get(i).getCargo(),
                lista.get(i).getStatus()
            });
        }
    }

    private void itemEditarPersonal(ActionEvent evt) {
        /*int filaSeleccionada = vistaPersonas.tblPersonal.getSelectedRow();
        String rfcPersonal = String.valueOf(vistaPersonas.tblPersonal.
                getValueAt(filaSeleccionada, 0));
        
        Personas modeloEditarPersona = new Personas();
        modeloEditarPersona.setRfC(rfcPersonal);
        modeloEditarPersona = sqlPersona.obtenerPersona(rfcPersonal);
        
        System.out.println(""+modeloEditarPersona.getRFC()); 
        
        JDialog_GestionarPersonal vistaEditarPersona = new JDialog_GestionarPersonal(obtenerPadre(vistaPersonas), true);

        ModificarPersonalController ctrModificarPersonal = new 
                    ModificarPersonalController(vistaEditarPersona, modeloEditarPersona, sqlPersona, vistaPersonas);*/
    }

    private void itemDesactivarPersonal(ActionEvent evt) {
        /*int filaSeleccionada = vistaPersonas.tblPersonal.getSelectedRow();
        String rfc = String.valueOf(vistaPersonas.tblPersonal.getValueAt(filaSeleccionada, 0));
        String estatus = String.valueOf(vistaPersonas.tblPersonal.getValueAt(filaSeleccionada, 7));
        if(estatus.equals("ACTIVO"))
        {
            modeloPersona.setEstatus_Laboral(2);
            modeloPersona.setRFC(rfc);
        
            if(sqlPersona.desactivarPersona(modeloPersona))
            {
                JOptionPane.showMessageDialog(null, "Persona dado de baja correctamente", "Estatus laboral", JOptionPane.INFORMATION_MESSAGE);
                llenarTablaPersonas();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion solicitada", "Estatus laboral", JOptionPane.INFORMATION_MESSAGE);
            }
        }
*/
    }
    
    private void itemActivarPersonal(ActionEvent evt)
    {/*
        int filaSeleccionada = vistaPersonas.tblPersonal.getSelectedRow();
        String rfc = String.valueOf(vistaPersonas.tblPersonal.getValueAt(filaSeleccionada, 0));
        String estatus = String.valueOf(vistaPersonas.tblPersonal.getValueAt(filaSeleccionada, 7));
        if(estatus.equals("INACTIVO"))
        {    
            modeloPersona.setEstatus_Laboral(1);
            modeloPersona.setRFC(rfc);
            if(sqlPersona.activarPersona(modeloPersona))
            {
                JOptionPane.showMessageDialog(null, "Persona activada correctamente", "Estatus laboral", JOptionPane.INFORMATION_MESSAGE);
                llenarTablaPersonas();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion solicitada", "Estatus laboral", JOptionPane.INFORMATION_MESSAGE);
            }
        }*/
    }   
}