package models.dao;

import models.pojo.Subdireccion;

public interface SubdireccionesDAO extends CRUD<Subdireccion>{
    
    String nombreSubdireccion(int idSubdireccion);
}
