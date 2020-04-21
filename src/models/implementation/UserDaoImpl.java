package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import models.dao.UserDAO;
import models.pojo.Usuarios;

public class UserDaoImpl implements UserDAO {

    private final Connection conexion;
    private ResultSet rs;
    private PreparedStatement stmt;
    private List<Usuarios> users;

    public UserDaoImpl(Connection connection) {
        this.conexion = connection;
    }

    @Override
    public boolean buscarUsuario(String user, String pass) {
        try {
            stmt = conexion.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND password = ?");
            stmt.setString(1, user);
            stmt.setString(2, pass);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean cambiarContraseña(String nuevaContraseña, int idRol, String rfc) {
        try {
            stmt = conexion.prepareStatement("UPDATE usuario SET password = ? WHERE idrol = ? AND rfc = ?");
            stmt.setString(1, nuevaContraseña);
            stmt.setInt(2, idRol);
            stmt.setString(3, rfc);
            stmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public List<Usuarios> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Usuarios modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(Usuarios modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Usuarios modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuarios> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerIdrolUsuario(String usuario, String contraseñaActual) {
        int idrol = 0;
        try {

            stmt = conexion.prepareStatement("SELECT idrol FROM usuario WHERE usuario = ? and password = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, contraseñaActual);
            rs = stmt.executeQuery();

            while (rs.next()) {
                idrol = rs.getInt("idrol");
            }
        } catch (SQLException e) {

            return idrol;
        }
        return idrol;

    }
}
