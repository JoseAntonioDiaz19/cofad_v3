package controllers.catalogos;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.dao.SubdireccionesDAO;
import models.implementation.SubdireccionDaoImpl;
import models.pojo.Subdireccion;
import util.AlertMarket;
import util.Bloq_Mayus;
import util.Conexion;
import views.catalogos.JDialog_Subdirecciones;

public class SubdireccionesController {

    SubdireccionesDAO subdireccionDao;
    JDialog_Subdirecciones vistaSubdirecciones;

    private DefaultTableModel modTblSubdireccion;

    public SubdireccionesController(JDialog_Subdirecciones vista) {
        vistaSubdirecciones = vista;
        subdireccionDao = new SubdireccionDaoImpl(Conexion.getConnection());
        init();
    }

    private void init() {
        modTblSubdireccion = (DefaultTableModel) vistaSubdirecciones.tblSubdirecciones.getModel();
        llenarTabla();
        vistaSubdirecciones.btnEditar.setEnabled(false);
        vistaSubdirecciones.btnRegistrar.setEnabled(true);

        vistaSubdirecciones.btnEditar.addActionListener(this::btnEditar);
        vistaSubdirecciones.btnRegistrar.addActionListener(this::btnRegistrar);
        vistaSubdirecciones.txtSubdireccion.setDocument(new Bloq_Mayus());

        vistaSubdirecciones.tblSubdirecciones.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                filaSeleccionada(evt);
            }
        });
        vistaSubdirecciones.txtSubdireccion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                if(evt.getClickCount() == 2)
                    cleanFields();
            }
        });
        vistaSubdirecciones.setVisible(true);
    }

    public void btnRegistrar(ActionEvent evt) {
        if (vistaSubdirecciones.txtId.getText().isEmpty()) {
            if (vistaSubdirecciones.txtSubdireccion.getText().isEmpty()) {
                AlertMarket.GetErrorAlert(vistaSubdirecciones, "No se puede insertar registros vacios", "Campos vacios");
                vistaSubdirecciones.txtSubdireccion.requestFocus();
            } else {
                agregarSubdireccion(vistaSubdirecciones.txtSubdireccion.getText());
            }
        }
    }

    public void btnEditar(ActionEvent evt) {
        if (vistaSubdirecciones.txtSubdireccion.getText().isEmpty()) {
            AlertMarket.GetErrorAlert(vistaSubdirecciones, "No se puede insertar registros vacios", "Campos vacios");
            vistaSubdirecciones.txtSubdireccion.requestFocus();
        } else {
            modificarSubdireccion(vistaSubdirecciones.txtId.getText(), vistaSubdirecciones.txtSubdireccion.getText());
        }
    }

    private void llenarTabla() {
        modTblSubdireccion.setNumRows(0);
        List<Subdireccion> lista = subdireccionDao.GetAll();
        for (int i = 0; i < lista.size(); i++) {
            modTblSubdireccion.addRow(new Object[]{
                lista.get(i).getIdsubdireccion(),
                lista.get(i).getSubdireccion()
            });
        }
    }

    private void cleanFields() {
        vistaSubdirecciones.txtId.setText("");
        vistaSubdirecciones.txtSubdireccion.setText("");
        vistaSubdirecciones.txtSubdireccion.requestFocus();
    }

    public void filaSeleccionada(MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = vistaSubdirecciones.tblSubdirecciones.getSelectedRow();
            String id = String.valueOf(vistaSubdirecciones.tblSubdirecciones.getValueAt(filaSeleccionada, 0));
            String nombreCargo = String.valueOf(vistaSubdirecciones.tblSubdirecciones.getValueAt(filaSeleccionada, 1));
            vistaSubdirecciones.txtSubdireccion.setText(nombreCargo);
            vistaSubdirecciones.txtId.setText(id);
            vistaSubdirecciones.btnEditar.setEnabled(true);
            vistaSubdirecciones.btnRegistrar.setEnabled(false);
        }
    }

    private void agregarSubdireccion(String subdireccion) {
        Subdireccion newSubdireccion = new Subdireccion();
        newSubdireccion.setSubdireccion(subdireccion);
        try {
            if (subdireccionDao.Insert(newSubdireccion)) {
                AlertMarket.GetErrorAlert(vistaSubdirecciones, "Registro guardado correctamente", "Registro guardado");
                cleanFields();
                llenarTabla();
            } else {
                AlertMarket.GetErrorAlert(vistaSubdirecciones, "El registro no se pudo guardar", "Registro no guardado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubdireccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void modificarSubdireccion(String id, String Subdireccion) {
        Subdireccion subdireccion = new Subdireccion();
        subdireccion.setIdsubdireccion(Integer.parseInt(id));
        subdireccion.setSubdireccion(Subdireccion);
        try {
            if (subdireccionDao.Update(subdireccion)) {
                AlertMarket.GetInfoAlert(vistaSubdirecciones, "Registro modificado correctamente", "Registro modificado");
                cleanFields();
                llenarTabla();
                vistaSubdirecciones.btnEditar.setEnabled(false);
                vistaSubdirecciones.btnRegistrar.setEnabled(true);
            } else {
                AlertMarket.GetErrorAlert(vistaSubdirecciones, "El registro no se pudo modificar", "Registro no modificado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SubdireccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}