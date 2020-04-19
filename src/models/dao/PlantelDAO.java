package models.dao;
import java.util.Vector;
import models.pojo.Plantel;

public interface PlantelDAO extends CRUD<Plantel>{
    
    Vector<Plantel>todosLosPlanteles();
    String obtenerNombrePlantel(String clave_plantel);
}
