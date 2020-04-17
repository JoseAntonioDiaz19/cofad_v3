package models.pojo;

public class Puestos {
    
    private int idpuesto;
    private int idtipo_puesto;
    private int idsubdireccion;
    private String puesto;
    private String correo;
    private String extension;
    
    public Puestos(){}

    public Puestos(int idpuesto, int idtipo_puesto, int idsubdireccion, 
            String puesto, String correo, String extension) {
        this.idpuesto = idpuesto;
        this.idtipo_puesto = idtipo_puesto;
        this.idsubdireccion = idsubdireccion;
        this.puesto = puesto;
        this.correo = correo;
        this.extension = extension;
    }
    
    public int getIdpuesto() {
        return idpuesto;
    }

    public void setIdpuesto(int idpuesto) {
        this.idpuesto = idpuesto;
    }

    public int getIdtipo_puesto() {
        return idtipo_puesto;
    }

    public void setIdtipo_puesto(int idtipo_puesto) {
        this.idtipo_puesto = idtipo_puesto;
    }

    public int getIdsubdireccion() {
        return idsubdireccion;
    }

    public void setIdsubdireccion(int idsubdireccion) {
        this.idsubdireccion = idsubdireccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    public String toString()
    {
        return "" + this.getPuesto();
    }
}