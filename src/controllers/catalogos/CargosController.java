package controllers.catalogos;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.dao.CargosDAO;
import models.implementation.CargosDaoImpl;
import models.pojo.Cargos;
import util.AlertMarket;
import util.Conexion;
import views.catalogos.JDialog_Cargos;

import util.Bloq_Mayus;

public class CargosController {

    DefaultTableModel modTablaCargos;
    JDialog_Cargos vistaCargos;

    CargosDAO cargoDao;
    JOptionPane alert;

    public CargosController(JDialog_Cargos vista)
    {
        vistaCargos = vista;
        cargoDao = new CargosDaoImpl(Conexion.getConnection());
        init();
    }
    
    private void init() {
        modTablaCargos = (DefaultTableModel) vistaCargos.tblCargos.getModel();
        llenarTabla();
        vistaCargos.setTitle("Cargos");
        vistaCargos.txtCargos.setDocument(new Bloq_Mayus());
        vistaCargos.txtCargos.requestFocus();
        vistaCargos.btnEditar.setEnabled(false);

        vistaCargos.btnRegistrar.addActionListener(this::btnRegistrar);
        vistaCargos.btnEditar.addActionListener(this::btnModificar);
        vistaCargos.tblCargos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                filaSeleccionada(evt);
            }
        });
        vistaCargos.txtCargos.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt)
            {
                if(evt.getClickCount() == 2)
                {
                    cleanFields();
                    vistaCargos.btnRegistrar.setEnabled(true);
                    vistaCargos.btnEditar.setEnabled(false);
                }
                
            }
        });

        vistaCargos.setVisible(true);
    }

    private void llenarTabla() {
        modTablaCargos.setNumRows(0);
        List<Cargos> lista = cargoDao.GetAll();
        for (int i = 0; i < lista.size(); i++) {
            modTablaCargos.addRow(new Object[]{
                lista.get(i).getIdCargo(),
                lista.get(i).getCargo()
            });
        }
    }

    public void btnRegistrar(ActionEvent evt) {
        if (vistaCargos.txtId.getText().isEmpty()) {
            if(vistaCargos.txtCargos.getText().isEmpty())
            {
                AlertMarket.GetErrorAlert(vistaCargos, "No se puede insertar registros vacios", "Campos vacios");
                vistaCargos.txtCargos.requestFocus();
            }
            else 
            {
                agregarCargo(vistaCargos.txtCargos.getText());
            }
        }
    }
    
    public void btnModificar(ActionEvent evt)
    {
        if(vistaCargos.txtCargos.getText().isEmpty())
        {
            AlertMarket.GetErrorAlert(vistaCargos, "No hay datos a modificar", "Error al modificar");
        }
        else
        {
            modificarCargo(vistaCargos.txtId.getText(), vistaCargos.txtCargos.getText());
        }
    }
    
    private void agregarCargo(String cargo){
        Cargos c = new Cargos();
        c.setCargo(cargo);
        try {
            if(cargoDao.Insert(c))
            {
                AlertMarket.GetInfoAlert(vistaCargos, "Registro guardado correctament", "Registro guardado");
                cleanFields();
                llenarTabla();
            }
            else
            {
                AlertMarket.GetErrorAlert(vistaCargos, "El registro no se pudo guardar", "Registro no guardado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CargosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void modificarCargo(String id, String cargo)
    {
        Cargos c = new Cargos();
        c.setIdCargo(Integer.parseInt(id));
        c.setCargo(cargo);
        try {
            if(cargoDao.Update(c))
            {
                AlertMarket.GetInfoAlert(vistaCargos, "Registro modificado correctamente", "Registro modificado");
                cleanFields();
                vistaCargos.btnEditar.setEnabled(false);
                vistaCargos.btnRegistrar.setEnabled(true);
                llenarTabla();
            }
            else
            {
                AlertMarket.GetErrorAlert(vistaCargos, "El registro no se pudo modificar", "Registro no modificado");
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CargosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cleanFields()
    {
        vistaCargos.txtId.setText("");
        vistaCargos.txtCargos.setText("");
        vistaCargos.txtCargos.requestFocus();
    }

    public void filaSeleccionada(MouseEvent evt) {
        if(evt.getClickCount() == 2)
        {
            int filaSeleccionada = vistaCargos.tblCargos.getSelectedRow();
            String id = String.valueOf(vistaCargos.tblCargos.getValueAt(filaSeleccionada, 0));
            String nombreCargo = String.valueOf(vistaCargos.tblCargos.getValueAt(filaSeleccionada, 1));
            vistaCargos.txtCargos.setText(nombreCargo);
            vistaCargos.txtId.setText(id);
            vistaCargos.btnEditar.setEnabled(true);
            vistaCargos.btnRegistrar.setEnabled(false);
        }
    }
}