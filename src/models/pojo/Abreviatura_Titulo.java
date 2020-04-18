package models.pojo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class Abreviatura_Titulo {
    private String idabreviatura_titulo;
    private String titulo;

    public Abreviatura_Titulo(String idabreviatura_titulo, String titulo) {
        this.idabreviatura_titulo = idabreviatura_titulo;
        this.titulo = titulo;
    }

    public Abreviatura_Titulo() {
    }

    /**
     * @return the idabreviatura_titulo
     */
    public String getIdabreviatura_titulo() {
        return idabreviatura_titulo;
    }

    /**
     * @param idabreviatura_titulo the idabreviatura_titulo to set
     */
    public void setIdabreviatura_titulo(String idabreviatura_titulo) {
        this.idabreviatura_titulo = idabreviatura_titulo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
