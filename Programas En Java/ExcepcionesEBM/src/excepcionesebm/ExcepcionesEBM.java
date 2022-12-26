/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesebm;

/**
 *
 * @author Alumno
 */
public class ExcepcionesEBM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero[] = new int[7];

        try {
            System.out.println("ANTES DE ENTRAR A LA EXCEPCION");
            numero[6] = 6;
        } catch (Exception e) {
            System.out.println("ENTRO EN EXCEPCION");
        }
        System.out.println("DESPUES DE LA EXCEPCION");
    }

}
