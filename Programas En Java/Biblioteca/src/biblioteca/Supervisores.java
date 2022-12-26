/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author joyke
 */
public class Supervisores extends Empleados{
    private Restauradores SupervisorACargo[]=new Restauradores[10];
    int i=0;
    public Supervisores() {
    }

    public Supervisores(String nombreEmpleado, int edad) {
        super(nombreEmpleado, edad);
    }
    public void AgregarRestaurador(Restauradores subordinado){
        SupervisorACargo[i]=subordinado;
        i++;
    }

   public void ImprimirRestauradores() {
        for(int j=0;j<i;j++){
            System.out.print(SupervisorACargo[j].nombreEmpleado+ " ");
        }
   }

    void AgregarRestauradores(Restauradores subordinado) {
        SupervisorACargo[i]=subordinado;
        i++;
    }
}
