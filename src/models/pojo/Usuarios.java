package models.pojo;

public class Usuarios {
    
    private int idRol;
    private String rfc;
    private String usuario;
    private String password;
    
    public Usuarios(){}

    public Usuarios(int idRol, String rfc, String usuario, String password) {
        this.idRol = idRol;
        this.rfc = rfc;
        this.usuario = usuario;
        this.password = password;
    }
    
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString()
    {
        return "";
    }
}