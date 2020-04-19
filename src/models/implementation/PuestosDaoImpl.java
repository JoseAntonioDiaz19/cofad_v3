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
        try 
        {
            stmt = conexion.prepareStatement("INSERT INTO puesto(idtipo_puesto, "
                    + "idsubdireccion, puesto, correo, extension) VALUES(?, ?, ?, ?, ?)");
            stmt.setInt(1, modelo.getIdtipo_puesto());
            stmt.setInt(2, modelo.getIdsubdireccion());
            stmt.setString(3, modelo.getPuesto());
            stmt.setString(4, modelo.getCorreo());
            stmt.setString(5, modelo.getExtension());
            stmt.execute();
            return true;
        } 
        catch (SQLException e) 
        {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Update(Puestos modelo) throws SQLException {
        try {
            stmt = conexion.prepareStatement("UPDATE puesto SET idsubdireccion = ?, puesto = ?,"
                    + "correo = ?, extension = ?, idtipo_puesto = ? WHERE idpuesto = ?");
            stmt.setInt(1, modelo.getIdsubdireccion());
            stmt.setString(2, modelo.getPuesto());
            stmt.setString(3, modelo.getCorreo());
            stmt.setString(4, modelo.getExtension());
            stmt.setInt(5, modelo.getIdtipo_puesto());
            stmt.setInt(6, modelo.getIdpuesto());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
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
