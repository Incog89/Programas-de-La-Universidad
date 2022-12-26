
package hilos;


public class Proceso2 extends Thread{
    
    private String Nombre;
    private int iter;
    
    public Proceso2(String Nombre, int iter){
        
        this.Nombre=Nombre;
        this.iter=iter;
    }
    
    public void empezar(){
        this.start();
    }
    @Override
    public void run(){
        
        for(int i=0; i<iter; i++){
            
            System.out.println(Nombre+""+i);
            
        }
        
    }
    
    public static void main(String[]args){
        Proceso2 iter1=new Proceso2("ITER 1 ", 10);
        Proceso2 iter2=new Proceso2("ITER 2 ", 10);
        Proceso2 iter3=new Proceso2("ITER 3 ", 10);
        iter1.empezar();
        iter2.empezar();
        iter3.empezar();
    }
}