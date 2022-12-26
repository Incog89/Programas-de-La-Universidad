/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.LinkedList;

/**
 *
 * @author joyke
 */
public class HiloServidor implements Runnable{
    
    private Socket Socket;
    private DataInputStream in;
    private DataOutputStream out;
    
    //Lista de usuarios conectados al servidor
    private LinkedList<Socket> usuarios = new LinkedList<Socket>();
    
    public HiloServidor(Socket soc, LinkedList users){
        Socket=soc;
        usuarios=users;
    }
    
    @Override
    public void run() {
        try {
            //Iniciamos los canales de comunicacion
            in = new DataInputStream(Socket.getInputStream());
            out= new DataOutputStream(Socket.getOutputStream());
            out.writeUTF("<h2> Bienvenidos </h2>");
            //dato infinito para escuchar a los clientes
            while(true){
                String recibido = in.readUTF();
                //Cuando el mensaje se envie a todoslos clientes conectados
                for (int i = 0; i < usuarios.size(); i++) {
                    out = new DataOutputStream(usuarios.get(i).getOutputStream());
                    out.writeUTF(recibido);
                }
            }
        } catch (Exception e) {
            for (int i = 0; i < usuarios.size(); i++) {
                if(usuarios.get(i) == Socket){
                    usuarios.remove(i);
                    break;
                }
            }
        }
    }
    
}
