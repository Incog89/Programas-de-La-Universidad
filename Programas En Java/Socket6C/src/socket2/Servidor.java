/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket2;

import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        try {
            System.out.println("LocalHost mia es = "+ Inet4Address.getLocalHost().toString());
        } catch (UnknownHostException uhe) {
            System.err.println("No puedo saber la direccion IP local:" + uhe);
        }
        System.out.println("Aqui");
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(1234);
        } catch (IOException ioe) {
            System.err.println("Error al abrir el socket de servidor: "+ ioe); System.exit(-1);
        }
        System.out.println("orales");
        int entrada;
        long salida;
        
        while(true){
            try {
                System.out.println("Entra al sis");
                
                Socket sckt = ss.accept();
                DataInputStream dls = new DataInputStream(sckt.getInputStream());
                DataOutputStream dos = new DataOutputStream(sckt.getOutputStream());
                
                int puerto = sckt.getPort();
                InetAddress direcc = sckt.getInetAddress();
                
                entrada = dls.readInt();
                
                salida = (long) entrada * (long) entrada;
                
                dos.writeLong(salida);
                
                dls.close();
                dos.close();
                
                System.out.println("Cliente = "+ direcc+":"+ puerto +"\tEntrada = "+ entrada+ "\tsalida ="+ salida);
                                
            } catch (Exception e) {
                System.err.println("Se ha producido la excepcion: " +e);
            }
        }
    }
}
