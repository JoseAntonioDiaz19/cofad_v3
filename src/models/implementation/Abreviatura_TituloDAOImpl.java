package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.Abreviatura_TituloDAO;
import models.pojo.Abreviatura_Titulo;
/**
 *
 * @author Jose Antonio Diaz
 */
public class Abreviatura_TituloDAOImpl implements Abreviatura_TituloDAO{
    
    Connection conexion;
    PreparedStatement stmt;
    ResultSet res;

    public Abreviatura_TituloDAOImpl(Connection connection) {
        conexion = connection;
    }

    @Override
    public List<Abreviatura_Titulo> GetAll() {
         List<Abreviatura_Titulo>lista = new ArrayList<>();
        try {
            stmt = conexion.prepareStatement("SELECT * FROM Abreviatura_Titulo");
            res = stmt.executeQuery();
            while(res.next())
            {
                lista.add(new Abreviatura_Titulo(
                        res.getString("idabreviatura_titulo"),
                        res.getString("titulo")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Abreviatura_Titulo> GetAllBy(String patron) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Insert(Abreviatura_Titulo modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(Abreviatura_Titulo modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Abreviatura_Titulo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
