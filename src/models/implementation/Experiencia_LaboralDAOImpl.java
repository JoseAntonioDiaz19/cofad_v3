package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.dao.Experiencia_LaboralDAO;
import models.pojo.Experiencia_Laboral;
import models.pojo.Personas;

/**
 *
 * @author Jose Antonio Diaz
 */
public class Experiencia_LaboralDAOImpl implements Experiencia_LaboralDAO {

    private final Connection conexion;
    private ResultSet rs;
    private CallableStatement cstmt;
    private PreparedStatement stmt;
    private List<Personas> users;

    public Experiencia_LaboralDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<models.pojo.Experiencia_Laboral> GetAll() {
        return null;

    }

    @Override
    public List<Experiencia_Laboral> GetAllBy(String rfc) {
        List<Experiencia_Laboral> lista = new ArrayList<>();
        try {

            stmt = conexion.prepareStatement("SELECT * FROM experiencia_laboral WHERE rfc = ?");
            stmt.setString(1, rfc);
            ResultSet conjuntoRes = stmt.executeQuery();
            while (conjuntoRes.next()) {
                lista.add(new Experiencia_Laboral(
                        conjuntoRes.getInt("idexperiencia_laboral"),
                        conjuntoRes.getString("rfc"),
                        conjuntoRes.getString("empresa"),
                        conjuntoRes.getInt("permanencia"),
                        conjuntoRes.getString("Actividades"),
                        conjuntoRes.getString("puesto")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean Insert(Experiencia_Laboral modelo) throws SQLException {
        try {

            String consulta = "INSERT INTO experiencia_laboral(rfc, empresa, "
                    + "permanencia, actividades, puesto) "
                    + "VALUES(?,?,?,?,?)";

            cstmt = conexion.prepareCall(consulta);
            cstmt.setString(1, modelo.getRfc());
            cstmt.setString(2, modelo.getEmpresa());
            cstmt.setInt(3, modelo.getPermanencia());
            cstmt.setString(4, modelo.getActividades());
            cstmt.setString(5, modelo.getPuesto());
            cstmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Update(models.pojo.Experiencia_Laboral modelo) throws SQLException {

        try {
            String consulta = "UPDATE experiencia_laboral SET "
                    + "empresa = ?,"
                    + "permanencia = ?,"
                    + "actividades = ?,"
                    + "puesto = ? WHERE idexperiencia_laboral = ?";

            cstmt = conexion.prepareCall(consulta);
            cstmt.setString(1, modelo.getEmpresa());
            cstmt.setInt(2, modelo.getPermanencia());
            cstmt.setString(3, modelo.getActividades());
            cstmt.setString(4, modelo.getPuesto());
            cstmt.setInt(5, modelo.getIdexperiencia_laboral());
            cstmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Delete(models.pojo.Experiencia_Laboral modelo) {
        Statement statement;
        try {

            stmt = conexion.prepareStatement("DELETE FROM experiencia_laboral WHERE idexperiencia_laboral = ?");
            stmt.setInt(1, modelo.getIdexperiencia_laboral());
            ResultSet executeQuery = stmt.executeQuery();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Experiencia_Laboral datosExperienciaLaboral(int idexperiencia_laboral) {
        Experiencia_Laboral datosExperiencia = new Experiencia_Laboral();
        try {

            stmt = conexion.prepareStatement("SELECT * FROM experiencia_laboral WHERE idexperiencia_laboral = ?");
            stmt.setInt(1, idexperiencia_laboral);
            ResultSet conjuntoRes = stmt.executeQuery();

            while (conjuntoRes.next()) {
                datosExperiencia.setIdexperiencia_laboral(conjuntoRes.getInt("idexperiencia_laboral"));
                datosExperiencia.setRfc(conjuntoRes.getString("rfc"));
                datosExperiencia.setEmpresa(conjuntoRes.getString("empresa"));
                datosExperiencia.setPermanencia(conjuntoRes.getInt("permanencia"));
                datosExperiencia.setActividades(conjuntoRes.getString("actividades"));
                datosExperiencia.setPuesto(conjuntoRes.getString("puesto"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return datosExperiencia;
    }
    
}
