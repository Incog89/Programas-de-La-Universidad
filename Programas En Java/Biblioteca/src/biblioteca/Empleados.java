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
public class Empleados {
    protected String nombreEmpleado;
    protected int edad;

    public Empleados() {
    }

    public Empleados(String nombreEmpleado, int edad) {
        this.nombreEmpleado = nombreEmpleado;
        this.edad = edad;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void RegistrarEmpleado(){
        Scanner in=new Scanner(System.in);
        System.out.println("Teclea Nombre:");
        this.nombreEmpleado=in.nextLine();
        System.out.println("Teclea Edad:");
        this.edad=in.nextInt();
    }
}
