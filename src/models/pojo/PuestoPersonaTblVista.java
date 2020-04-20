package models.pojo;
/**
 *
 * @author tapac
 */
public class PuestoPersonaTblVista {
    private String rfc;
    private int idpuesto;
    private String puesto;
    private int idcargo;
    private String cargo;
    private int idjornada_laboral;
    private String jornada_laboral;

    public PuestoPersonaTblVista(String rfc, int idpuesto, String puesto, int idcargo, String cargo, int idjornada_laboral, String jornada_laboral) {
        this.rfc = rfc;
        this.idpuesto = idpuesto;
        this.puesto = puesto;
        this.idcargo = idcargo;
        this.cargo = cargo;
        this.idjornada_laboral = idjornada_laboral;
        this.jornada_laboral = jornada_laboral;
    }

    public PuestoPersonaTblVista() {
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
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the idcargo
     */
    public int getIdcargo() {
        return idcargo;
    }

    /**
     * @param idcargo the idcargo to set
     */
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the idjornada_laboral
     */
    public int getIdjornada_laboral() {
        return idjornada_laboral;
    }

    /**
     * @param idjornada_laboral the idjornada_laboral to set
     */
    public void setIdjornada_laboral(int idjornada_laboral) {
        this.idjornada_laboral = idjornada_laboral;
    }

    /**
     * @return the jornada_laboral
     */
    public String getJornada_laboral() {
        return jornada_laboral;
    }

    /**
     * @param jornada_laboral the jornada_laboral to set
     */
    public void setJornada_laboral(String jornada_laboral) {
        this.jornada_laboral = jornada_laboral;
    }
}
