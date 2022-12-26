/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainespiral;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class HacerEspiral extends JPanel{
public void paintComponent(Graphics g){
        super.paintComponent(g);
        int CentroX = getWidth()/2;
        int CentroY = getHeight()/2;
        int radio = 10;
        for (int contorno = 0, contorno3 = 0; contorno < 12; contorno++) {
            g.drawOval(CentroX-(contorno * radio), CentroY - ((contorno ) * radio), radio * contorno3, radio * contorno3);
            contorno3++;
            //g.drawOval(CentroX - ((contorno ) * radio), CentroY - ((contorno ) * radio), radio * contorno3, radio * contorno3);
            contorno3++;
        }
    }
}

