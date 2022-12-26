package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasProducto extends Conexion{
    
    public boolean registrar(ProductoMaster pro){
    PreparedStatement ps =null;
        Connection con = (Connection)getConecction();
    
        String sql = "INSERT INTO produicto (codigo , nombre, precio,cantidad) Values (?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2,pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getCantidad());
            ps.execute();
            
            return true;
            
            
        } catch (SQLException e) {
            
            System.err.println(e);
            return false;
            
        }
        finally{
            try{
                con.close();
                System.out.println("Cerrar coneccion registra");
            }
            catch(SQLException e){
                System.err.println(e);
            }      
        }
    
    }
    
    
    
    
    
    
    
    
    
  }