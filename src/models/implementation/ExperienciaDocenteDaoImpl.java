package models.implementation;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.ExperienciaDocenteDAO;
import models.pojo.ExperienciaDocente;
/**
 *
 * @author Jose Antonio Diaz
 */
public class ExperienciaDocenteDaoImpl implements ExperienciaDocenteDAO {

    private final Connection conexion;
    private ResultSet rs;
    private CallableStatement cstmt;
    private PreparedStatement stmt;

    public ExperienciaDocenteDaoImpl(Connection conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public List<ExperienciaDocente> GetAll() {
        return null;
        
    }

    @Override
    public List<ExperienciaDocente> GetAllBy(String rfc) {
         List<ExperienciaDocente> lista = new ArrayList<>();
        try {

            stmt = conexion.prepareStatement("SELECT * FROM experiencia_docente WHERE rfc = ?");
            stmt.setString(1, rfc);
            ResultSet conjuntoRes = stmt.executeQuery();
            while (conjuntoRes.next()) {
                lista.add(new ExperienciaDocente(
                        conjuntoRes.getInt("idexperiencia_docente"),
                        conjuntoRes.getString("rfc"),
                        conjuntoRes.getString("materia"),
                        conjuntoRes.getString("periodo")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
       
    }

    @Override
    public boolean Insert(ExperienciaDocente modelo) throws SQLException {
         try {
            String consulta = "INSERT INTO experiencia_docente (rfc, materia, "
                    + "periodo) "
                    + "VALUES(?,?,?)";

            cstmt = conexion.prepareCall(consulta);
            cstmt.setString(1, modelo.getRfc());
            cstmt.setString(2, modelo.getMateria());
            cstmt.setString(3, modelo.getPeriodo());
            cstmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        
    }

    @Override
    public boolean Update(ExperienciaDocente modelo) throws SQLException {
         try {
            String consulta = "UPDATE experiencia_docente SET rfc = ?, materia = ?, "
                    + "periodo = ? WHERE idexperiencia_docente = ?";
            
            cstmt = conexion.prepareCall(consulta);

            cstmt.setString(1, modelo.getRfc());
            cstmt.setString(2, modelo.getMateria());
            cstmt.setString(3, modelo.getPeriodo());
            cstmt.setInt(4, modelo.getIdexperiencia_docente());
            cstmt.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } 
        
    }

    @Override
    public boolean Delete(ExperienciaDocente modelo) {
       try {
            stmt = conexion.prepareStatement("DELETE FROM experiencia_docente WHERE idexperiencia_docente = ?");
            stmt.setInt(1, modelo.getIdexperiencia_docente());
            ResultSet executeQuery = stmt.executeQuery();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }
        
}

