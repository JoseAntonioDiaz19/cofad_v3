package models.pojo;
/**
 * @author Jose Antonio Diaz
 */
public class Formacion_Academica {
    private int idformacion_academica;
    private String formacion_academica;

    public Formacion_Academica(int idformacion_academica, String formacion_academica) {
        this.idformacion_academica = idformacion_academica;
        this.formacion_academica = formacion_academica;
    }

    public Formacion_Academica() {
    }

    /**
     * @return the idformacion_academica
     */
    public int getIdformacion_academica() {
        return idformacion_academica;
    }

    /**
     * @param idformacion_academica the idformacion_academica to set
     */
    public void setIdformacion_academica(int idformacion_academica) {
        this.idformacion_academica = idformacion_academica;
    }

    /**
     * @return the formacion_academica
     */
    public String getFormacion_academica() {
        return formacion_academica;
    }

    /**
     * @param formacion_academica the formacion_academica to set
     */
    public void setFormacion_academica(String formacion_academica) {
        this.formacion_academica = formacion_academica;
    }
}
