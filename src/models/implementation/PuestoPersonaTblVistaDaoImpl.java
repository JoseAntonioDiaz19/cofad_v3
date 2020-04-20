package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import models.dao.PuestoPersonaTblVistaDAO;
import models.pojo.PuestoPersonaTblVista;

/**
 *
 * @author Jose Antonio Diaz
 */
public class PuestoPersonaTblVistaDaoImpl implements PuestoPersonaTblVistaDAO{
   
    private final Connection conexion;
    private ResultSet res;
    private CallableStatement cstmt;
    private PreparedStatement stmt;

    public PuestoPersonaTblVistaDaoImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<PuestoPersonaTblVista> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PuestoPersonaTblVista> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(PuestoPersonaTblVista modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(PuestoPersonaTblVista modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(PuestoPersonaTblVista modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
