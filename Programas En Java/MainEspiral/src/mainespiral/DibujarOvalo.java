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
public class DibujarOvalo extends JPanel{
     public void paintComponent(Graphics g){
        super.paintComponent(g);
        int i;
    for(i=0;i<600;i++){
i=i+2;
        g.drawOval(i, i, 200, 200);
}
}
}
