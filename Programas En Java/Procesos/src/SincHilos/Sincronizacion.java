/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SincHilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joyke
 */
public class Sincronizacion {
    public static void main(String[] args){
        multihilos hilo=new multihilos();
        multihilos2 hilo1=new multihilos2(hilo);
        
        hilo.start();
        hilo1.start();
        System.out.println("Fin del proceso");
        
        
    }
}

class multihilos extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Se procesa el ["+ getName()+"]"+"en la posicion ["+i+"]");
        }
    }
}

class multihilos2 extends Thread{
    public multihilos2(Thread hilo1){
        this.hilo=hilo1;
    }
    @Override
    public void run(){
        
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(multihilos2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Se procesa el ["+ getName()+"]"+"en la posicion ["+i+"]");
        }
    }
    private Thread hilo;
}