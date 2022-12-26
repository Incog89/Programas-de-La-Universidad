/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.*;

public class Servidor {

    public static void main(String[] args) {
        final int puerto = 2206;
        ServerSocket socket;
        Socket SocketCliente;

        try {
            socket = new ServerSocket(puerto);
            while ((SocketCliente = socket.accept()) != null) {
                System.out.println("Se conecta el cliente desde: " + SocketCliente.getInetAddress());

                ObjectOutputStream salir = new ObjectOutputStream(SocketCliente.getOutputStream());

                salir.writeObject(new Date());
                salir.close();
            }
        } catch (IOException e) {
            System.err.println("Error ni modo no puedo establecer conexion con el servidor ->" + e.getMessage());
        }
    }
}
