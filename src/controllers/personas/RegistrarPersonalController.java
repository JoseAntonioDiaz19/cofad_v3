package controllers.personas;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import models.dao.PersonasDAO;
import models.dao.PlantelDAO;
import models.dao.PuestosDAO;
import models.implementation.PersonasDaoImpl;
import models.implementation.PlantelDaoImpl;
import models.implementation.PuestosDaoImpl;

import views.personas.JDialog_GestionarPersonal;
import models.pojo.Personas;
import models.pojo.Plantel;
import util.AlertMarket;

import util.Bloq_Mayus;
import util.Conexion;

public class RegistrarPersonalController {
    
    JDialog_GestionarPersonal vistaGestionarPersonal;
    PersonasDAO personaDao;
    
    DefaultComboBoxModel modelCombo;
    
    public RegistrarPersonalController(JDialog_GestionarPersonal vista)
    {
        vistaGestionarPersonal = vista;
        personaDao = new PersonasDaoImpl(Conexion.getConnection());
        init();
    }
    
    private void init()
    {
        vistaGestionarPersonal.setTitle("Registrar nuevo personal");
        vistaGestionarPersonal.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        vistaGestionarPersonal.btnRegistrar.addActionListener(this::btnRegistrar);
        vistaGestionarPersonal.btnEditar.setVisible(false);
        
        vistaGestionarPersonal.txtApellidoMat.setDocument(new Bloq_Mayus());
        vistaGestionarPersonal.txtApellidoPat.setDocument(new Bloq_Mayus());
        vistaGestionarPersonal.txtClavePresupuestal.setDocument(new Bloq_Mayus());
        vistaGestionarPersonal.txtCURP.setDocument(new Bloq_Mayus());
        vistaGestionarPersonal.txtNombre.setDocument(new Bloq_Mayus());
        vistaGestionarPersonal.txtRFC.setDocument(new Bloq_Mayus());
        
        vistaGestionarPersonal.txtRFC.requestFocus();
        
        cargar_comboPlanteles();
        cargar_comboPuestos();
        
        vistaGestionarPersonal.setVisible(true);
    }
    
    private void cargar_comboPlanteles()
    {
        PlantelDAO planteldao = new PlantelDaoImpl(Conexion.getConnection());
        ArrayList<Plantel> listaPlanteles = (ArrayList<Plantel>)planteldao.GetAll();
        for (int i = 0; i < listaPlanteles.size(); i++) {
            vistaGestionarPersonal.cmbClavePlantel.addItem(listaPlanteles.get(i).getPlantel());
        }
    }
    
    private void cargar_comboPuestos()
    {
        PuestosDAO puestosdao = new PuestosDaoImpl(Conexion.getConnection());
        modelCombo = new DefaultComboBoxModel(puestosdao.todosLosPuestos());
        vistaGestionarPersonal.cmbPuesto.setModel(modelCombo);
        vistaGestionarPersonal.cmbPuesto.setSelectedIndex(0);
    }
    
    private void cargar_comboCargos(){}
    
    public void btnRegistrar(ActionEvent evt)
    {
        if(!vistaGestionarPersonal.txtRFC.getText().isEmpty() &&
           !vistaGestionarPersonal.txtNombre.getText().isEmpty() && 
           !vistaGestionarPersonal.txtApellidoPat.getText().isEmpty() &&
           !vistaGestionarPersonal.txtApellidoMat.getText().isEmpty() &&
           !vistaGestionarPersonal.txtCURP.getText().isEmpty() &&
           !vistaGestionarPersonal.txtCorreoElectronico.getText().isEmpty() &&
           !vistaGestionarPersonal.txtNumTelefono.getText().isEmpty())
        {
        }
    }
    
    private void agregarPersona(Personas nuevaPersona) throws Exception
    {
        if(personaDao.Insert(nuevaPersona))
        {
            cleanFields();
            AlertMarket.GetInfoAlert(vistaGestionarPersonal, "Persona registrada correctamente", "Registro guardado");
        }
    }
    
    private void cleanFields()
    {
    }
}