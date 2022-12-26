/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrente;

/**
 *
 * @author joyke
 * paralelo trabaja con nucleos, y en cada nucle trabaja con hilos
 */

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends Thread{
    private static double [] vec = new double[90000];

    
    private int inicio;
    private int fin;

    public Principal(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public static void main(String[] args) {
        iniciavector();
        
        vectorNoConcurrente();
        
        vectorConcurrente();
    }
    private static void iniciavector() {
        Random rand= new Random(System.nanoTime());
        for (int i = 0; i < vec.length; i++) {
            vec[i]=rand.nextInt();
        }
    }

    private static void vectorNoConcurrente() {
        double tiempo = System.nanoTime();
        for (int i = 0; i < vec.length; i++) {
            vec[i]*=20;
            vec[i]/=15;
            vec[i]*=40;
        }
        System.out.println("No concurrente "+((System.nanoTime()-tiempo)/100000)+" Milisegundos");
    }
    @Override
    public void run(){
        for (int i = inicio; i < fin; i++) {
            vec[i]*=20;
            vec[i]/=15;
            vec[i]*=40;
        }
    }
    private static void vectorConcurrente() {
        int nucleo=Runtime.getRuntime().availableProcessors();
        int inicio=0, fin=0;
        Principal[] princi= new Principal[nucleo];
        
        double tiempo = System.nanoTime();
        for (int i = 0; i < nucleo; i++) {
            inicio=fin;
            fin+=vec.length/nucleo;
            princi[i]=new Principal(inicio, fin);
            princi[i].start();
        }
        for (int i = 0; i < nucleo; i++) {
            try {
                princi[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("concurrente "+((System.nanoTime()-tiempo)/100000)+" Milisegundos");
    }
}
