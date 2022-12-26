/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ei;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    static final String DB_URL = "jdbc:mysql://localhost:3306/TransportesEI";
    static final String USER = "root";
    static final String PASS = "";

    Connection conect = null;

    public Connection conexion() {
        try {
            //Cargamos el Driver MySQL
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
            System.err.println(e);
        }

        return conect;
    }
}
