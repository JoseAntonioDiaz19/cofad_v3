package models.dao;

import java.util.Vector;
import models.pojo.Puestos;

public interface PuestosDAO extends CRUD<Puestos>{
    Vector<Puestos>todosLosPuestos();
}
