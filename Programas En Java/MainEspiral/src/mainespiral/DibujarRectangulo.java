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
public class DibujarRectangulo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int i;
    for(i=0;i<300;i++){
i=i+10;
        g.drawRect(i, i, 200, 200);
}
}
}
