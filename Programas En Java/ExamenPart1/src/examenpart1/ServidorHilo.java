/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpart1;


import java.io.DataInputStream;
import java.io.DataOutputStream;

/**
 *
 * @author Fernando
 */
public class ServidorHilo extends Thread{
    
    private DataInputStream in;
    private DataOutputStream out;
    private String nombreCliente;

    public ServidorHilo(DataInputStream in, DataOutputStream out, String nombreCliente) {
        this.in = in;
        this.out = out;
        this.nombreCliente = nombreCliente;
    }
    @Override
    public void run(){
        
    }
    public void AtenderCliente(String Nombre){
        System.out.println("Atendimos al cliente" + Nombre);
    }
}