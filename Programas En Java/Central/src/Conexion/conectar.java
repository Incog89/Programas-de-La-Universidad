package Conexion;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Sony
 */

public class conectar {
Connection conect = null;
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQL
           Class.forName("org.gjt.mm.mysql.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/ca","root","SuperUSAD20");
           System.out.println("Conexion Exitosa");
           //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     }
}
