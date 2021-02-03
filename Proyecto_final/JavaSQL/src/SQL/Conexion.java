
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jl403
 */
public class Conexion {

    public static Connection getConexcion() {
        String conexionUrl = "jdbc:sqlserver://localhost:1999;"
                + "database=master;"
                + "user=jesus20;" 
                + "password=1234;"
                + "loginTimeout=30;";
                        
                
                 

        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

}
