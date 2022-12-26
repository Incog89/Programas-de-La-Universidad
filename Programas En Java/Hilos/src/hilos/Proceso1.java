
package hilos;

public class Proceso1 {
    
    private String Nombre;
    private int iter;
    
    public Proceso1(String Nombre, int iter){
        
        this.Nombre=Nombre;
        this.iter=iter;
        
    }
    
    public void ejecutar(){
        
        for(int i=0; i<iter; i++){
            
            System.out.println(Nombre+""+i);
            
        }
        
    }
    
    public static void main(String[]args){
        Proceso1 iter1=new Proceso1("ITER 1 ", 10);
        Proceso1 iter2=new Proceso1("ITER 2 ", 10);
        Proceso1 iter3=new Proceso1("ITER 3 ", 10);
        iter1.ejecutar();
        iter2.ejecutar();
        iter3.ejecutar();
    }
}
