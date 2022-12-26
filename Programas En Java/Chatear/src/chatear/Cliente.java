/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatear;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.HashSet;
import javax.swing.JEditorPane;

public class Cliente implements Runnable {

    private Socket cliente;
    private DataInputStream in;
    private DataOutputStream out;
    private int puerto = 2027;
    private String host = "localhost";
    private String mensajes="";
    JEditorPane panel;
    
    public Cliente(JEditorPane panel){
        this.panel= panel;
        try {
            cliente = new Socket(host, puerto);
            in = new DataInputStream(cliente.getInputStream());
            out = new DataOutputStream(cliente.getOutputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void run() {
        try {
            while(true){
                mensajes +=in.readUTF();
                panel.setText(mensajes);
            }
        } catch (Exception e) {
            
        }
    }
    
    public void enviarmsg(String msg){
        try {
            out.writeUTF(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
