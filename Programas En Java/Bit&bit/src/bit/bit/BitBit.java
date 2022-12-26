/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bit.bit;

/**
 *
 * @author bruno
 */
import java.util.Scanner;
public class BitBit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner teclado = new Scanner (System.in);
        Empresa emp = new Empresa();
        String cargo,rut,nombre,estado;
        int op,chn,che;
        DatosPersonales datos=null;
        Trabajador trabajador=null;
        
        do
        {
            System.out.println("\n\tBit & Bit\n"+
                    "1.Ingresar Trabajador  \n" +
                    "2.Mostrar los datos del Trabajador X\n" +
                    "3.Cantidad de profesionales   \n" +
                    "4.Nombre y Rut del trabajador con mayor sueldo bruto\n" +
                    "5.Eliminar un trabajador X \n" +
                    "6.Salir\n"+
                    "Eliga una Opcion: ");
            
            
            op = teclado.nextInt();
            
            switch(op)
            {
                case 1:
                    System.out.println("Ingrese datos del trabajador: ");
                    System.out.print("Rut: ");
                    teclado.nextLine(); 
                    rut=teclado.nextLine();
                    System.out.print("Nombre: ");
                    nombre=teclado.nextLine();
                    System.out.print("Cargo: ");
                    cargo=teclado.nextLine();
                    System.out.print("Estado Civil: ");
                    estado=teclado.nextLine();
                    System.out.print("Cantidad de Horas Normales: ");
                    chn=teclado.nextInt();
                    System.out.print("Cantidad de Horas Extras: ");
                    che=teclado.nextInt();
                    datos=new DatosPersonales(rut, nombre,estado);
                    trabajador = new Trabajador(cargo, datos, chn, che);
                    System.out.println(emp.ingresarTrabajador(trabajador));
                   break;
                   
                   
                case 2:
                    System.out.println("\n\tIngrese el rut del trabajador");
                    teclado.nextLine();
                    rut=teclado.nextLine();
                    System.out.println("\nNombre: " + datos.getNombre());
                    System.out.println("Rut: " + datos.getRut());
                    System.out.println("Estado Civil: " + datos.getEstadoCivil());
                break;
                
                
                case 3:
                    System.out.println("\n\tLa Cantidad de profesionales que tiene la Empresa es: " +
                        emp.cantidadProfesores());
                break;
        
                case 4:
                    System.out.println(emp.infoMayorSueldo());
                break;
        
        
                case 5:
                    System.out.println("\n\tIngrese el rut del trabajador");
                    teclado.nextLine();
                    rut= teclado.nextLine();
                    System.out.println(emp.eliminarTrabajador(rut));
                break;
            }
           
            
        }while(op!=6);
        
        
    }
    
    
    
}

