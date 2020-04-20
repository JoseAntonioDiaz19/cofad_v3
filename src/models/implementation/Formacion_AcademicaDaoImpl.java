package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.Formacion_AcademicaDAO;
import models.pojo.Formacion_Academica;
/**
 * @author Jose Antonio diaz
 */
public class Formacion_AcademicaDaoImpl implements Formacion_AcademicaDAO {
    
    private final Connection conexion;
    private ResultSet rs;
    private CallableStatement cstmt;
    private PreparedStatement stmt;

    public Formacion_AcademicaDaoImpl(Connection conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public List<Formacion_Academica> GetAll() {
        List<Formacion_Academica> lista = new ArrayList<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM formacion_academica");
            ResultSet conjuntoRes = stmt.executeQuery();
            while (conjuntoRes.next()) {
                lista.add(new Formacion_Academica(
                        conjuntoRes.getInt("idformacion_academica"),
                        conjuntoRes.getString("formacion_academica")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Formacion_Academica> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Formacion_Academica modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(Formacion_Academica modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Formacion_Academica modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
