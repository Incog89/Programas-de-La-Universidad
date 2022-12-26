package examenpart2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    public static void main(String[] args) {
        final int PUERTO_SERVIDOR = 2206;
        byte[] buffer = new byte[1024];
        try {
            InetAddress direccionServidor = InetAddress.getByName("localhost");
            DatagramSocket socketUDP = new DatagramSocket();
            String mensaje = "Hola, Me llamo Eduardo";
            buffer = mensaje.getBytes();
            DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length, direccionServidor, PUERTO_SERVIDOR);
            socketUDP.send(pregunta);
            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
            socketUDP.receive(peticion);
            mensaje = new String(peticion.getData());
            System.out.println(mensaje);
            socketUDP.close();

        } catch (SocketException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
