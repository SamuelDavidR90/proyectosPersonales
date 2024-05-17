
package javaconexionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConexionMySQL {


    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/base_de_datos_blob";
        String user = "root";
        String password = "";
        
        try {
            //Registrar driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Establecer conexion 
            
            Connection conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa a la base de  datos");
            
            //Cerrar conexion
            conexion.close();
        } catch(ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de MySQL");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("Error al conectar con la base de datos");
            e.printStackTrace();
        }
    }
    
}
