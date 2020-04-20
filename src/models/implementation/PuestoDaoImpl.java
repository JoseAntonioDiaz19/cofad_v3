package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.PuestoDAO;
import models.pojo.Puesto;

/**
 *
 * @author tapac
 */
public class PuestoDaoImpl implements PuestoDAO {

    private final Connection conexion;
    private ResultSet res;
    private CallableStatement cstmt;
    private PreparedStatement stmt;

    public PuestoDaoImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Puesto> GetAll() {
        List<Puesto> lista = new ArrayList<>();
        try {

            stmt = conexion.prepareStatement("SELECT * FROM puesto");
            ResultSet conjuntoRes = stmt.executeQuery();
            while (conjuntoRes.next()) {
                lista.add(new Puesto(
                        conjuntoRes.getInt("idpuesto"),
                        conjuntoRes.getInt("idtipo_puesto"),
                        conjuntoRes.getInt("idsubdireccion"),
                        conjuntoRes.getString("puesto"),
                        conjuntoRes.getString("correo"),
                        conjuntoRes.getString("extension")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;

    }

    @Override
    public List<Puesto> GetAllBy(String patron) {
        return null;

    }

    @Override
    public boolean Insert(Puesto modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(Puesto modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Puesto modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
