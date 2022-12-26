/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.Scanner;

/**
 *
 * @author joyke
 */
public class Restauradores extends Empleados{
    private String ListaLibrosD[]=new String[50];
    private Supervisores sup;
    int i=0;

    public Restauradores() {
    }

    public Restauradores(Supervisores sup) {
        this.sup = sup;
    }

    public Restauradores(Supervisores sup, String nombreEmpleado, int edad) {
        super(nombreEmpleado, edad);
    }

    void AgregarLibroResaturar() {
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa Titulo de libro a reparar (Confirmacion):");
        this.ListaLibrosD[i]=in.nextLine();
    }
  
}
