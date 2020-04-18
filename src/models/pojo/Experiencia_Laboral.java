package models.pojo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class Experiencia_Laboral {
    private int idexperiencia_laboral;
    private String rfc;
    private String empresa;
    private int permanencia;
    private String actividades;
    private String puesto;

    public Experiencia_Laboral(int idexperiencia_laboral, String rfc, String empresa, int permanencia, String actividades, String puesto) {
        this.idexperiencia_laboral = idexperiencia_laboral;
        this.rfc = rfc;
        this.empresa = empresa;
        this.permanencia = permanencia;
        this.actividades = actividades;
        this.puesto = puesto;
    }

    public Experiencia_Laboral() {
    }

    
    /**
     * @return the idexperiencia_laboral
     */
    public int getIdexperiencia_laboral() {
        return idexperiencia_laboral;
    }

    /**
     * @param idexperiencia_laboral the idexperiencia_laboral to set
     */
    public void setIdexperiencia_laboral(int idexperiencia_laboral) {
        this.idexperiencia_laboral = idexperiencia_laboral;
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
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa.toUpperCase();
    }

    /**
     * @return the permanencia
     */
    public int getPermanencia() {
        return permanencia;
    }

    /**
     * @param permanencia the permanencia to set
     */
    public void setPermanencia(int permanencia) {
        this.permanencia = permanencia;
    }

    /**
     * @return the actividades
     */
    public String getActividades() {
        return actividades;
    }

    /**
     * @param actividades the actividades to set
     */
    public void setActividades(String actividades) {
        this.actividades = actividades.toUpperCase();
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
}
