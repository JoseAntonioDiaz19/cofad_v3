package models.pojo;

public class TipoPuesto {
    
    private int idtipo_tipo;
    private String tipo;

    public TipoPuesto(){}
    
    public TipoPuesto(int idtipo_tipo, String tipo) {
        this.idtipo_tipo = idtipo_tipo;
        this.tipo = tipo;
    }

    public int getIdtipo_tipo() {
        return idtipo_tipo;
    }

    public void setIdtipo_tipo(int idtipo_tipo) {
        this.idtipo_tipo = idtipo_tipo;
    }

    public String getPuesto() {
        return tipo;
    }

    public void setPuesto(String tipo) {
        this.tipo = tipo;
    }   
}