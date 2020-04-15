package models.dao;

import java.util.List;
import java.sql.SQLException;

public interface CRUD<T> {
    
    List<T> GetAll();
    List<T> GetAllBy(String patron);
    boolean Insert(T modelo) throws SQLException;
    boolean Update(T modelo) throws SQLException;
    boolean Delete(T modelo);
}