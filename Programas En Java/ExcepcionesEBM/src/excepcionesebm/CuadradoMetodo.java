/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesebm;

/**
 *
 * @author Alumno
 */
public class CuadradoMetodo {
    private int num;
    private int cuad=0;

    public CuadradoMetodo(int num) {
        this.num = num;
    }
    
    public void HaceCuadrado(){
        cuad=num*num;
        System.out.println("El cuadrado de " + num + " es " + cuad);
    }
}

