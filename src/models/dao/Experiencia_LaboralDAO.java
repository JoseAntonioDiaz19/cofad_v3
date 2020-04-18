package models.dao;
import models.pojo.Experiencia_Laboral;

/**
 *
 * @author Jose Antonio Diaz
 */
public interface Experiencia_LaboralDAO  extends CRUD<Experiencia_Laboral>{
     
    Experiencia_Laboral datosExperienciaLaboral(int idexperiencia_laboral);
}
