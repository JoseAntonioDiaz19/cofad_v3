package models.dao;

import models.pojo.TipoPuesto;

public interface TipoPuestoDAO extends CRUD<TipoPuesto>{
    
    String nombrePuesto(int idtipoPuesto);
    int idTipoPuesto(String tipoPuesto);
}
