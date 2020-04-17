package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import models.dao.PuestosDAO;
import models.pojo.Puestos;

public class PuestosDaoImpl implements PuestosDAO{
    
    Connection conexion;
    PreparedStatement stmt;
    ResultSet res;
    
    public PuestosDaoImpl(Connection connection)
    {
        conexion = connection;
    }

    @Override
    public List<Puestos> GetAll() {
        List<Puestos>lista = new ArrayList<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM puesto");
            res = stmt.executeQuery();
            while(res.next())
            {
                lista.add(new Puestos(
                        res.getInt("idpuesto"),
                        res.getInt("idtipo_puesto"),
                        res.getInt("idsubdireccion"),
                        res.getString("puesto"),
                        res.getString("correo"),
                        res.getString("extension")
                ));
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Puestos> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Puestos modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(Puestos modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Puestos modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<Puestos> todosLosPuestos() {
        Vector<Puestos>lista = new Vector<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM puesto");
            res = stmt.executeQuery();
            lista.add(new Puestos(0, 0, 0, "-Escoja una opcion-", "", ""));
            while(res.next())
                lista.add(new Puestos(
                        res.getInt("idpuesto"),
                        res.getInt("idtipo_puesto"),
                        res.getInt("idsubdireccion"),
                        res.getString("puesto"),
                        res.getString("correo"),
                        res.getString("extension")
                ));
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }
    
}
