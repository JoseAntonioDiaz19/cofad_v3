package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.CargosDAO;
import models.pojo.Cargos;

public class CargosDaoImpl implements CargosDAO{
    
    Connection conexion;
    PreparedStatement stmt;
    ResultSet res;
    
    public CargosDaoImpl(Connection connection)
    {
        conexion = connection;
    }

    @Override
    public List<Cargos> GetAll() {
        List<Cargos>lista = new ArrayList<>();
        try 
        {
            stmt = conexion.prepareStatement("SELECT * FROM cargo");
            res = stmt.executeQuery();
            while(res.next())
            {
                lista.add(new Cargos(
                        res.getInt("idcargo"),
                        res.getString("cargo")
                ));
            }
        }
        catch (SQLException e) {
        }
        return lista;
    }

    @Override
    public List<Cargos> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Cargos modelo) throws SQLException {
        try 
        {
            stmt = conexion.prepareStatement("INSERT INTO cargo(cargo) VALUES (?)");
            stmt.setString(1, modelo.getCargo());
            stmt.execute();
            return true;
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Update(Cargos modelo) throws SQLException {
        try 
        {
            stmt = conexion.prepareStatement("UPDATE cargo SET cargo = ? WHERE idcargo = ?");
            stmt.setString(1, modelo.getCargo());
            stmt.setInt(2, modelo.getIdCargo());
            stmt.execute();
            return true;
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Delete(Cargos modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}