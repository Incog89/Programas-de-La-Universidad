/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesebm;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Cadena {

    public static void main(String[] args) {
        int x = 0, y = 0;
        boolean repetir;
        Scanner sc = new Scanner(System.in);
        do {
            repetir = false;
            try {
                System.out.println("Ingrese la cantidad de numeros a guardar");
                y = sc.nextInt();
                int numero[] = new int[y];
                System.out.println("Ingresa los " + y + " numeros");
                for (int i = 0; i < y; i++) {
                    numero[i] = sc.nextInt();
                }
                System.out.println("que posicion desea cambiar");
                x = sc.nextInt();
                System.out.println("Ingresa el nuevo numero: ");
                numero[x] = sc.nextInt();
                for (int i = 0; i <= y; i++) {
                    System.out.println("El numero en la posicion " + i + " es: " + numero[i]);
                }
            } catch (Exception e) {
                System.out.println("Se encontro un error la cual es: " + e);
                sc.nextLine();
                repetir = true;
            }
        } while (repetir);
    }
}
