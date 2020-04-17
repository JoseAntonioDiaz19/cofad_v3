package models.dao;

import models.pojo.Personas;
import models.pojo.PuestoPersona;

public interface PersonasDAO extends CRUD<Personas>{
    
    Personas obtenerDatosUsuario(String usuario);
    boolean registrarPersonaInternas(Personas modelo, PuestoPersona puesto);
    
}
