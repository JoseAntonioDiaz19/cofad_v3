package models.pojo;

public class PersonasTblVista extends Personas{
    
    private String cargo;
    private String puesto;
    private String status;
    
    public PersonasTblVista(String cargo, String puesto, String status, String rfc, 
            String curp, String nombre, String ape_paterno, String ape_materno) {
        super(rfc, curp, nombre, ape_paterno, ape_materno);
        this.cargo = cargo;
        this.puesto = puesto;
        this.status = status;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
