package controllers.catalogos;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.dao.PlantelDAO;
import models.implementation.PlantelDaoImpl;
import models.pojo.Plantel;
import util.AlertMarket;
import util.Bloq_Mayus;
import util.Conexion;
import views.catalogos.JDialog_Planteles;

public class PlantelController {
    
    JDialog_Planteles vistaPlantel;
    PlantelDAO plantelDao;
    DefaultTableModel modTblPlantel;
    
    public PlantelController(JDialog_Planteles vista)
    {
        vistaPlantel = vista;
        plantelDao = new PlantelDaoImpl(Conexion.getConnection());
        init();
    }
    
    private void init()
    {
        modTblPlantel = (DefaultTableModel)vistaPlantel.tblPlanteles.getModel();
        vistaPlantel.setTitle("Planteles");
        vistaPlantel.btnRegistrar.addActionListener(this::btnRegistrar);
        vistaPlantel.btnEditar.addActionListener(this::btnEditar);
        llenarTabla();
        vistaPlantel.txtPlanteles.setDocument(new Bloq_Mayus());
        vistaPlantel.btnEditar.setEnabled(false);
        vistaPlantel.btnRegistrar.setEnabled(true);
        vistaPlantel.tblPlanteles.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                filaSeleccionada(evt);
            }
        });
        vistaPlantel.txtPlanteles.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt)
            {
                if(evt.getClickCount() == 2)
                {
                    cleanFields();
                    vistaPlantel.btnRegistrar.setEnabled(true);
                    vistaPlantel.btnEditar.setEnabled(false);
                }
                
            }
        });
        vistaPlantel.setVisible(true);
    }
    
    private void llenarTabla()
    {
        modTblPlantel.setNumRows(0);
        List<Plantel>lista = plantelDao.GetAll();
        for (int i = 0; i < lista.size(); i++) {
            modTblPlantel.addRow(new Object[]{
                lista.get(i).getClave_plantel(),
                lista.get(i).getPlantel(),
                lista.get(i).getTelefono()
            });
        }
    }
    
    private void cleanFields()
    {
        vistaPlantel.txtId.setText("");
        vistaPlantel.txtPlanteles.setText("");
        vistaPlantel.txtTelefono.setText("");
        vistaPlantel.txtPlanteles.requestFocus();
    }
    
    public void btnRegistrar(ActionEvent evt)
    {
        if(vistaPlantel.txtId.getText().isEmpty() && vistaPlantel.txtPlanteles.getText().isEmpty())
        {
            AlertMarket.GetErrorAlert(vistaPlantel, "No puede haber campos vacios", "Error");
        }
        else
        {
            agregarPlantel(vistaPlantel.txtId.getText(), vistaPlantel.txtPlanteles.getText(),
                    vistaPlantel.txtTelefono.getText());
        }
    }
    
    public void btnEditar(ActionEvent evt)
    {
        if(vistaPlantel.txtPlanteles.getText().isEmpty())
        {
            AlertMarket.GetErrorAlert(vistaPlantel, "No puede haber campos vacios", "Error");
        }
        else
        {
            modificarPlantel(vistaPlantel.txtId.getText(), vistaPlantel.txtPlanteles.getText(),
                    vistaPlantel.txtTelefono.getText());
        }
    }
    
    public void filaSeleccionada(MouseEvent evt) {
        if(evt.getClickCount() == 2)
        {
            int filaSeleccionada = vistaPlantel.tblPlanteles.getSelectedRow();
            String id = String.valueOf(vistaPlantel.tblPlanteles.getValueAt(filaSeleccionada, 0));
            String nombreCargo = String.valueOf(vistaPlantel.tblPlanteles.getValueAt(filaSeleccionada, 1));
            String telefono = String.valueOf(vistaPlantel.tblPlanteles.getValueAt(filaSeleccionada, 2));
            vistaPlantel.txtTelefono.setText(telefono);
            vistaPlantel.txtPlanteles.setText(nombreCargo);
            vistaPlantel.txtId.setText(id);
            vistaPlantel.txtId.setEditable(false);
            vistaPlantel.btnEditar.setEnabled(true);
            vistaPlantel.btnRegistrar.setEnabled(false);
        }
    }
    
    private void agregarPlantel(String clave, String nombre, String telefono)
    {
        Plantel plantel = new Plantel();
        plantel.setClave_plantel(clave);
        plantel.setPlantel(nombre);
        plantel.setTelefono(telefono);
        try {
            if(plantelDao.Insert(plantel))
            {
                AlertMarket.GetInfoAlert(vistaPlantel,"Registro guardado correctamente", "Registro guardado");
                cleanFields();
                llenarTabla();
            }
            else
            {
                AlertMarket.GetErrorAlert(vistaPlantel, "El registro no se pudo guardar", "Registro no guardado");
            }
        } 
        catch (SQLException e) 
        {}
    }
    
    private void modificarPlantel(String clave, String nombre, String telefono)
    {
        Plantel plantel = new Plantel();
        plantel.setClave_plantel(clave);
        plantel.setPlantel(nombre);
        plantel.setTelefono(telefono);
        try {
            if(plantelDao.Update(plantel))
            {
                AlertMarket.GetInfoAlert(vistaPlantel,"Registro modificado correctamente", "Registro modificado");
                cleanFields();
                vistaPlantel.btnRegistrar.setEnabled(true);
                vistaPlantel.txtId.setEditable(true);
                vistaPlantel.btnEditar.setEnabled(false);
                llenarTabla();
            }
            else
            {
                AlertMarket.GetErrorAlert(vistaPlantel, "El registro no se pudo modificar", "Registro no modificado");
            }
        } 
        catch (SQLException e) 
        {}
    }
}