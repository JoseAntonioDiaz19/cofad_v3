package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import models.dao.PuestoPersonaDAO;
import models.pojo.PuestoPersona;

public class PuestoPersonaDaoImpl implements PuestoPersonaDAO{
    
    private final Connection conexion;
    PreparedStatement stmt;
    
    public PuestoPersonaDaoImpl(Connection connection)
    {
        conexion = connection;
    }

    @Override
    public List<PuestoPersona> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PuestoPersona> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(PuestoPersona modelo) throws SQLException {
        try {
            stmt = conexion.prepareStatement("INSERT INTO puesto_persona VALUES(?, ?, ?, ?)");
            
            stmt.setString(1, modelo.getRfc_persona());
            stmt.setInt(2, modelo.getIdPuesto());
            stmt.setInt(3, modelo.getIdCargo());
            stmt.setInt(4, modelo.getIdJornadaLaboral());
            
            stmt.execute();
            return true;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Update(PuestoPersona modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(PuestoPersona modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
