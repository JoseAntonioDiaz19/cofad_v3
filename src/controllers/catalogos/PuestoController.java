package controllers.catalogos;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.dao.PuestosDAO;
import models.dao.SubdireccionesDAO;
import models.dao.TipoPuestoDAO;
import models.implementation.PuestosDaoImpl;
import models.implementation.SubdireccionDaoImpl;
import models.implementation.TipoPuestoDaoImpl;
import models.pojo.Puestos;
import models.pojo.Subdireccion;
import util.AlertMarket;
import util.Bloq_Mayus;
import util.Conexion;
import views.catalogos.JDialog_Puestos;

public class PuestoController{
    
    JDialog_Puestos vistaPuestos;
    DefaultTableModel modTblPuestos;
    PuestosDAO puestosDao;
    
    ArrayList<Subdireccion>listaSubdirecciones;
    
    public PuestoController(JDialog_Puestos vista)
    {
        vistaPuestos = vista;
        puestosDao = new PuestosDaoImpl(Conexion.getConnection());
        init();
    }
    
    private void init()
    {
        modTblPuestos = (DefaultTableModel)vistaPuestos.tblPuestos.getModel();
        vistaPuestos.txtPuesto.setDocument(new Bloq_Mayus());
        vistaPuestos.txtExtension.setDocument(new Bloq_Mayus());
        vistaPuestos.txtExtension.setDocument(new Bloq_Mayus());
        vistaPuestos.setTitle("Puestos");
        cargar_comboSubdirecciones();
        llenarTabla();
        vistaPuestos.btnRegistrar.addActionListener(this::btnRegistrar);
        vistaPuestos.btnEditar.addActionListener(this::btnEditar);
        vistaPuestos.tblPuestos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                filaSeleccionada(evt);
            }
        });
        vistaPuestos.setVisible(true);
    }
    
    private void llenarTabla()
    {
        modTblPuestos.setNumRows(0);
        List<Puestos> lista = puestosDao.GetAll();
        TipoPuestoDAO tipoPuesto = new TipoPuestoDaoImpl(Conexion.getConnection());
        SubdireccionesDAO subdireccionDao = new SubdireccionDaoImpl(Conexion.getConnection());
        for (int i = 0; i < lista.size(); i++) {
            modTblPuestos.addRow(new Object[]{
                lista.get(i).getIdpuesto(),
                tipoPuesto.nombrePuesto(lista.get(i).getIdtipo_puesto()),
                subdireccionDao.nombreSubdireccion(lista.get(i).getIdsubdireccion()),
                lista.get(i).getPuesto(),
                lista.get(i).getCorreo(),
                lista.get(i).getExtension()
            });
        }
    }
    
    private void cargar_comboSubdirecciones()
    {
        SubdireccionesDAO subdireccionDao = new SubdireccionDaoImpl(Conexion.getConnection());
        listaSubdirecciones = (ArrayList<Subdireccion>)subdireccionDao.GetAll();
        for (int i = 0; i < listaSubdirecciones.size(); i++) {
            vistaPuestos.cmbSubdireccion.addItem(listaSubdirecciones.get(i).getSubdireccion());
        }
    }
    
    public void btnRegistrar(ActionEvent evt)        
    {
        if(!vistaPuestos.txtPuesto.getText().isEmpty() &&
           vistaPuestos.cmbSubdireccion.getSelectedIndex() != 0 &&
           vistaPuestos.cmbTipoPuesto.getSelectedIndex() != 0)
        {
            agregarPuesto();
        }
        else
        {
            AlertMarket.GetErrorAlert(vistaPuestos, "No se puede dejar campos vacíos", "Campos vacios");
        }
    }
    
    public void btnEditar(ActionEvent evt)
    {
        if(!vistaPuestos.txtPuesto.getText().isEmpty() &&
           vistaPuestos.cmbSubdireccion.getSelectedIndex() != 0 &&
           vistaPuestos.cmbTipoPuesto.getSelectedIndex() != 0)
        {
            modificarPuesto();
        }
        else
        {
            AlertMarket.GetErrorAlert(vistaPuestos, "No se puede dejar campos vacíos", "Campos vacios");
        }
    }
    
    public void filaSeleccionada(MouseEvent evt) {
        if(evt.getClickCount() == 2)
        {
            int filaSeleccionada = vistaPuestos.tblPuestos.getSelectedRow();
            
            String id = String.valueOf(vistaPuestos.tblPuestos.getValueAt(filaSeleccionada, 0));
            String tipoPuesto = String.valueOf(vistaPuestos.tblPuestos.getValueAt(filaSeleccionada, 1));
            String subdireccion = String.valueOf(vistaPuestos.tblPuestos.getValueAt(filaSeleccionada, 2));
            String nombrePuesto = String.valueOf(vistaPuestos.tblPuestos.getValueAt(filaSeleccionada, 3));
            String correo = String.valueOf(vistaPuestos.tblPuestos.getValueAt(filaSeleccionada, 4));
            String extension = String.valueOf(vistaPuestos.tblPuestos.getValueAt(filaSeleccionada, 5));
            
            vistaPuestos.txtId.setText(id);
            vistaPuestos.txtPuesto.setText(nombrePuesto);
            vistaPuestos.txtCorreo.setText(correo);
            vistaPuestos.txtExtension.setText(extension);
            TipoPuestoDAO tipoPuestodao = new TipoPuestoDaoImpl(Conexion.getConnection());
            vistaPuestos.cmbTipoPuesto.setSelectedIndex(tipoPuestodao.idTipoPuesto(tipoPuesto));
            vistaPuestos.cmbSubdireccion.setSelectedItem(subdireccion);
            vistaPuestos.btnEditar.setEnabled(true);
            vistaPuestos.btnRegistrar.setEnabled(false);
        }
    }
    
    private void agregarPuesto()
    {
        Puestos nuevoPuesto = new Puestos();
        nuevoPuesto.setIdtipo_puesto(vistaPuestos.cmbTipoPuesto.getSelectedIndex());
        int index = vistaPuestos.cmbSubdireccion.getSelectedIndex();
        nuevoPuesto.setIdsubdireccion(listaSubdirecciones.get(index - 1).getIdsubdireccion());
        nuevoPuesto.setPuesto(vistaPuestos.txtPuesto.getText());
        nuevoPuesto.setCorreo(vistaPuestos.txtCorreo.getText());
        nuevoPuesto.setExtension(vistaPuestos.txtExtension.getText());
        try {
            if(puestosDao.Insert(nuevoPuesto))
            {
                AlertMarket.GetDoneAlert(vistaPuestos, "Registro guardado correctamente", "Registro guardado");
                cleanFields();
                llenarTabla();
            }
            else
            {
                AlertMarket.GetErrorAlert(vistaPuestos, "No se pudo guardar el registro", "Error al guardar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PuestoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void modificarPuesto()
    {
        Puestos modificarPuesto = new Puestos();
        modificarPuesto.setIdpuesto(Integer.parseInt(vistaPuestos.txtId.getText()));
        modificarPuesto.setIdtipo_puesto(vistaPuestos.cmbTipoPuesto.getSelectedIndex());
        int index = vistaPuestos.cmbSubdireccion.getSelectedIndex();
        modificarPuesto.setIdsubdireccion(listaSubdirecciones.get(index - 1).getIdsubdireccion());
        modificarPuesto.setPuesto(vistaPuestos.txtPuesto.getText());
        modificarPuesto.setCorreo(vistaPuestos.txtCorreo.getText());
        modificarPuesto.setExtension(vistaPuestos.txtExtension.getText());
        try {
            if(puestosDao.Update(modificarPuesto))
            {
                AlertMarket.GetDoneAlert(vistaPuestos, "Registro modificado correctamente", "Registro modificar");
                cleanFields();
                llenarTabla();
                vistaPuestos.btnRegistrar.setEnabled(true);
                vistaPuestos.btnEditar.setEnabled(false);
            }
            else
            {
                AlertMarket.GetErrorAlert(vistaPuestos, "No se pudo modificar el registro", "Error al modificar");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PuestoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cleanFields()
    {
        vistaPuestos.cmbSubdireccion.setSelectedIndex(0);
        vistaPuestos.cmbTipoPuesto.setSelectedIndex(0);
        vistaPuestos.txtCorreo.setText("");
        vistaPuestos.txtExtension.setText("");
        vistaPuestos.txtId.setText("");
        vistaPuestos.txtPuesto.setText("");
    }
    
}