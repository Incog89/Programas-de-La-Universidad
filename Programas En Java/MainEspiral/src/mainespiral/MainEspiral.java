/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainespiral;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class MainEspiral {


    public static void main(String[] args) {
        DibujarRectangulo panel = new DibujarRectangulo();
        DibujarOvalo panel1 = new DibujarOvalo();
        HacerEspiral panel2 = new HacerEspiral();
        JFrame aplicacion = new JFrame();

        String Opcion = JOptionPane.showInputDialog("* ¿Qué es lo que desea hacer?\n1.-Dibujar Rectangulo\n2.-Dibujar Ovalos\n3.-Dibujar una espiral");
        switch (Opcion) {
            case "1":
                aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion.add(panel);
                aplicacion.setSize(500, 500);
                aplicacion.setVisible(true);
                break;
            case "2":
                aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion.add(panel1);
                aplicacion.setSize(500, 500);
                aplicacion.setVisible(true);
                break;
            case "3":
                aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                aplicacion.add(panel2);
                aplicacion.setSize(500, 500);
                aplicacion.setVisible(true);
                break;

        }
    }

}
