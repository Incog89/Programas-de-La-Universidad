/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    static int contador=0;
    static int indice=0;
   public static void main(String[] args) {
        Scanner in=new Scanner(System.in);    
        String nombre;
        String titulo;
        Empleados ListaEmpleados[]=new Empleados[50];
        Usuarios ListaUsuarios[]=new Usuarios[50];
        Libros ListaLibros[]=new Libros[50];
        LibroDesperfecto ListaLibrosD[]=new LibroDesperfecto[50];
        
        int opcion=0;
        
        do{
            System.out.println("1.-Registrar Libros");
            System.out.println("2.Registrar Usuarios");
            System.out.println("3.Registrar Empleados Restauradores");
            System.out.println("4.Registrar Empleados Supervisores");
            System.out.println("5.Registrar prestamo de un libro para un usuario lector");
            System.out.println("6.Registrar Libros a restaurar para cada empleado restaurador");
            System.out.println("7.Registrar empleados restauradores para un empleado supervisor");
            System.out.println("8.Salir");           
            System.out.println("Ingresa opcion (1..8)");
            opcion=in.nextInt();
            switch(opcion){
                case 1:
                      in.nextLine();
                      
                      break;
                      
                case 2:
                      in.nextLine();
                      Usuarios usuario1=new Usuarios();
                       usuario1.RegistrarUsuario();
                       ListaUsuarios[contador]=usuario1;
                       contador++;
                      break;
                case 3:
                       in.nextLine();
                       Restauradores empleado1=new Restauradores();
                       empleado1.RegistrarEmpleado();
                       ListaEmpleados[contador]=empleado1;
                       contador++;
                       break;
                case 4:
                       in.nextLine();
                       Supervisores empleado2=new Supervisores();
                       empleado2.RegistrarEmpleado();
                       ListaEmpleados[contador]=empleado2;
                       contador++;
                       break;
                case 5:
                       in.nextLine();   
                       System.out.println("Ingresa nombre del Usuario:");
                       nombre=in.nextLine();
                       Usuarios usu=BuscarUsuario(ListaUsuarios, nombre);
                       System.out.println("Ingresa nombre del Libro:");
                       titulo=in.nextLine();
                       Libros lib=BuscarLibro(ListaLibros, titulo);
                       for(int i=0;i<contador;i++){
                           if (ListaUsuarios[i].getNombre().equals(nombre)){
                               Usuarios empUsuarios=(Usuarios)ListaUsuarios[i]; 
                               empUsuarios.AgregarLibro();
                               ListaUsuarios[i]=empUsuarios;
                           }
                       }
                       break;
                case 6:
                       in.nextLine();
                       System.out.println("Ingresa nombre del Restaurador:");
                       nombre=in.nextLine();
                       Restauradores restauradores=BuscarRestaurador(ListaEmpleados,nombre);
                       System.out.println("Ingresa nombre del Libro a restaurar:");
                       titulo=in.nextLine();
                       LibroDesperfecto lib2=BuscarLibroD(ListaLibrosD, titulo);
                       for(int i=0;i<contador;i++){
                           if (ListaEmpleados[i].getNombreEmpleado().equals(nombre)){
                               Restauradores empUsuarios=(Restauradores)ListaEmpleados[i]; 
                               empUsuarios.AgregarLibroResaturar();
                               ListaEmpleados[i]=empUsuarios;
                           }
                       }
                       break;
                case 7:
                       in.nextLine();
                       System.out.println("Ingresa nombre del Supervisor:");
                       nombre=in.nextLine();
                       Supervisores sup=BuscarSupervisor(ListaEmpleados,nombre);
                       System.out.println("Ingresa nombre del Restaurador:");
                       nombre=in.nextLine();
                       Restauradores restauradores2=BuscarRestaurador(ListaEmpleados,nombre);
                       sup.AgregarRestauradores(restauradores2);
                       ListaEmpleados[indice]=sup;
                       break;
            }
        }while(opcion!=8);

 }
   public static Supervisores BuscarSupervisor(Empleados[] ListaEmpleados, String nombre) {
        Supervisores sup= new Supervisores();
        for(int i=0;i<contador;i++){
            if(ListaEmpleados[i].getNombreEmpleado().equals(nombre)){
                System.out.println("encontrado "+i);
                indice=i;
                sup=(Supervisores)ListaEmpleados[i];
                break;
            }
        }
        return sup;
    }

    public static Restauradores BuscarRestaurador(Empleados[] ListaEmpleados, String nombre) {
        Restauradores restauradores= new Restauradores();
        for(int i=0;i<contador;i++){
            if(ListaEmpleados[i].getNombreEmpleado().equals(nombre)){
                restauradores=(Restauradores)ListaEmpleados[i];
                break;
            }
        }
        return restauradores;
    }
    public static Libros BuscarLibro(Libros[] ListaLibros, String Titulo) {
        Libros lib= new Libros();
        for(int i=0;i<contador;i++){
            if(ListaLibros[i].getTitulo().equals(Titulo)){
                System.out.println("encontrado "+i);
                indice=i;
                lib=(Libros)ListaLibros[i];
                break;
            }
        }
        return lib;
    }
    public static LibroDesperfecto BuscarLibroD(LibroDesperfecto[] ListaLibrosD, String Titulo) {
        LibroDesperfecto lib2= new LibroDesperfecto();
        for(int i=0;i<contador;i++){
            if(ListaLibrosD[i].getTitulo().equals(Titulo)){
                System.out.println("encontrado "+i);
                indice=i;
                lib2=(LibroDesperfecto)ListaLibrosD[i];
                break;
            }
        }
        return lib2;
    }
    public static Usuarios BuscarUsuario(Usuarios[] ListaUsuarios, String Nombre) {
        Usuarios usu= new Usuarios();
        for(int i=0;i<contador;i++){
            if(ListaUsuarios[i].getNombre().equals(Nombre)){
                System.out.println("encontrado "+i);
                indice=i;
                usu=(Usuarios)ListaUsuarios[i];
                break;
            }
        }
        return usu;
    }
}
    

