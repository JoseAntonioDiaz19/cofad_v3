package models.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.pojo.PersonasTblVista;
import models.dao.PersonasTblaVistaDAO;

public class PersonasTblVistaDaoImpl implements PersonasTblaVistaDAO{
    
    Connection conexion;
    PreparedStatement stmt;
    ResultSet res;
    
    public PersonasTblVistaDaoImpl(Connection connection){
        conexion = connection;
    }

    @Override
    public List<PersonasTblVista> GetAll() {
        List<PersonasTblVista> lista = new ArrayList<>();
        try 
        {
            stmt = conexion.prepareStatement("SELECT * FROM tabla_interfaz_inicio");
            res = stmt.executeQuery();
            while(res.next())
            {
                lista.add(new PersonasTblVista(
                        res.getString("cargo"),
                        res.getString("puesto"),
                        res.getString("status"),
                        res.getString("rfc"),
                        res.getString("curp"),
                        res.getString("nombre"),
                        res.getString("ape_paterno"),
                        res.getString("ape_materno")
                ));
            }
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public List<PersonasTblVista> GetAllBy(String patron) {
        List<PersonasTblVista> lista = new ArrayList<>();
        try 
        {
            stmt = conexion.prepareStatement("SELECT * FROM buscarnombre_tablaprincipal('" 
                    + patron + "')");
            res = stmt.executeQuery();
            while(res.next())
            {
                lista.add(new PersonasTblVista(
                        res.getString("cargo"),
                        res.getString("puesto"),
                        res.getString("status"),
                        res.getString("rfc"),
                        res.getString("curp"),
                        res.getString("nombre"),
                        res.getString("ape_paterno"),
                        res.getString("ape_materno")
                ));
            }
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean Insert(PersonasTblVista modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(PersonasTblVista modelo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(PersonasTblVista modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}