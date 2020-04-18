package controllers.perfil;
import java.awt.event.ActionEvent;
import models.dao.PersonasDAO;
import models.implementation.PersonasDaoImpl;
import models.pojo.Personas;
import models.pojo.Usuarios;
import util.Conexion;
import views.perfil.DatosLaborales;
import views.perfil.DatosPersonales;
import views.perfil.Experiencia_LaboralVista;
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

    private void initialize() {
        PersonasDAO personaDAO = new PersonasDaoImpl(Conexion.getConnection());
        String plantel = personaDAO.obtenerNombrePlantel(personaLogueada.getClave_plantel());
        String puesto = personaDAO.obtenerNombrePuesto(personaLogueada.getRfc());
        String cargo = personaDAO.obtenerNombreCargo(personaLogueada.getRfc());

        vistaPerfil.labelNombre.setText("NOMBRE: " + personaLogueada.nombreCompleto());
        vistaPerfil.labelRFC.setText("RFC: " + personaLogueada.getRfc());
        vistaPerfil.labelPlantel.setText("PLATEL: " + plantel);
        vistaPerfil.labelPuesto.setText("PUESTO: " + puesto);
        vistaPerfil.labelCargo.setText("CARGO: " + cargo);
    }

    private void botonDatosPersonales(ActionEvent e) {
        DatosPersonales vistaDatosPersonales = new DatosPersonales(FrameHijo.obtenerPadre(vistaPerfil), true);
        DatosPersonalesController controlDatosPersonales = new 
            DatosPersonalesController(vistaDatosPersonales, personaLogueada, vistaPerfil);
    }

    private void botonExperienciaLaboral(ActionEvent e) {
        Experiencia_LaboralVista vistaExperienciaLaboral = new Experiencia_LaboralVista(FrameHijo.obtenerPadre(vistaPerfil), true);
        ExperienciaLaboralController controlExperienciaLaboral = new ExperienciaLaboralController(vistaExperienciaLaboral,personaLogueada);
    }

    private void FormacionAcademica(ActionEvent e) {
        FormacionAcademica vistaFormacion_academica = new FormacionAcademica(FrameHijo.obtenerPadre(vistaPerfil), true);
        //FormacionAcademicaController controlFormacionAcademica = new FormacionAcademicaController(vistaFormacion_academica, personaLogueada);
    }

    private void botonDatosLaborales(ActionEvent e) {
        DatosLaborales vistaDatosLaborales = new DatosLaborales(FrameHijo.obtenerPadre(vistaPerfil), true);
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
