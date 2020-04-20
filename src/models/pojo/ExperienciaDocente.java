package models.pojo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class ExperienciaDocente {
    private int idexperiencia_docente;
    private String rfc;
    private String materia;
    private String periodo;

    public ExperienciaDocente(int idexperiencia_docente, String rfc, String materia, String periodo) {
        this.idexperiencia_docente = idexperiencia_docente;
        this.rfc = rfc;
        this.materia = materia;
        this.periodo = periodo;
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
        this.materia = materia.toUpperCase();
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo.toUpperCase();
    }
    
}
