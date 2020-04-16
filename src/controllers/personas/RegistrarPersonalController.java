package controllers.personas;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import models.dao.PersonasDAO;
import models.implementation.PersonasDaoImpl;

import views.personas.JDialog_GestionarPersonal;
import models.pojo.Personas;

import util.Bloq_Mayus;
import util.Conexion;

public class RegistrarPersonalController {
    
    JDialog_GestionarPersonal vistaGestionarPersonal;
    
    PersonasDAO personaDao;
    
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
        
        vistaGestionarPersonal.setVisible(true);
    }
    
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
            JOptionPane.showMessageDialog(vistaGestionarPersonal, "Persona registrada correctamente",
                    "Registro guardado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void cleanFields()
    {
    }
}