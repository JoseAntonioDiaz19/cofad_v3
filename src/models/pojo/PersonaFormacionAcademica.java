package models.pojo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class PersonaFormacionAcademica {
    private int idpersona_formacionacademica;
    private String rfc;
    private int idformacion_academica;
    private String formacion_academica;
    private String institucion;
    private String titulacion;
    private String cedula_profesional;

    public PersonaFormacionAcademica(int idpersona_formacionacademica, String rfc, int idformacion_academica, String formacion_academica, String institucion, String titulacion, String cedula_profesional) {
        this.idpersona_formacionacademica = idpersona_formacionacademica;
        this.rfc = rfc;
        this.idformacion_academica = idformacion_academica;
        this.formacion_academica = formacion_academica;
        this.institucion = institucion;
        this.titulacion = titulacion;
        this.cedula_profesional = cedula_profesional;
    }

    public PersonaFormacionAcademica() {
    }
    

    /**
     * @return the idpersona_formacionacademica
     */
    public int getIdpersona_formacionacademica() {
        return idpersona_formacionacademica;
    }

    /**
     * @param idpersona_formacionacademica the idpersona_formacionacademica to set
     */
    public void setIdpersona_formacionacademica(int idpersona_formacionacademica) {
        this.idpersona_formacionacademica = idpersona_formacionacademica;
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
        this.formacion_academica = formacion_academica.toUpperCase();
    }

    /**
     * @return the institucion
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * @param institucion the institucion to set
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion.toUpperCase();
    }

    /**
     * @return the titulacion
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * @param titulacion the titulacion to set
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion.toUpperCase();
    }

    /**
     * @return the cedula_profesional
     */
    public String getCedula_profesional() {
        return cedula_profesional;
    }

    /**
     * @param cedula_profesional the cedula_profesional to set
     */
    public void setCedula_profesional(String cedula_profesional) {
        this.cedula_profesional = cedula_profesional.toUpperCase();
    }

    
    
}
