/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EP2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author joyke
 */
public class EP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodoDeGaussJordan panel = new MetodoDeGaussJordan();
        MetodoDeGaussSeidel panel1 = new MetodoDeGaussSeidel();
        JFrame aplicacion = panel;
        JFrame aplicacion1 = panel1;

        String Opcion = JOptionPane.showInputDialog("* ¿Qué es lo que desea hacer?\n1.-Metodo Gauss-Jordan\n2.-Metodo Gauss-Seidel");
        switch (Opcion) {
            case "1":
                aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion.setVisible(true);
                break;
            case "2":
                aplicacion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion1.setVisible(true);
                break;
    }
    
}
}
