/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;


public class Factorial {

    private static long facR (long n){
        long resultado;
        
        if (n==1) 
            return 1;
        resultado=facR(n-1)*n;
        return resultado;
    }
    // Esto es un equivalente iterativo
    private static long facI (long n){
        long resultado;
        double tiempo = System.nanoTime();
        resultado=1;
        for (long t=1; t<=n; t++) 
            resultado *=t;

        return resultado;
    }
    
    public static void main(String[] args) {
        double tiempo = System.nanoTime();
        System.out.println("Factorial utilizando un método recursivo:");
        for (long i = 1; i <= 21; i++) {
            System.out.println("El factorial de "+ i + "! es: "+ facR(i));
        }
        System.out.println("Recursivo "+((System.nanoTime()-tiempo)/100000)+" Milisegundos");
        tiempo = 0;
        System.out.println("Factorial utilizando un método iterativo:");
        for (int i = 1; i <= 21; i++) {
            System.out.println("El factorial de "+ i + "! es: "+ facI(i));
        }
        System.out.println("Iterativo "+((System.nanoTime()-tiempo)/100000)+" Milisegundos");
        
    }
}

