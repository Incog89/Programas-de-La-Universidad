/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpart2;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

    public static void main(String[] args) {

        final int PUERTO = 2206;
        byte[] buffer = new byte[1024];

        try {
            System.out.println("Iniciamos Servidor");
            DatagramSocket socketUDP = new DatagramSocket(PUERTO);
            while (true) {
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
                socketUDP.receive(peticion);
                System.out.println("Recibimos al cliente");
                String mensaje = new String(peticion.getData());
                System.out.println(mensaje);
                int puertoCliente = peticion.getPort();
                InetAddress direccion = peticion.getAddress();
                mensaje = "Aqui estamos en el Server";
                buffer = mensaje.getBytes();
                DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, direccion, puertoCliente);
                socketUDP.send(respuesta);              
            }
        } catch (SocketException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
