package models.pojo;

public class PuestoPersona {
    
    private String rfc_persona;
    private int idPuesto;
    private int idCargo;
    private int idJornadaLaboral;
    
    public PuestoPersona(){}

    public PuestoPersona(String rfc_persona, int idPuesto, int idCargo, int idJornadaLaboral) {
        this.rfc_persona = rfc_persona;
        this.idPuesto = idPuesto;
        this.idCargo = idCargo;
        this.idJornadaLaboral = idJornadaLaboral;
    }

    public String getRfc_persona() {
        return rfc_persona;
    }

    public void setRfc_persona(String rfc_persona) {
        this.rfc_persona = rfc_persona;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdJornadaLaboral() {
        return idJornadaLaboral;
    }

    public void setIdJornadaLaboral(int idJornadaLaboral) {
        this.idJornadaLaboral = idJornadaLaboral;
    }   
}