/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import interfaz.Respuestas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author Christian Hernandez Najera, Lorena Valle Gonzalez y Eduardo Bustos Moran
 */
public class EscuchaCliente extends Thread {
    
    boolean activo;
    private Socket socket;
    private ServerSocket servidor;
    InputStreamReader dataInput;
    BufferedReader input;
    private final int PUERTO_ENTRADA = 8585;
    Respuestas respuesta;
    JTextArea txtArea;
    
    public EscuchaCliente() {
        activo = true;
        respuesta = new Respuestas();
        txtArea = respuesta.getTxtArea();
    }
    
    public void showTxtArea() {
        respuesta.show();
    }
    
    @Override
    public void run() {
        try {
            servidor = new ServerSocket(PUERTO_ENTRADA);
        } catch (Exception e) {
            txtArea.append("El servidor no pudo conectarse\n");
            activo = false;
        }
        txtArea.append("Escuchando al Servidor\n");        
        while (activo) {
            try {

                socket = servidor.accept();
                txtArea.append("Conexion Exitosa\n");
                System.out.println("Conexion Exitosa");
                dataInput = new InputStreamReader(socket.getInputStream());
                input = new BufferedReader(dataInput);
                String mensaje;
                while ((mensaje = input.readLine()) != null) {
                    if (mensaje != " ") {
                        System.out.println(">" + mensaje);
                        txtArea.append(mensaje + "\n");
                    }
                }

            } catch (Exception ex) {
                txtArea.append("Error en el cliente\n");
            }
            try {
                socket.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void setActivo(boolean activo) {
            this.activo = activo;
        try {
            socket.close();
        } catch (IOException ex) {
        }
    }
    
}
