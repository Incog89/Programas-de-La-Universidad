/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Servidor {
   private final int puerto = 2027;
   private final int noConexiones = 20;
   //Crear una lista de Sockets vamos a gaurdarlos
   private LinkedList<Socket> usuarios = new LinkedList<Socket>();
   
   
   //Funcion para que el servidor empiece a escuchar a los clientes
   public void escuchar(){
       try {
           //creamos socket
           ServerSocket servidor = new ServerSocket(puerto,noConexiones);
           while(true){
               System.out.println("Escuchando-----------");
               Socket cliente = servidor.accept();
               usuarios.add(cliente);
               //instanciamos al hilo que atendera al cliente
               Runnable run = new HiloServidor(cliente, usuarios);
               Thread hilo = new Thread(run);
               hilo.start();
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   //Funcion para correr el servidor
    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.escuchar();
    }
}
