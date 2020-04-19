package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.SubdireccionesDAO;
import models.pojo.Subdireccion;

public class SubdireccionDaoImpl implements SubdireccionesDAO{
    
    Connection conexion;
    PreparedStatement stmt;
    ResultSet res;
    
    public SubdireccionDaoImpl(Connection connection)
    {
        conexion = connection;
    }

    @Override
    public List<Subdireccion> GetAll() {
        List<Subdireccion>lista = new ArrayList<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM subdireccion");
            res = stmt.executeQuery();
            while(res.next())
            {
                lista.add(new Subdireccion(
                        res.getInt("idsubdireccion"),
                        res.getString("subdireccion")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Subdireccion> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Subdireccion modelo) throws SQLException {
        try {
            stmt = conexion.prepareStatement("INSERT INTO subdireccion(subdireccion) VALUES (?)");
            stmt.setString(1, modelo.getSubdireccion());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Update(Subdireccion modelo) throws SQLException {
        try {
            stmt = conexion.prepareStatement("UPDATE subdireccion SET subdireccion = ? WHERE idsubdireccion = ?");
            stmt.setString(1, modelo.getSubdireccion());
            stmt.setInt(2, modelo.getIdsubdireccion());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Delete(Subdireccion modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nombreSubdireccion(int idSubdireccion) {
        String nombreSubdireccion = null;
        try {
            stmt = conexion.prepareStatement("SELECT * FROM subdireccion WHERE idsubdireccion = ?");
            stmt.setInt(1, idSubdireccion);
            res = stmt.executeQuery();
            if(res.next())
                nombreSubdireccion = res.getString("subdireccion");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return nombreSubdireccion;
    }   
}