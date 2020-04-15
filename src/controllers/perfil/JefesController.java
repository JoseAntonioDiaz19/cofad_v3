package controllers.perfil;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.List;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
//import vistas.utilidades.Bloq_Mayus;
//import vistas.modulos.personal.JDialog_Jefes;
//import modelos.entidades.vistas.JefesVista;
//import modelos.sql.vistas.JefesVistaSQL;
//import vistas.modulos.perfil.DatosLaborales;

public class JefesController{
    /*private int opcionBusqueda;
    JDialog_Jefes vistaJefes;
    JefesVista modeloJefes;
    JefesVistaSQL sqlJefes;
    private String rfcJefeTabla;
    private DatosLaborales vistaDatosLaborales;
    DefaultTableModel modelTablaJefes;

    public JefesController(JDialog_Jefes vistaJefes, JefesVista modeloJefes,
                           JefesVistaSQL sqlJefes, DatosLaborales vistaDatosLaborales){
        this.vistaJefes = vistaJefes;
        this.modeloJefes = modeloJefes;
        this.sqlJefes = sqlJefes;
        this.vistaDatosLaborales = vistaDatosLaborales;
        rfcJefeTabla = "";
        initialize();
    }

    public JefesController(JDialog_Jefes vistaJefes, JefesVista modeloJefes, JefesVistaSQL sqlJefes) {
        this.vistaJefes = vistaJefes;
        this.modeloJefes = modeloJefes;
        this.sqlJefes = sqlJefes;
        initialize();
    }
    
    private void initialize(){
        vistaJefes.setTitle("Jefes inmediatos");
        
        vistaJefes.setAlwaysOnTop(true);
        modelTablaJefes = (DefaultTableModel)vistaJefes.tblPersonas.getModel();
        llenarTablaJefes();
        
        vistaJefes.setLocationRelativeTo(null);
        vistaJefes.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaJefes.txtFiltrado.setDocument(new Bloq_Mayus());
        
        
        vistaJefes.tblPersonas.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt)
            {
                filaSeleccionada(evt);
            }
        });
        
        vistaJefes.txtFiltrado.addKeyListener(new KeyAdapter(){
           @Override
           public void keyReleased(KeyEvent evt)
           {
               txtJefeBusqueda(evt);
           }
        });
        vistaJefes.setVisible(true);
    }
    
    public void txtJefeBusqueda(KeyEvent evt){
        String cadena = vistaJefes.txtFiltrado.getText();
        llenarTablaFiltrada(sqlJefes.busquedaFiltradaJefes(cadena));
    }
    
    private void llenarTablaJefes(){
        modelTablaJefes.setNumRows(0);
        List<JefesVista>lista = sqlJefes.listaJefes();
        for (int i = 0; i < lista.size(); i++) {
            modelTablaJefes.addRow(new Object[]{
                lista.get(i).getRFC(),
                lista.get(i).getNombre(),
                lista.get(i).getCargo(),
                lista.get(i).getDepartamento(),
                lista.get(i).getSubdireccion()
            });   
        }     
    }
    
    private void llenarTablaFiltrada(List<JefesVista> lista){
        modelTablaJefes.setNumRows(0);
        for (int i = 0; i < lista.size(); i++){
            modelTablaJefes.addRow(new Object[]{
                lista.get(i).getRFC(),
                lista.get(i).getNombre(),
                lista.get(i).getCargo(),
                lista.get(i).getDepartamento(),
                lista.get(i).getSubdireccion()
            });
        }
    }
    
    private void filaSeleccionada(MouseEvent evt){
        vistaDatosLaborales.txtJefeInmediato.setText(String.valueOf(
                vistaJefes.tblPersonas.getValueAt(
                        vistaJefes.tblPersonas.getSelectedRow(), 1)));
        this.setRfc_jefe(String.valueOf(vistaJefes.tblPersonas.getValueAt(
                vistaJefes.tblPersonas.getSelectedRow(), 0)));
        this.vistaJefes.dispose();
    }

    public String getRfc_jefe() {
        return rfcJefeTabla;
    }

    public void setRfc_jefe(String rfc_jefe) {
        this.rfcJefeTabla = rfc_jefe;
    }*/
}