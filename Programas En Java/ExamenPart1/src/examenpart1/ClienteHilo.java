/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenpart1;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ClienteHilo extends Thread{
    
    private DataInputStream in;
    private DataOutputStream out;
    public ClienteHilo(DataInputStream in, DataOutputStream out) {
        this.in = in;
        this.out = out;
    }
    @Override
    public void run(){
     
    }
    
}