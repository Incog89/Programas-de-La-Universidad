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
public class Divisiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Denominador[] = {0, 2, 4, 6, 7, 8};
        int Numerador[] = {2, 4, 6, 8, 16, 32, 64, 128, 256};
        for(int i = 0; i < 8; i++) {
            try {
                System.out.println("El resultado de " +Numerador[i]+"/"+Denominador[i]+ " es "+Numerador[i] / Denominador[i]);
            } catch (ArrayIndexOutOfBoundsException iae) {
                System.out.println("Esa posicion no existe en el array");
            } catch (Throwable ioe) {
                System.out.println("No se puede dividir entre cero");
            }
        }
        }

    }


