

package Modelo;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private final String base = "poopUpe";
    private final String user = "root";
    private final String password = " ";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    
    private Connection con = null;
    
    public Connection getConecction(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(this.url,this.user,this.password);
            System.out.println("Se establecio satisfactoriamente la conexion");
        } catch (SQLException e) {
            System.err.println("e");
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        return con;
    }
}
