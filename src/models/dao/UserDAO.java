package models.dao;

import models.pojo.Usuarios;

public interface UserDAO extends CRUD<Usuarios> {
    
    boolean buscarUsuario(String user, String pass);
    boolean cambiarContraseña(String nuevaContraseña, int idRol, String rfc);
    int obtenerIdrolUsuario(String usuario, String contraseñaActual);
}
