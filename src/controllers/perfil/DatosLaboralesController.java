package controllers.perfil;
/*import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelos.entidades.Cargos;
import modelos.entidades.Carreras;
import modelos.entidades.Departamento;
import modelos.entidades.Persona;
import modelos.entidades.Plantel;
import modelos.entidades.vistas.JefesVista;
import modelos.sql.CargosSQL;
import modelos.sql.CarrerasSQL;
import modelos.sql.DepartamentoSQL;
import modelos.sql.PersonaSQL;
import modelos.sql.PlantelSQL;
import modelos.sql.vistas.JefesVistaSQL;
import vistas.modulos.perfil.DatosLaborales;
import vistas.modulos.personal.JDialog_Jefes;
/**
 *
 * @author Jose Antonio Diaz
 */
public class DatosLaboralesController {
    /*
    DatosLaborales vistaDatosLaborales;
    Persona personaLogueada;
    ArrayList <Departamento> listaDepartamento;
    ArrayList <Cargos> listaCargos;
    ArrayList <Plantel> listaPlanteles;
    ArrayList <Carreras> listaCarreras;
    private String rfcJefeTabla;
    String rfcJefeActual;
    JefesVista datosJefeActual;

    DatosLaboralesController(DatosLaborales vistaDatosLaborales, Persona personaLogueada) {
        this.vistaDatosLaborales = vistaDatosLaborales;
        this.personaLogueada = personaLogueada;
        inicializar();
    }
    private void inicializar(){
        vistaDatosLaborales.setTitle("Datos personales");
        vistaDatosLaborales.setAlwaysOnTop(true);
        vistaDatosLaborales.setLocationRelativeTo(null);
        vistaDatosLaborales.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaDatosLaborales.setSize(850, 463);
        llenarCombos();
        valoresExterno();
        cargarDatosLaborales();
        jefeActual();
        vistaDatosLaborales.btnGuardarCambios.addActionListener(this::guardarCambios);
        vistaDatosLaborales.btnAgregar.addActionListener(this::agregarJefeInmediato);
        vistaDatosLaborales.setVisible(true);
    }
    
    private void cargarDatosLaborales(){
        PersonaSQL sqlPersona = new PersonaSQL();
        
        if (personaLogueada.isEs_externo() == false) {
            
            vistaDatosLaborales.boxPlantel.setSelectedItem(sqlPersona.obtenerNombrePlantel(personaLogueada.getClave_plantel()));
            vistaDatosLaborales.boxPuesto.setSelectedItem(sqlPersona.obtenerNombreDepartamento(personaLogueada.getId_departamento()));                                                        
            vistaDatosLaborales.boxCargo.setSelectedItem(sqlPersona.obtenerNombreCargo(personaLogueada.getId_cargo()));                   
            vistaDatosLaborales.boxHoras.setSelectedItem(personaLogueada.getHoras());
            vistaDatosLaborales.boxTipoPuesto.setSelectedItem(personaLogueada.getTipo_puesto());

            if (personaLogueada.getJefe_inmediato() == null) {
                vistaDatosLaborales.txtJefeInmediato.setText("NO ESPECIFICADO");
            }else{
                 vistaDatosLaborales.txtJefeInmediato.setText(sqlPersona.obtenerNombreJefe(personaLogueada.getRFC()));
            }

            if (sqlPersona.obtenerNombreCarrera(personaLogueada.getClave_carrera()) == null) {
                vistaDatosLaborales.boxCarreraArea.setSelectedItem("NO ESPECIFICADO");
            }else{
                vistaDatosLaborales.boxCarreraArea.setSelectedItem(sqlPersona.obtenerNombreCarrera
                                                                  (personaLogueada.getClave_carrera()));
            }
        }
    }
    
    private void valoresExterno(){
        if (personaLogueada.isEs_externo() == true) {          
           vistaDatosLaborales.boxPuesto.setSelectedItem("NO ESPECIFICADO");
            vistaDatosLaborales.boxPuesto.setEnabled(false);
            vistaDatosLaborales.boxCargo.setSelectedItem("NO ESPECIFICADO");
            vistaDatosLaborales.boxCargo.setEnabled(false);
            vistaDatosLaborales.boxHoras.setSelectedItem("NO ESPECIFICADO");
            vistaDatosLaborales.boxHoras.setEnabled(false);
            vistaDatosLaborales.boxTipoPuesto.setSelectedItem("NO ESPECIFICADO");
            vistaDatosLaborales.boxTipoPuesto.setEnabled(false);
            vistaDatosLaborales.btnAgregar.setEnabled(false);
            vistaDatosLaborales.boxCarreraArea.setSelectedItem("NO ESPECIFICADO");        
        }
    }
    
    private void jefeActual(){
        JefesVistaSQL sqlJefes = new JefesVistaSQL();
        rfcJefeActual = sqlJefes.obtenerRfcJefe(personaLogueada.getRFC());
        datosJefeActual = sqlJefes.obtenerDatosJefe(rfcJefeTabla);
    }

    private void guardarCambios(ActionEvent e) {
       
    }
    
    private boolean validarCaposVaciosInterno(){
        String cargo = (String.valueOf(vistaDatosLaborales.boxCargo.getSelectedItem()));
        String puesto = (String.valueOf(vistaDatosLaborales.boxPuesto.getSelectedItem()));
        String plantel = (String.valueOf(vistaDatosLaborales.boxPlantel.getSelectedItem()));
        boolean externo;
        String horas = (String.valueOf(vistaDatosLaborales.boxHoras.getSelectedItem()));
        String tipoPuesto = (String.valueOf(vistaDatosLaborales.boxTipoPuesto.getSelectedItem()));
        String jefeInmediato = vistaDatosLaborales.txtJefeInmediato.getText();
        String carreraArea = (String.valueOf(vistaDatosLaborales.boxCarreraArea.getSelectedItem()));
        boolean correctoInternoSelect = false;
        
        if (!cargo.equals("-- Seleccione un cargo --")) {
            if (!puesto.equals("-- Seleccione un puesto --")) {
                if (!plantel.equals("-- Seleccione un plantel --")) {
                    if (!horas.equals("-- Seleccione las horas --")) {
                        if (!tipoPuesto.equals("-- Seleccione su tipo de puesto --")) {
                            if (!jefeInmediato.equals("")) {
                                if (!carreraArea.equals("-- Seleccione su carrera o área --")) {
                                    correctoInternoSelect = true;
                                }
                            }else{JOptionPane.showMessageDialog(vistaDatosLaborales, "Debe elegir un jefe inmediato");}
                        }else{JOptionPane.showMessageDialog(vistaDatosLaborales, "Debe elegir un tipo de puesto");}
                    }else{JOptionPane.showMessageDialog(vistaDatosLaborales, "Debe elegir sus horas");}
                }else{JOptionPane.showMessageDialog(vistaDatosLaborales, "Debe elegir un plantel");}
            }else{JOptionPane.showMessageDialog(vistaDatosLaborales, "Debe elegir un puesto");}
        }else{JOptionPane.showMessageDialog(vistaDatosLaborales, "Debe seleccionar un cargo");}
        
        return correctoInternoSelect;
    }
    
    private boolean validarCaposVaciosExterno(){
        String plantel = (String.valueOf(vistaDatosLaborales.boxPlantel.getSelectedItem()));
        boolean correctoExternoSelect = false;
        
        if (!plantel.equals("-- Seleccione un plantel --")) {
            correctoExternoSelect = true;
        }else{JOptionPane.showMessageDialog(vistaDatosLaborales, "Debe elegir un plantel");}
        
        return correctoExternoSelect;
    }
    
    private void llenarCombos(){
        llenarComboCargo();
        llenarComboPuesto();
        llenarComboPlantel();
        llenarComboCarreraArea();
    }
    
    private void llenarComboCargo(){
        CargosSQL sqlCargos = new CargosSQL();
        listaCargos = (ArrayList<Cargos>) sqlCargos.lista();
        int iteraciones = listaCargos.size();
        for (int i = 0; i < iteraciones; i++) {
            vistaDatosLaborales.boxCargo.addItem(listaCargos.get(i).getCargo());
        } 
    }
    
    private void llenarComboPuesto(){
        DepartamentoSQL sqlDepartamento = new DepartamentoSQL();
        listaDepartamento = sqlDepartamento.listaPuestos();
        int iteraciones = listaDepartamento.size();
        for (int i = 0; i < iteraciones; i++) {
            vistaDatosLaborales.boxPuesto.addItem(listaDepartamento.get(i).getDepartamento());
        } 
    }
    
    private void llenarComboPlantel(){
        PlantelSQL sqlPlantel = new PlantelSQL();
        listaPlanteles = (ArrayList<Plantel>) sqlPlantel.listaPlanteles();
        int iteraciones = listaPlanteles.size();
        for (int i = 0; i < iteraciones; i++) {
            vistaDatosLaborales.boxPlantel.addItem(listaPlanteles.get(i).getNombrePlantel());
        } 
    }    
    
    private void llenarComboCarreraArea(){
        CarrerasSQL sqlCarreras = new CarrerasSQL();
        listaCarreras = (ArrayList<Carreras>) sqlCarreras.listaCarreras();
        int iteraciones = listaCarreras.size();
        for (int i = 0; i < iteraciones; i++) {
            vistaDatosLaborales.boxCarreraArea.addItem(listaCarreras.get(i).getCarrera());
        } 
    }

    private void agregarJefeInmediato(ActionEvent e) {
        JefesVista modeloJefes = new JefesVista();
        JefesVistaSQL sqlJefes = new JefesVistaSQL();
        JDialog_Jefes vistaJefes = new JDialog_Jefes(null, true);

        JefesController ctrlJefes = new JefesController(vistaJefes,modeloJefes, sqlJefes, vistaDatosLaborales);
        setRfcJefeTabla(ctrlJefes.getRfc_jefe());
    }
    
    public Frame obtenerPadre(JPanel panelVista)
    {
        Window padre = SwingUtilities.windowForComponent(panelVista);
        Frame parentFrame = (Frame)padre;
        
        return parentFrame;
    }

    
    public String getRfcJefeTabla() {
        return rfcJefeTabla;
    }

    public void setRfcJefeTabla(String rfcJefe) {
        this.rfcJefeTabla = rfcJefe;
    }*/
}
