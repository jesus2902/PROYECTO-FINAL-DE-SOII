
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jl403
 */
public class Conexion {
    public static Connection getConexion(){
        String url = "jdbc:sqlserver://localhost:1999;"
                + "database= Proyecto_JavaSql;"
                + "user=jesus20;"
                + "password=1234;";
        
        try{
           Connection con = DriverManager.getConnection(url);
           return con;
        } catch(SQLException e){
            System.out.println(e.toString());
            return null; 
        }
    }
}
