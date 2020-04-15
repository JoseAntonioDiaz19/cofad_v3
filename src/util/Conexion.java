package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private final String LOCAL_URL = "jdbc:postgresql://localhost:5432/prueba_cofad";
    private final String DRIVER_CLASS = "org.postgresql.Driver";

    private final String ADMIN_USER = "postgres";
    private final String ADMIN_PASS = "root";

    private static Conexion instance;
    private static ComboPooledDataSource ds;
    private static Connection connection;

    public Conexion(){
        try {
            ds = new ComboPooledDataSource();   // creamos la fuente de datos
            ds.setDriverClass(DRIVER_CLASS);   // que driver de base datos usaremos
            ds.setJdbcUrl(LOCAL_URL);          // url de la base de datos que nos conectaremos
            ds.setUser(ADMIN_USER);            // usuario de la base de datos
            ds.setPassword(ADMIN_PASS);        // contraseña de la base de datos
            ds.setInitialPoolSize(0);          // numero conexiones con las que iniciara el pool
            ds.setMinPoolSize(0);              // minimo de conexiones que tendra el pool
            ds.setAcquireIncrement(1);         // numero de conexiones a crear en cada incremento
            ds.setMaxPoolSize(5);              // maximo numero de conexiones
            ds.setMaxStatements(180);          // maximo de consultas
            ds.setAcquireRetryAttempts(2);     // maximo numero de reintentos para conectar a la base de datos
            ds.setBreakAfterAcquireFailure(true);  // se generara una excepcion si no se puede conectar
        } catch (PropertyVetoException ex) 
        {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Este metodo nos regresa una conexion a base de datos, esta la podemos
     * usar como una conexion usual
     *
     * @return Conexion a base de datos
     */
    public static Connection getConnection() {

        if (instance == null) {
            instance = new Conexion();
            try {
                connection = ds.getConnection();
            } catch (SQLException e) {
            }
        }
        return connection;
    }
}