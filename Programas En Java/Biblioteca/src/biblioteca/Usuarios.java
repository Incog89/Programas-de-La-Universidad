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
public class Usuarios {
    private int idRegistro;
    private String Nombre;
    private String Direccion;
    private Double telefono;
    private String ListaLibros[]=new String[50];
    int i=0;
    
    public Usuarios() {
    }

    public Usuarios(int idRegistro, String Nombre, String Direccion, Double telefono) {
        this.idRegistro = idRegistro;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.telefono = telefono;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Double getTelefono() {
        return telefono;
    }

    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }

      
    
    void RegistrarUsuario() {
        Scanner in=new Scanner(System.in);
        System.out.println("Teclea una ID:");
        this.idRegistro=in.nextInt();
        System.out.println("Teclea el nombre:");
        this.Nombre=in.nextLine();
        System.out.println("Teclea Su direccion:");
        this.Direccion=in.nextLine();
        System.out.println("Teclea un telefono:");
        this.telefono=in.nextDouble();
    }

    void AgregarLibro() {
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa Titulo de libro (Confirmacion):");
        this.ListaLibros[i]=in.nextLine();
        
    }
    
}
