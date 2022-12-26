/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author joyke
 */
public class MainCalculadora {
    public static void main(String[] args) {
        Calcu panel = new Calcu();
        Calcu1 panel1 = new Calcu1();
        JFrame aplicacion = panel;
        JFrame aplicacion1 = panel1;
        String Opcion = JOptionPane.showInputDialog("* ¿Qué es lo que desea hacer?\n1.-Calculadora Basica\n2.-Calculadora de numeros racioales\n3.-Calculadora de imaginarios");
        switch (Opcion) {
            case "1":
                aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion.setVisible(true);
                break;
            case "2":
                aplicacion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion1.setVisible(true);
                break;
            case "3":
                aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //aplicacion.add(panel2);

                break;

        }
    }
    
    
}
