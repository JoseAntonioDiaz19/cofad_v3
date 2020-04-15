package controllers.catalogos;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.dao.PuestosDAO;
import models.dao.SubdireccionesDAO;
import models.dao.TipoPuestoDAO;
import models.implementation.PuestosDaoImpl;
import models.implementation.SubdireccionDaoImpl;
import models.implementation.TipoPuestoDaoImpl;
import models.pojo.Puestos;
import models.pojo.Subdireccion;
import util.Bloq_Mayus;
import util.Conexion;
import views.catalogos.JDialog_Puestos;

public class PuestoController {
    
    JDialog_Puestos vistaPuestos;
    DefaultTableModel modTblPuestos;
    PuestosDAO puestosDao;
    DefaultComboBoxModel modelcombo;
    
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
        vistaPuestos.cmbSubdireccion.addActionListener(this::cmbSubdirecciones);
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
        modelcombo = new DefaultComboBoxModel(subdireccionDao.todasSubdirecciones());
        vistaPuestos.cmbSubdireccion.setModel(modelcombo);
        vistaPuestos.cmbSubdireccion.setSelectedIndex(0);
    }
    
    public void cmbSubdirecciones(ActionEvent evt){
        if(vistaPuestos.cmbSubdireccion.getSelectedIndex() != 0)
        {
            Subdireccion id = (Subdireccion)vistaPuestos.cmbSubdireccion.getSelectedItem();
            System.out.println("id: " + id.getIdsubdireccion());
        }
    }
}