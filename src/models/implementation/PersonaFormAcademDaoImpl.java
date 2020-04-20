package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.PersonaFormAcademDAO;
import models.pojo.PersonaFormacionAcademica;

/**
 *
 * @author Jose Antonio Diaz
 */
public class PersonaFormAcademDaoImpl implements PersonaFormAcademDAO {

    private final Connection conexion;
    private ResultSet rs;
    private CallableStatement cstmt;
    private PreparedStatement stmt;

    public PersonaFormAcademDaoImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<PersonaFormacionAcademica> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PersonaFormacionAcademica> GetAllBy(String rfc) {
        List<PersonaFormacionAcademica> lista = new ArrayList<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM tabla_formacion_academica WHERE rfc = ?");
            stmt.setString(1, rfc);
            ResultSet conjuntoRes = stmt.executeQuery();
            while (conjuntoRes.next()) {
                lista.add(new PersonaFormacionAcademica(
                        conjuntoRes.getInt("idpersona_formacionacademica"),
                        conjuntoRes.getString("rfc"),
                        conjuntoRes.getInt("idformacion_academica"),
                        conjuntoRes.getString("formacion_academica"),
                        conjuntoRes.getString("institucion"),
                        conjuntoRes.getString("titulacion"),
                        conjuntoRes.getString("cedula_profesional")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean Insert(PersonaFormacionAcademica modelo) throws SQLException {
        try {
            String consulta = "INSERT INTO persona_formacionacademica (rfc, "
                    + "idformacion_academica, institucion, "
                    + "titulacion, cedula_profesional) "
                    + "VALUES(?,?,?,?,?)";

            cstmt = conexion.prepareCall(consulta);
            cstmt.setString(1, modelo.getRfc());
            cstmt.setInt(2, modelo.getIdformacion_academica());
            cstmt.setString(3, modelo.getInstitucion());
            cstmt.setString(4, modelo.getTitulacion());
            cstmt.setString(5, modelo.getCedula_profesional());
            cstmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Update(PersonaFormacionAcademica modelo) throws SQLException {
        try {
            String consulta = "UPDATE persona_formacionacademica "
                    + "SET idformacion_academica = ?, "
                    + "institucion = ?, titulacion = ?, cedula_profesional = ? "
                    + "WHERE idpersona_formacionacademica = ?";

            cstmt = conexion.prepareCall(consulta);

            cstmt.setInt(1, modelo.getIdformacion_academica());
            cstmt.setString(2, modelo.getInstitucion());
            cstmt.setString(3, modelo.getTitulacion());
            cstmt.setString(4, modelo.getCedula_profesional());
            cstmt.setInt(5, modelo.getIdpersona_formacionacademica());
            cstmt.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Delete(PersonaFormacionAcademica modelo) {
        try {
            stmt = conexion.prepareStatement("DELETE FROM persona_formacionacademica WHERE idpersona_formacionacademica = ?");
            stmt.setInt(1, modelo.getIdpersona_formacionacademica());
            ResultSet executeQuery = stmt.executeQuery();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

}
