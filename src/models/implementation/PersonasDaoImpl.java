package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import models.dao.PersonasDAO;
import models.pojo.Personas;

public class PersonasDaoImpl implements PersonasDAO{
    
    private final Connection conexion;
    private ResultSet rs;
    private CallableStatement cstmt;
    private PreparedStatement stmt;
    private List<Personas> users;

    public PersonasDaoImpl(Connection connection)
    {
        this.conexion = connection;
    }
    
    @Override
    public Personas obtenerDatosUsuario(String usuario) {
        Personas personaLogueada = null;
        try {
            stmt = conexion.prepareStatement("SELECT * FROM persona WHERE rfc = ?");
            stmt.setString(1, usuario);
            rs = stmt.executeQuery();
            while (rs.next()) {
                personaLogueada = new Personas(
                        rs.getString("rfc"),
                        rs.getString("clave_plantel"),
                        rs.getInt("idstatus_persona"),
                        rs.getString("idabreviatura_titulo"),
                        rs.getString("curp"),
                        rs.getString("nombre"),
                        rs.getString("ape_paterno"),
                        rs.getString("ape_materno"),
                        rs.getString("sexo"),
                        rs.getString("fecha_nacimiento"),
                        rs.getString("correo"),
                        rs.getString("telefono"),
                        rs.getString("clave_presupuestal"),
                        rs.getString("num_tarjeta"),
                        rs.getBoolean("es_externo")
                );
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return personaLogueada;
    }

    @Override
    public List<Personas> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Personas modelo) throws SQLException {
        try {
            cstmt = conexion.prepareCall("SELECT registrar_persona(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            cstmt.setString(1, modelo.getRfc());
            cstmt.setString(2, modelo.getClave_plantel());
            cstmt.setString(3, modelo.getCurp());
            cstmt.setString(4, modelo.getNombre());
            cstmt.setString(5, modelo.getApe_paterno());
            cstmt.setString(6, modelo.getApe_materno());
            cstmt.setString(7, modelo.getFecha_nac());
            cstmt.setString(8, modelo.getSexo());
            cstmt.setString(9, modelo.getCorreo());
            cstmt.setString(10, modelo.getTelefono());
            cstmt.setBoolean(11, modelo.isEs_externo());
            
            cstmt.execute();
            return true;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean Update(Personas modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Personas modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personas> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
