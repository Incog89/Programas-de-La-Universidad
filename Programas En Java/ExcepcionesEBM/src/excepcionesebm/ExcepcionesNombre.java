/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesebm;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class ExcepcionesNombre {

    public static void main(String[] args) {
        int[] matriz = new int[5];
        try {
            matriz[0] = 9;
            matriz[1] = 81;
            matriz[2] = 62;
            matriz[3] = 73;
            matriz[4] = 7328;
            matriz[5] = 738;

        } catch (ArrayIndexOutOfBoundsException e) {

        }
        String nombre = JOptionPane.showInputDialog("Nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("edad"));
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion " + i + " = " + matriz[i]);
        }
        System.out.println("Hola " + nombre + " Tu tienes " + edad + " fin del programa");
    }
}
