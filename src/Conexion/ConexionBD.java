
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    
    
    Connection conectar = null;
    
    public Connection con() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/horarios","root","");
            System.out.println("conecto");
        }catch( ClassNotFoundException |SQLException ex){
            System.out.println(ex);
        }
        return conectar;
    
    
    }
}
