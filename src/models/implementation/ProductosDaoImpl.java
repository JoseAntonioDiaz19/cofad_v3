package models.implementation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.dao.ProductosDAO;
import models.pojo.Producto;

/**
 *
 * @author Jose Antonio Diaz
 */
public class ProductosDaoImpl implements ProductosDAO {

    private final Connection conexion;
    private ResultSet res;
    private CallableStatement cstmt;
    private PreparedStatement stmt;

    public ProductosDaoImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public List<Producto> GetAll() {
        return null;
    }

    @Override
    public List<Producto> GetAllBy(String rfc) {
        List<Producto> lista = new ArrayList<>();
        try {

            stmt = conexion.prepareStatement("SELECT * FROM producto WHERE rfc = ?");
            stmt.setString(1, rfc);
            ResultSet conjuntoRes = stmt.executeQuery();
            while (conjuntoRes.next()) {
                lista.add(new Producto(
                        conjuntoRes.getInt("idproducto"),
                        conjuntoRes.getString("rfc"),
                        conjuntoRes.getString("producto_actividad"),
                        conjuntoRes.getString("descripcion"),
                        conjuntoRes.getString("fecha")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;

    }

    @Override
    public boolean Insert(Producto modelo) throws SQLException {
         try {
            String consulta = "INSERT INTO producto (rfc, producto_actividad, "
                    + "descripcion, fecha) "
                    + "VALUES(?,?,?,?)";

            cstmt = conexion.prepareCall(consulta);
            cstmt.setString(1, modelo.getRfc());
            cstmt.setString(2, modelo.getProducto_actividad());
            cstmt.setString(3, modelo.getDescripcion());
            cstmt.setString(4, modelo.getFecha());
            cstmt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean Update(Producto modelo) throws SQLException {
        try {
            String consulta = "UPDATE producto SET producto_actividad = ?, descripcion = ?, fecha = ? WHERE idproducto = ?";
            
            cstmt = conexion.prepareCall(consulta);

            cstmt.setString(1, modelo.getProducto_actividad());
            cstmt.setString(2, modelo.getDescripcion());
            cstmt.setString(3, modelo.getFecha());
            cstmt.setInt(4, modelo.getIdproducto());
            cstmt.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        } 
    }

    @Override
    public boolean Delete(Producto modelo) {
        try {
            stmt = conexion.prepareStatement("DELETE FROM producto WHERE idproducto = ?");
            stmt.setInt(1, modelo.getIdproducto());
            ResultSet executeQuery = stmt.executeQuery();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

}
