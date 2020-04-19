package models.pojo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class Producto {
    private int idproducto;
    private String rfc;
    private String producto_actividad;
    private String descripcion;
    private String fecha;

    public Producto(int idproducto, String rfc, String producto_actividad, String descripcion, String fecha) {
        this.idproducto = idproducto;
        this.rfc = rfc;
        this.producto_actividad = producto_actividad;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Producto() {
    }

    /**
     * @return the idproducto
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * @param idproducto the idproducto to set
     */
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the producto_actividad
     */
    public String getProducto_actividad() {
        return producto_actividad;
    }

    /**
     * @param producto_actividad the producto_actividad to set
     */
    public void setProducto_actividad(String producto_actividad) {
        this.producto_actividad = producto_actividad.toUpperCase();
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion.toUpperCase();
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha.toUpperCase();
    }
}
