/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.*;
import java.util.*;

public class cliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final int puerto = 2206;
        String Nombre = "Eduardo Bustos Moran";
        Socket socket = new Socket("localhost", puerto);
        ObjectInputStream entrar = new ObjectInputStream(socket.getInputStream());
        
        Date fecha = (Date)entrar.readObject();
        Nombre = (String)entrar.readObject();
        System.out.println(fecha.toString());
        System.out.println(Nombre.toString());
    }
}
