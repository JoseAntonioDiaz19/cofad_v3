package models.dao;

import models.pojo.Personas;
import models.pojo.PuestoPersona;

public interface PersonasDAO extends CRUD<Personas>{
    
    Personas obtenerDatosUsuario(String usuario);
    boolean registrarPersonaInternas(Personas modelo, PuestoPersona puesto);
    String obtenerNombrePlantel(String clave_plantel);
    String obtenerNombreCargo(String rfc);
    String obtenerNombrePuesto(String rfc);
    boolean modificarMisDatosPersonales(Personas modelo, String rfcActual);
    
}
