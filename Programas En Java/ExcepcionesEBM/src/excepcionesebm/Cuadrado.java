/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesebm;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Cuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean continua;
        do {
            try {
                continua = false;
                System.out.println("Ingrese un valor entero");
                num = sc.nextInt();
                int cuadrado = num * num;
                System.out.println("El cuadrado de " + num + " es " + cuadrado);
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un numero entero");
                sc.next();
                continua = true;
            }
        } while (continua);
    }
}
