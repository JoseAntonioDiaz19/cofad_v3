package models.dao;

import models.pojo.Personas;

public interface PersonasDAO extends CRUD<Personas>{
    
    Personas obtenerDatosUsuario(String usuario);
    
}
