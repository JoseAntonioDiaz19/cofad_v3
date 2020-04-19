package controllers.perfil;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import models.dao.ProductosDAO;
import models.implementation.ProductosDaoImpl;
import models.pojo.Personas;
import models.pojo.Producto;
import util.Conexion;
import views.perfil.ProductosAcademicosVista;

/**
 *
 * @author Jose Antonio Diaz
 */
public class ProductosAcademicosController {
    
    ProductosAcademicosVista vistaProductos;
    Personas personaLogueada;
    DefaultTableModel modelTablaProductos;
    ProductosDAO productoDAOImpl = new ProductosDaoImpl(Conexion.getConnection());
    List<Producto> lista;
    
    ProductosAcademicosController(ProductosAcademicosVista vistaProductos, Personas personaLogueada) {
        this.personaLogueada = personaLogueada;
        this.vistaProductos = vistaProductos;
        modelTablaProductos = (DefaultTableModel) this.vistaProductos.tblProductosAcademicos.getModel();
        vistaProductos.btnRegistrarUsuario.addActionListener(this::registrar);
        vistaProductos.btnEliminar.addActionListener(this::eliminar);
        vistaProductos.btnGuardarCambios.addActionListener(this::guardarCambios);
        vistaProductos.tblProductosAcademicos.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                if (e.getClickCount() == 2) {
                    llenarCampos();
                }
            }
        });
        inicializar();
    }

    private void inicializar() {
        vistaProductos.setTitle("Productos académicos");
        vistaProductos.setAlwaysOnTop(true);
        vistaProductos.setLocationRelativeTo(null);
        vistaProductos.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vistaProductos.setSize(950, 620);
        llenarTablaExperienciaLaboral();
        vistaProductos.btnGuardarCambios.setEnabled(false);
        vistaProductos.btnEliminar.setEnabled(false);
        vistaProductos.setVisible(true);
    }
    
    private void llenarCampos() {
        
        int filaSeleccionadaProducto = vistaProductos.tblProductosAcademicos.getSelectedRow();
        String producto_actividad = (String.valueOf(vistaProductos.tblProductosAcademicos.getValueAt(filaSeleccionadaProducto, 1)));
        String descripcion = (String.valueOf(vistaProductos.tblProductosAcademicos.getValueAt(filaSeleccionadaProducto, 2)));
        String fecha = (String.valueOf(vistaProductos.tblProductosAcademicos.getValueAt(filaSeleccionadaProducto, 3)));
        int id = Integer.parseInt(String.valueOf(vistaProductos.tblProductosAcademicos.getValueAt(filaSeleccionadaProducto, 0)));
        int idproducto = lista.get(id - 1).getIdproducto();

        //Separar fecha
        String[] elementosFecha = fecha.split(" ");
        String mesInicio = elementosFecha[0];
        String añoInicio = elementosFecha[1];
        String mesFin = elementosFecha[3];
        String añoFin = elementosFecha[4];

        //Enviar datos a la interfaz
        vistaProductos.fieldDescripcion.setText(descripcion);
        vistaProductos.fieldProducto.setText(producto_actividad);
        vistaProductos.mesInicio.setMonth(obtenerNumeroMes(mesInicio));
        vistaProductos.mesFin.setMonth(obtenerNumeroMes(mesFin));
        vistaProductos.añoInicio.setYear(Integer.parseInt(añoInicio));
        vistaProductos.añoFin.setYear(Integer.parseInt(añoFin));
        
        vistaProductos.btnGuardarCambios.setEnabled(true);
        vistaProductos.btnEliminar.setEnabled(true);
        vistaProductos.btnRegistrarUsuario.setEnabled(false);
    }
    
    private void llenarTablaExperienciaLaboral() {
        modelTablaProductos.setNumRows(0);
        lista = productoDAOImpl.GetAllBy(personaLogueada.getRfc());
        for (int i = 0; i < lista.size(); i++) {
            modelTablaProductos.addRow(new Object[]{
                i + 1,
                lista.get(i).getProducto_actividad(),
                lista.get(i).getDescripcion(),
                lista.get(i).getFecha()
            });            
        }
    }
    
    private void registrar(ActionEvent e) {
        String producto_actividad = vistaProductos.fieldProducto.getText();
        String descripcion = vistaProductos.fieldDescripcion.getText();
        String mesInicio = obtenerNombreMes(vistaProductos.mesInicio.getMonth() + 1);
        String añoInicio = String.valueOf(vistaProductos.añoInicio.getYear());
        String mesFin = obtenerNombreMes(vistaProductos.mesFin.getMonth() + 1);
        String añoFin = String.valueOf(vistaProductos.añoFin.getYear());
        String fecha = mesInicio + " " + añoInicio + " A " + mesFin + " " + añoFin;
        String rfc = personaLogueada.getRfc();
        
        boolean datosLlenos = false;
        if (!producto_actividad.equals("")) {
            if (!descripcion.equals("")) {
                datosLlenos = true;
            } else {
                JOptionPane.showMessageDialog(vistaProductos, "Debe llenar el campo de descripción");
            }
        } else {
            JOptionPane.showMessageDialog(vistaProductos, "Debe llenar el campo de producto/actividad");
        }
        
        if (datosLlenos) {
            Producto nuevoProducto = new Producto();
            nuevoProducto.setDescripcion(descripcion);
            nuevoProducto.setFecha(fecha);
            nuevoProducto.setProducto_actividad(producto_actividad);
            nuevoProducto.setRfc(rfc);
            
            boolean registroCorrecto;
            try {
                registroCorrecto = productoDAOImpl.Insert(nuevoProducto);
                if (registroCorrecto) {
                    JOptionPane.showMessageDialog(vistaProductos, "Producto/Actividad agregado correctamente");
                    vistaProductos.fieldDescripcion.setText("");
                    vistaProductos.fieldProducto.setText("");        
                    vistaProductos.btnGuardarCambios.setEnabled(false);
                    vistaProductos.btnEliminar.setEnabled(false);
                    llenarTablaExperienciaLaboral();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
    
    private void eliminar(ActionEvent e) {
        
        Producto productoEliminar = new Producto();
        
        int filaSeleccionadaProducto = vistaProductos.tblProductosAcademicos.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(vistaProductos.tblProductosAcademicos.getValueAt(filaSeleccionadaProducto, 0)));
        
        int idproducto = lista.get(id - 1).getIdproducto();
        productoEliminar.setIdproducto(idproducto);
        
        int res = JOptionPane.showConfirmDialog(vistaProductos, "Confirmar eliminación");
        if (res == JOptionPane.YES_OPTION) {
            productoDAOImpl.Delete(productoEliminar);
            JOptionPane.showMessageDialog(vistaProductos, "Operacion completada correctamente");
            vistaProductos.fieldDescripcion.setText("");
            vistaProductos.fieldProducto.setText("");
            vistaProductos.btnGuardarCambios.setEnabled(false);
            vistaProductos.btnEliminar.setEnabled(false);
            vistaProductos.btnRegistrarUsuario.setEnabled(false);
            llenarTablaExperienciaLaboral();
        }
    }
    
    private void guardarCambios(ActionEvent e) {
        System.out.println("Dentro de guardar cambios");
        String producto_actividad = vistaProductos.fieldProducto.getText();
        String descripcion = vistaProductos.fieldDescripcion.getText();
        String mesInicio = obtenerNombreMes(vistaProductos.mesInicio.getMonth() + 1);
        String añoInicio = String.valueOf(vistaProductos.añoInicio.getYear());
        String mesFin = obtenerNombreMes(vistaProductos.mesFin.getMonth() + 1);
        String añoFin = String.valueOf(vistaProductos.añoFin.getYear());
        String fecha = mesInicio + " " + añoInicio + " A " + mesFin + " " + añoFin;
        String rfc = personaLogueada.getRfc();
        
        int filaSeleccionadaProducto = vistaProductos.tblProductosAcademicos.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(vistaProductos.tblProductosAcademicos.getValueAt(filaSeleccionadaProducto, 0)));
        
        int idproducto = lista.get(id - 1).getIdproducto();
        System.out.println("idproducto: " + idproducto + "id: " + id );
       
        boolean datosLlenos = false;
        if (!producto_actividad.equals("")) {
            if (!descripcion.equals("")) {
                datosLlenos = true;
            } else {
                JOptionPane.showMessageDialog(vistaProductos, "Debe llenar el campo de descripción");
            }
        } else {
            JOptionPane.showMessageDialog(vistaProductos, "Debe llenar el campo de producto/actividad");
        }
        
        if (datosLlenos) {
            Producto actualizarProducto = new Producto();
            actualizarProducto.setDescripcion(descripcion);
            actualizarProducto.setFecha(fecha);
            actualizarProducto.setProducto_actividad(producto_actividad);
            actualizarProducto.setRfc(rfc);
            actualizarProducto.setIdproducto(idproducto);
            
            boolean registroCorrecto;
            try {
                registroCorrecto = productoDAOImpl.Update(actualizarProducto);
                System.out.println("Actualización realizada");
                if (registroCorrecto) {
                    JOptionPane.showMessageDialog(vistaProductos, "Producto/Actividad actualizado correctamente");
                    vistaProductos.fieldDescripcion.setText("");
                    vistaProductos.fieldProducto.setText("");
                    vistaProductos.btnGuardarCambios.setEnabled(false);
                    vistaProductos.btnEliminar.setEnabled(false);
                    vistaProductos.btnRegistrarUsuario.setEnabled(true);
                    llenarTablaExperienciaLaboral();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        
    }
    
    private String obtenerNombreMes(int mes) {
        String nombreMes;
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Invalid month";
                break;
        }
        return nombreMes;
    }
    
    private int obtenerNumeroMes(String mes) {
        int numeroMes;
        switch (mes) {
            case "ENERO":
                numeroMes = 0;
                break;
            case "FEBRERO":
                numeroMes = 1;
                break;
            case "MARZO":
                numeroMes = 2;
                break;
            case "ABRIL":
                numeroMes = 3;
                break;
            case "MAYO":
                numeroMes = 4;
                break;
            case "JUNIO":
                numeroMes = 5;
                break;
            case "JULIO":
                numeroMes = 6;
                break;
            case "AGOSTO":
                numeroMes = 7;
                break;
            case "SEPTIEMBRE":
                numeroMes = 8;
                break;
            case "OCTUBRE":
                numeroMes = 9;
                break;
            case "NOVIEMBRE":
                numeroMes = 10;
                break;
            case "DICIEMBRE":
                numeroMes = 11;
                break;
            default:
                numeroMes = -1;
                break;
        }
        return numeroMes;
    }
    
}
