package models.pojo;

public class Plantel {
    
    private String clave_plantel;
    private String plantel;
    private String telefono;
    
    public Plantel(){}

    public Plantel(String clave_plantel, String plantel, String telefono) {
        this.clave_plantel = clave_plantel;
        this.plantel = plantel;
        this.telefono = telefono;
    }

    public String getClave_plantel() {
        return clave_plantel;
    }

    public void setClave_plantel(String clave_plantel) {
        this.clave_plantel = clave_plantel;
    }

    public String getPlantel() {
        return plantel;
    }

    public void setPlantel(String plantel) {
        this.plantel = plantel;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString()
    {
        return "" + this.getPlantel();
    }
}