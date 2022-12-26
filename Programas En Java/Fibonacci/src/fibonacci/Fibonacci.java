/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author joyke
 */
public class Fibonacci {

    public static long fibonacci(long posicion) {
		long siguiente = 1, actual = 0, temporal = 0;
		for (long x = 1; x <= posicion; x++) {
                    //System.out.print(actual + ", ");
                    temporal = actual;
                    actual = siguiente;
                    siguiente = siguiente + temporal;
            }
            System.out.println(actual);
            return actual;
	}
    //socket
    public static long fibonacciRecursivo(long posicion) {
		if (posicion < 2)
			return posicion;
		return fibonacciRecursivo(posicion - 1) + fibonacciRecursivo(posicion - 2);
	}
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        sc.close();
        System.out.println("Metodo Recursivo");
        for (int i = 0; i < limite; i++) {
            System.out.println(fibonacciRecursivo(i) + ", ");
        }
        System.out.println("Metodo Iterativo");
        for (int i = 0; i < limite; i++) {
            System.out.println(fibonacci(i) + ", ");
        }
    }  
}


