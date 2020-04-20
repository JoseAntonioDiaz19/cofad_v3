package models.pojo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class Puesto {
    private int idpuesto;
    private int idtipo_puesto;
    private int idsubdireccion;
    private String puesto;
    private String correo;
    private String extension;

    public Puesto(int idpuesto, int idtipo_puesto, int idsubdireccion, String puesto, String correo, String extension) {
        this.idpuesto = idpuesto;
        this.idtipo_puesto = idtipo_puesto;
        this.idsubdireccion = idsubdireccion;
        this.puesto = puesto;
        this.correo = correo;
        this.extension = extension;
    }

    public Puesto() {
    }
    
    

    /**
     * @return the idpuesto
     */
    public int getIdpuesto() {
        return idpuesto;
    }

    /**
     * @param idpuesto the idpuesto to set
     */
    public void setIdpuesto(int idpuesto) {
        this.idpuesto = idpuesto;
    }

    /**
     * @return the idtipo_puesto
     */
    public int getIdtipo_puesto() {
        return idtipo_puesto;
    }

    /**
     * @param idtipo_puesto the idtipo_puesto to set
     */
    public void setIdtipo_puesto(int idtipo_puesto) {
        this.idtipo_puesto = idtipo_puesto;
    }

    /**
     * @return the idsubdireccion
     */
    public int getIdsubdireccion() {
        return idsubdireccion;
    }

    /**
     * @param idsubdireccion the idsubdireccion to set
     */
    public void setIdsubdireccion(int idsubdireccion) {
        this.idsubdireccion = idsubdireccion;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto.toUpperCase();
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
}
