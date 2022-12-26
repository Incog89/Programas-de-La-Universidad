

package examenpart3;

import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection con = null;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Eduardo","root","");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Conexion",JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Conexion Erronea", "Conexion",JOptionPane.INFORMATION_MESSAGE);
        }
        return con;
    }
}
