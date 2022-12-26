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
public class EjecutableCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean continua;
        do {
            try {
                continua = false;
                System.out.println("Ingrese un valor entero");
                num = sc.nextInt();
                CuadradoMetodo cuad = new CuadradoMetodo(num);
                cuad.HaceCuadrado();
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un numero entero");
                sc.next();
                continua = true;
            }
        } while (continua);
    }
}
