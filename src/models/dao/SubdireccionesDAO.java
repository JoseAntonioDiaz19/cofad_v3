package models.dao;

import java.util.Vector;
import models.pojo.Subdireccion;

public interface SubdireccionesDAO extends CRUD<Subdireccion>{
    
    String nombreSubdireccion(int idSubdireccion);
    Vector<Subdireccion>todasSubdirecciones();
}
