package controllers.catalogos;

import java.awt.event.ActionEvent;
import util.FrameHijo;
import views.catalogos.JDialog_Cargos;
import views.catalogos.JDialog_Planteles;
import views.catalogos.JDialog_Puestos;
import views.catalogos.JDialog_Subdirecciones;

import views.catalogos.Otros;

public class OtrosGeneralController {
    
    Otros vistaOtros;
    
    public OtrosGeneralController(Otros vista)
    {
        vistaOtros = vista;
        init();
    }
    
    private void init()
    {
        vistaOtros.btnAdminCargos.addActionListener(this::btnCargos);
        vistaOtros.btnAdminPlanteles.addActionListener(this::btnPlanteles);
        vistaOtros.btnAdminPuestos.addActionListener(this::btnPuestos);
        vistaOtros.btnAdminSubdirecciones.addActionListener(this::btnSubdirecciones);
        /*
        vistaOtros.btnAdminCarreras.addActionListener(this::btnCarreras);
        vistaOtros.btnAdminDepartamentos.addActionListener(this::btnDepartamentos);
        vistaOtros.btnAdminGradosAcademicos.addActionListener(this::btnGradosAcademicos);
        vistaOtros.btnAdminMaterias.addActionListener(this::btnMaterias);
        vistaOtros.btnAdminLugaresParaCursos.addActionListener(this::btnLugarCursos);
        
        vistaOtros.btnAdminPeriodosEscolares.addActionListener(this::btnPeriodosEscolares);
        */
    }
    
    public void btnCargos(ActionEvent evt)
    {
        JDialog_Cargos vista = new JDialog_Cargos(FrameHijo.obtenerPadre(vistaOtros), true);
        CargosController ctr = new CargosController(vista);
    }
    
    /*public void btnCarreras(ActionEvent evt)
    {
        JDialog_Carreras vistaCarreras = new JDialog_Carreras(obtenerPadre(vistaOtros), true);
        Carreras modeloCarreras = new Carreras();
        CarrerasSQL sqlCarreras = new CarrerasSQL();
        
        CarrerasController ctrl = new CarrerasController(vistaCarreras, modeloCarreras, sqlCarreras);
    }
    
    public void btnDepartamentos(ActionEvent evt)
    {
        JDialog_Departamentos vistaDepartamento = new JDialog_Departamentos(obtenerPadre(vistaOtros), true);
        Departamento modeloDepartamento = new Departamento();
        DepartamentoSQL sqlDepartamento = new DepartamentoSQL();
        
        DepartamentosController ctrl = new DepartamentosController(vistaDepartamento, modeloDepartamento, sqlDepartamento);
    }
    
    public void btnGradosAcademicos(ActionEvent evt)
    {
        JDialog_GradosAcademicos vistaGradosAcademicos = new JDialog_GradosAcademicos(obtenerPadre(vistaOtros), true);
        GradosAcademicos modeloGradosAcademicos = new GradosAcademicos();
        GradosAcademicosSQL sqlGradosAcademicos = new GradosAcademicosSQL();
        
        GradosAcademicosController ctrl = new GradosAcademicosController(vistaGradosAcademicos, 
                modeloGradosAcademicos, sqlGradosAcademicos);
    }
    
    public void btnLugarCursos(ActionEvent evt)
    {
        JDialog_LugaresCursos vistaLugarCursos = new JDialog_LugaresCursos(obtenerPadre(vistaOtros), true);
        Lugar modeloLugar = new Lugar();
        LugarSQL sqlLugar = new LugarSQL();
        
        LugaresCursosController ctrl = new LugaresCursosController(vistaLugarCursos, modeloLugar, sqlLugar);
    }
    
    public void btnMaterias(ActionEvent evt)
    {
        JDialog_Materias vista = new JDialog_Materias(obtenerPadre(vistaOtros), true);
        Materia modelo = new Materia();
        MateriaSQL sql = new MateriaSQL();
        
        MateriasController ctrl = new MateriasController(vista, modelo, sql);
    }
    
    
    
    public void btnPeriodosEscolares(ActionEvent evt)
    {
        JDialog_PeriodosEscolares vistaPeriodos = new JDialog_PeriodosEscolares(obtenerPadre(vistaOtros), true);
        PeriodosEscolares modeloPeriodos = new PeriodosEscolares();
        PeriodosEscolaresSQL sqlPeriodos = new PeriodosEscolaresSQL();
        
        PeriodosEscolaresController ctrl = new PeriodosEscolaresController(vistaPeriodos, modeloPeriodos, sqlPeriodos);
    }*/
    
    public void btnPlanteles(ActionEvent evt)
    {
        JDialog_Planteles vistaPlanteles = new JDialog_Planteles(FrameHijo.obtenerPadre(vistaOtros), true);
        PlantelController ctrl = new PlantelController(vistaPlanteles);
    }
    
    public void btnPuestos(ActionEvent evt)
    {
        JDialog_Puestos vista = new JDialog_Puestos(FrameHijo.obtenerPadre(vistaOtros), true);
        PuestoController ctrl = new PuestoController(vista);
    }
    
    public void btnSubdirecciones(ActionEvent evt)
    {
        JDialog_Subdirecciones vistaSubdirecciones = new JDialog_Subdirecciones(FrameHijo.obtenerPadre(vistaOtros), true);
        SubdireccionesController ctrl = new SubdireccionesController(vistaSubdirecciones);
    }
}