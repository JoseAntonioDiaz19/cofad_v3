package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import models.dao.TipoPuestoDAO;
import models.pojo.TipoPuesto;

public class TipoPuestoDaoImpl implements TipoPuestoDAO{
    
    Connection conexion;
    PreparedStatement stmt;
    ResultSet res;
    
    public TipoPuestoDaoImpl(Connection connection)
    {
        conexion = connection;
    }

    @Override
    public String nombrePuesto(int idtipoPuesto) {
        String nombreTipoPuesto = null;
        try {
            stmt = conexion.prepareStatement("SELECT * FROM tipo_puesto WHERE idtipo_puesto = ?");
            stmt.setInt(1, idtipoPuesto);
            res = stmt.executeQuery();
            if(res.next())
                nombreTipoPuesto = res.getString("tipo");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return nombreTipoPuesto;
    }

    @Override
    public List<TipoPuesto> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoPuesto> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(TipoPuesto modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(TipoPuesto modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(TipoPuesto modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
