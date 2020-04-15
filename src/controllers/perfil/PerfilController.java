package controllers.perfil;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import models.pojo.Personas;
import models.pojo.Usuarios;
import views.perfil.DatosLaborales;
import views.perfil.DatosPersonales;
import views.perfil.Experiencia_Laboral;
import views.perfil.FormacionAcademica;
import views.perfil.Perfil;
//import views.usuarios.CambiarContraseña;
import views.dashboard.DashboardAdmin;

import util.FrameHijo;

public class PerfilController {
    
    Personas personaLogueada;
    Perfil vistaPerfil;
    Usuarios modeloUsuario;
    DashboardAdmin mainView;
    
    public PerfilController(Personas personaLogueada, Perfil vistaPerfil,
            DashboardAdmin mainView) {
        this.personaLogueada = personaLogueada;
        this.vistaPerfil = vistaPerfil;
        this.mainView = mainView;
        vistaPerfil.botonDatosPersonales.addActionListener(this::botonDatosPersonales);
        vistaPerfil.botonExperienciaLaboral.addActionListener(this::botonExperienciaLaboral);
        vistaPerfil.botonFormacionAcademica.addActionListener(this::FormacionAcademica);
        vistaPerfil.botonProductos.addActionListener(this::botonProductos);
        vistaPerfil.botonHistorialMaterias.addActionListener(this::botonHistorialMaterias);
        vistaPerfil.botonDatosLaborales.addActionListener(this::botonDatosLaborales);
        vistaPerfil.botonCambiarContraseña.addActionListener(this::botonCambiarContraseña);
        vistaPerfil.botonResumenCursos.addActionListener(this::botonResumenCursos);
        initialize();
        vistaPerfil.setVisible(true);
    }
    
    private void initialize(){
        vistaPerfil.labelNombre.setText("NOMBRE: " + personaLogueada.nombreCompleto());
        vistaPerfil.labelRFC.setText("RFC: " + personaLogueada.getRfc());
        //vistaPerfil.labelPlantel.setText("PLATEL: " + sqlPersona.obtenerNombrePlantel(personaLogueada.getClave_plantel()));
        //vistaPerfil.labelCarrera.setText("CARRERA: " + sqlPersona.obtenerNombreCarrera(personaLogueada.getClave_carrera()));
        //vistaPerfil.labelCargo.setText("CARGO: " + sqlPersona.obtenerNombreCargo(personaLogueada.getId_cargo()));
        //vistaPerfil.labelPuesto.setText("PUESTO: " + sqlPersona.obtenerNombreDepartamento(personaLogueada.getId_departamento()));
        //System.out.println("Iddepartamento"+personaLogueada.getId_departamento());
        //System.out.println("Cargo "+personaLogueada.getId_cargo());
    }
    
    private void botonDatosPersonales(ActionEvent e) {
        DatosPersonales vistaDatosPersonales = new DatosPersonales(FrameHijo.obtenerPadre(vistaPerfil),true);
        //DatosPersonalesController controlDatosPersonales = new DatosPersonalesController(vistaDatosPersonales, personaLogueada, mainView, dataSource);
    }

    private void botonExperienciaLaboral(ActionEvent e) {
        Experiencia_Laboral vistaExperienciaLaboral = new Experiencia_Laboral(FrameHijo.obtenerPadre(vistaPerfil),true);
        //ExperienciaLaboralController controlExperienciaLaboral = new ExperienciaLaboralController(vistaExperienciaLaboral,personaLogueada);
    }

    private void FormacionAcademica(ActionEvent e) {
       FormacionAcademica vistaFormacion_academica = new FormacionAcademica(FrameHijo.obtenerPadre(vistaPerfil),true);
       //FormacionAcademicaController controlFormacionAcademica = new FormacionAcademicaController(vistaFormacion_academica, personaLogueada);
    }

    private void botonDatosLaborales(ActionEvent e) {
       DatosLaborales vistaDatosLaborales = new DatosLaborales(FrameHijo.obtenerPadre(vistaPerfil),true);
       //DatosLaboralesController controlDatosLaborales = new DatosLaboralesController(vistaDatosLaborales, personaLogueada);
    }

    private void botonCambiarContraseña(ActionEvent e) {
        //CambiarContraseña vistaCambiarContraseña = new CambiarContraseña(obtenerPadre(vistaPerfil),true);
//        CambiarMiContraseñaController controlCambiarContraseña = new CambiarMiContraseñaController(vistaCambiarContraseña, personaLogueada, modeloUsuario, mainView, dataSource);
    }

    private void botonResumenCursos(ActionEvent e) {
        
    }
   
    private void botonProductos(ActionEvent e) {
       
    }

    private void botonHistorialMaterias(ActionEvent e) {
       
    }
}