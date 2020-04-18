package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import models.dao.PlantelDAO;
import models.pojo.Plantel;

public class PlantelDaoImpl implements PlantelDAO {

    Connection conexion;
    PreparedStatement stmt;
    ResultSet res;

    public PlantelDaoImpl(Connection connection) {
        conexion = connection;
    }

    @Override
    public List<Plantel> GetAll() {
        List<Plantel> lista = new ArrayList<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM plantel");
            res = stmt.executeQuery();
            while (res.next()) {
                lista.add(new Plantel(
                        res.getString("clave_plantel"),
                        res.getString("plantel"),
                        res.getString("telefono")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Plantel> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Plantel modelo) throws SQLException {
        try {
            stmt = conexion.prepareStatement("INSERT INTO plantel VALUES(?, ?, ?)");
            stmt.setString(1, modelo.getClave_plantel());
            stmt.setString(2, modelo.getPlantel());
            stmt.setString(3, modelo.getTelefono());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Update(Plantel modelo) throws SQLException {
        try {
            stmt = conexion.prepareStatement("UPDATE plantel SET plantel = ?, telefono = ? WHERE clave_plantel = ?");
            stmt.setString(1, modelo.getPlantel());
            stmt.setString(2, modelo.getTelefono());
            stmt.setString(3, modelo.getClave_plantel());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Delete(Plantel modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector<Plantel> todosLosPlanteles() {
        Vector<Plantel> lista = new Vector<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM plantel");
            res = stmt.executeQuery();
            lista.add(new Plantel("", "-Escoja una opcion-", ""));
            while (res.next()) {
                lista.add(new Plantel(
                        res.getString("clave_plantel"),
                        res.getString("plantel"),
                        res.getString("telefono")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public String obtenerNombrePlantel(String clave_plantel) {
        String plantel = null;
        try {
            stmt = conexion.prepareStatement("SELECT plantel FROM plantel WHERE clave_plantel = ?");

            stmt.setString(1, clave_plantel);

            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                plantel = resultado.getString("plantel");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return plantel;
    }
}
