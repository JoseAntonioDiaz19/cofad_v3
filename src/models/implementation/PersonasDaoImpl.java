package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import models.dao.PersonasDAO;
import models.dao.PuestoPersonaDAO;
import models.pojo.Personas;
import models.pojo.PuestoPersona;

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

    @Override
    public boolean registrarPersonaInternas(Personas modelo, PuestoPersona puesto) {
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
            
            PuestoPersonaDAO puestoPersonaDao = new PuestoPersonaDaoImpl(conexion);
            if(puestoPersonaDao.Insert(puesto))            
                return true;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
    
    @Override
    public String obtenerNombrePlantel(String clave_plantel) {
        String nombrePlantel = null;
        try {
           
            stmt = conexion.prepareStatement("SELECT plantel FROM plantel WHERE clave_plantel = ?");

            stmt.setString(1, clave_plantel);

            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                nombrePlantel = resultado.getString("plantel");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } 
        return nombrePlantel;
    }
    
    @Override
    public String obtenerNombreCargo(String rfc) {
        String cargo = null;
        try {
            stmt = conexion.prepareStatement("SELECT cargo From persona "
                    + "INNER JOIN puesto_persona "
                    + "ON persona.rfc = puesto_persona.rfc "
                    + "INNER JOIN cargo "
                    + "ON puesto_persona.idcargo = cargo.idcargo "
                    + "WHERE puesto_persona.rfc = ? "
                    + "AND idjornada_laboral = (SELECT Max(idjornada_laboral) "
                                    + "FROM persona INNER JOIN puesto_persona "
                                    + "ON persona.rfc = puesto_persona.rfc "
                                    + "WHERE puesto_persona.rfc = ?)");

            stmt.setString(1, rfc);
            stmt.setString(2, rfc);

            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                cargo = resultado.getString("cargo");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } 
        return cargo;
    }
    
    @Override
    public String obtenerNombrePuesto(String rfc) {
        String nombrePuesto = null;
        try {
            stmt = conexion.prepareStatement("SELECT puesto FROM persona "
                    + "INNER JOIN puesto_persona "
                    + "ON persona.rfc = puesto_persona.rfc "
                    + "INNER JOIN puesto "
                    + "ON puesto_persona.idpuesto = puesto.idpuesto "
                    + "WHERE puesto_persona.rfc = ? "
                    + "AND idjornada_laboral = ( SELECT MAX ( idjornada_laboral ) "
                                + "FROM persona INNER JOIN puesto_persona "
                                + "ON persona.rfc = puesto_persona.rfc "
                                + "WHERE puesto_persona.rfc = ?) ");

            stmt.setString(1, rfc);
            stmt.setString(2, rfc);

            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                nombrePuesto = resultado.getString("puesto");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } 
        
        return nombrePuesto;
    }
    
    @Override
    public boolean modificarMisDatosPersonales(Personas modelo, String rfcActual) {
        try {
            String consulta = "UPDATE persona SET rfc = ?, " +
                                "clave_plantel = ?, " +
                                "idabreviatura_titulo = ?, " +
                                "curp = ?, " +
                                "nombre = ?, " +
                                "ape_paterno = ?, " +
                                "ape_materno = ?, " +
                                "sexo = ?, " +
                                "fecha_nacimiento = '" +modelo.getFecha_nac()+"',"+
                                "correo = ?, " +
                                "telefono = ?, " +
                                "clave_presupuestal = ?, " +
                                "num_tarjeta = ? " +
                                "WHERE rfc = ?";
            
            cstmt = conexion.prepareCall(consulta);

            cstmt.setString(1, modelo.getRfc());
            cstmt.setString(2, modelo.getClave_plantel());
            cstmt.setString(3, modelo.getIdAbreviatura_Titulo());
            cstmt.setString(4, modelo.getCurp());
            cstmt.setString(5, modelo.getNombre());
            cstmt.setString(6, modelo.getApe_paterno());
            cstmt.setString(7, modelo.getApe_materno());
            cstmt.setString(8, modelo.getSexo());
            cstmt.setString(9, modelo.getCorreo());
            cstmt.setString(10, modelo.getTelefono());
            cstmt.setString(11, modelo.getClave_presupuestal());
            cstmt.setString(12, modelo.getNum_tarjeta());
            cstmt.setString(13, rfcActual);
            cstmt.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } 
    }
    
    public static Date ParseFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
}
