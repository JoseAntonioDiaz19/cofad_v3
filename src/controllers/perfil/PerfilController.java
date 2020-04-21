package controllers.perfil;
import java.awt.event.ActionEvent;
import models.dao.PersonasDAO;
import models.implementation.PersonasDaoImpl;
import models.pojo.Personas;
import models.pojo.Usuarios;
import util.Conexion;
import views.perfil.DatosLaboralesVista;
import views.perfil.DatosPersonalesVista;
import views.perfil.Experiencia_LaboralVista;
import views.perfil.PersonaFormAcademVista;
import views.perfil.PerfilVista;
//import views.usuarios.CambiarContraseña;
import views.dashboard.DashboardAdmin;

import util.FrameHijo;
import static util.FrameHijo.obtenerPadre;
import views.perfil.ExperienciaDocenteVista;
import views.perfil.ProductosAcademicosVista;
import views.usuarios.CambiarContraseña;

public class PerfilController {

    Personas personaLogueada;
    PerfilVista vistaPerfil;
    Usuarios modeloUsuario;
    DashboardAdmin mainView;

    public PerfilController(Personas personaLogueada, PerfilVista vistaPerfil, 
            DashboardAdmin mainView, Usuarios modeloUsuario) {
        
        this.personaLogueada = personaLogueada;
        this.vistaPerfil = vistaPerfil;
        this.mainView = mainView;
        this.modeloUsuario = modeloUsuario;
        vistaPerfil.botonDatosPersonales.addActionListener(this::botonDatosPersonales);
        vistaPerfil.botonExperienciaLaboral.addActionListener(this::botonExperienciaLaboral);
        vistaPerfil.botonFormacionAcademica.addActionListener(this::FormacionAcademica);
        vistaPerfil.botonProductos.addActionListener(this::botonProductos);
        vistaPerfil.botonExperienciaDocente.addActionListener(this::botonExPerienciaDocente);
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
        DatosPersonalesVista vistaDatosPersonales = new DatosPersonalesVista(FrameHijo.obtenerPadre(vistaPerfil), true);
        DatosPersonalesController controlDatosPersonales = new 
            DatosPersonalesController(vistaDatosPersonales, personaLogueada, vistaPerfil);
    }

    private void botonExperienciaLaboral(ActionEvent e) {
        Experiencia_LaboralVista vistaExperienciaLaboral = new Experiencia_LaboralVista(FrameHijo.obtenerPadre(vistaPerfil), true);
        ExperienciaLaboralController controlExperienciaLaboral = new ExperienciaLaboralController(vistaExperienciaLaboral,personaLogueada);
    }

    private void FormacionAcademica(ActionEvent e) {
        PersonaFormAcademVista vistaPersonaFormAcadem = new PersonaFormAcademVista(FrameHijo.obtenerPadre(vistaPerfil), true);
        PersonaFormAcademController controlPersonaFormaAcadem = new PersonaFormAcademController(vistaPersonaFormAcadem, personaLogueada);
    }

    private void botonDatosLaborales(ActionEvent e) {
        DatosLaboralesVista vistaDatosLaborales = new DatosLaboralesVista(FrameHijo.obtenerPadre(vistaPerfil), true);
        //DatosLaboralesController controlDatosLaborales = new DatosLaboralesController(vistaDatosLaborales, personaLogueada);
    }

    private void botonCambiarContraseña(ActionEvent e) {
        CambiarContraseña vistaCambiarContraseña = new CambiarContraseña(obtenerPadre(vistaPerfil),true);
        CambiarMiContraseñaController controlCambiarContraseña = 
                new CambiarMiContraseñaController(vistaCambiarContraseña, 
                        personaLogueada, modeloUsuario, mainView);
    }

    private void botonResumenCursos(ActionEvent e) {

    }

    private void botonProductos(ActionEvent e) {
        ProductosAcademicosVista vistaProductos = new ProductosAcademicosVista(FrameHijo.obtenerPadre(vistaPerfil), true);
        ProductosAcademicosController controlProductosAcademicos = new ProductosAcademicosController(vistaProductos, personaLogueada);
    }

    private void botonExPerienciaDocente(ActionEvent e) {
        ExperienciaDocenteVista vistaExperienciaDocente = new ExperienciaDocenteVista(FrameHijo.obtenerPadre(vistaPerfil), true);
        ExperienciaDocenteController controlExperienciaDocente = new ExperienciaDocenteController(vistaExperienciaDocente, personaLogueada);
    }
}
