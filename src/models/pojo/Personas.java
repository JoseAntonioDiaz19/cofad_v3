package models.pojo;

public class Personas {
    
    private String rfc;
    private String clave_plantel;
    private int idstatus_persona;
    private String idAbreviatura_Titulo;
    private String curp;
    private String nombre;
    private String ape_paterno;
    private String ape_materno;
    private String sexo;
    private String fecha_nac;
    private String correo;
    private String telefono;
    private String clave_presupuestal;
    private String num_tarjeta;
    private boolean es_externo;
    
    public Personas(){}

    public Personas(String rfc, String curp, String nombre, String ape_paterno, 
            String ape_materno) {
        this.rfc = rfc;
        this.curp = curp;
        this.nombre = nombre;
        this.ape_paterno = ape_paterno;
        this.ape_materno = ape_materno;
    }

    public Personas(String rfc, String clave_plantel, int idstatus_persona, 
            String idAbreviatura_Titulo, String curp, String nombre, String ape_paterno, 
            String ape_materno, String sexo, String fecha_nac, String correo, 
            String telefono, String clave_presupuestal, String num_tarjeta, 
            boolean es_externo) {
        this.rfc = rfc;
        this.clave_plantel = clave_plantel;
        this.idstatus_persona = idstatus_persona;
        this.idAbreviatura_Titulo = idAbreviatura_Titulo;
        this.curp = curp;
        this.nombre = nombre;
        this.ape_paterno = ape_paterno;
        this.ape_materno = ape_materno;
        this.sexo = sexo;
        this.fecha_nac = fecha_nac;
        this.correo = correo;
        this.telefono = telefono;
        this.clave_presupuestal = clave_presupuestal;
        this.num_tarjeta = num_tarjeta;
        this.es_externo = es_externo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getClave_plantel() {
        return clave_plantel;
    }

    public void setClave_plantel(String clave_plantel) {
        this.clave_plantel = clave_plantel;
    }

    public int getIdstatus_persona() {
        return idstatus_persona;
    }

    public void setIdstatus_persona(int idstatus_persona) {
        this.idstatus_persona = idstatus_persona;
    }

    public String getIdAbreviatura_Titulo() {
        return idAbreviatura_Titulo;
    }

    public void setIdAbreviatura_Titulo(String idAbreviatura_Titulo) {
        this.idAbreviatura_Titulo = idAbreviatura_Titulo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) {
        this.ape_materno = ape_materno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave_presupuestal() {
        return clave_presupuestal;
    }

    public void setClave_presupuestal(String clave_presupuestal) {
        this.clave_presupuestal = clave_presupuestal;
    }

    public String getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public boolean isEs_externo() {
        return es_externo;
    }

    public void setEs_externo(boolean es_externo) {
        this.es_externo = es_externo;
    }
    
    public String nombreCompleto()
    {
        return getNombre() +  " " + getApe_paterno()+  " " + getApe_materno();
    }
    
    @Override
    public String toString()
    {
        return "";
    }
}