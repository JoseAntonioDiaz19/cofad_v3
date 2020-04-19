package models.pojo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class ExperienciaDocente {
    private int idexperiencia_docente;
    private String rfc;
    private String materia;
    private String mes_inicio;
    private String mes_fin;
    private int año;

    public ExperienciaDocente(int idexperiencia_docente, String rfc, String materia, String mes_inicio, String mes_fin, int año) {
        this.idexperiencia_docente = idexperiencia_docente;
        this.rfc = rfc;
        this.materia = materia;
        this.mes_inicio = mes_inicio;
        this.mes_fin = mes_fin;
        this.año = año;
    }

    public ExperienciaDocente() {
    }
   
    /**
     * @return the idexperiencia_docente
     */
    public int getIdexperiencia_docente() {
        return idexperiencia_docente;
    }

    /**
     * @param idexperiencia_docente the idexperiencia_docente to set
     */
    public void setIdexperiencia_docente(int idexperiencia_docente) {
        this.idexperiencia_docente = idexperiencia_docente;
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
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the mes_inicio
     */
    public String getMes_inicio() {
        return mes_inicio;
    }

    /**
     * @param mes_inicio the mes_inicio to set
     */
    public void setMes_inicio(String mes_inicio) {
        this.mes_inicio = mes_inicio;
    }

    /**
     * @return the mes_fin
     */
    public String getMes_fin() {
        return mes_fin;
    }

    /**
     * @param mes_fin the mes_fin to set
     */
    public void setMes_fin(String mes_fin) {
        this.mes_fin = mes_fin;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }
}
