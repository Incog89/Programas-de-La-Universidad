/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Productos implements ActionListener{
    
    private ProductoMaster mod;
    private ConsultasProducto mode;
    private Vista frm;

    public Productos(ProductoMaster mod, ConsultasProducto mode, Vista frm) {
        this.mod = mod;
        this.mode = mode;
        this.frm = frm;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
