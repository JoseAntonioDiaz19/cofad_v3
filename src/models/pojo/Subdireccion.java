package models.pojo;

public class Subdireccion {
    
    private int idsubdireccion;
    private String subdireccion;
    
    public Subdireccion(){}

    public Subdireccion(int idsubdireccion, String subdireccion) {
        this.idsubdireccion = idsubdireccion;
        this.subdireccion = subdireccion;
    }

    public int getIdsubdireccion() {
        return idsubdireccion;
    }

    public void setIdsubdireccion(int idsubdireccion) {
        this.idsubdireccion = idsubdireccion;
    }

    public String getSubdireccion() {
        return subdireccion;
    }

    public void setSubdireccion(String subdireccion) {
        this.subdireccion = subdireccion;
    }
    
    @Override
    public String toString()
    {
        return "" + this.getSubdireccion();
    }
}