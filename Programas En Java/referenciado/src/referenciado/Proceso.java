
package referenciado;


public class Proceso {
   
    
    private String Nombre;
    private int iter;
    
    public Proceso(String Nombre, int iter){
        
        this.Nombre=Nombre;
        this.iter=iter;
        
    }
    
    public void ejecutar(){
        
        for(int i=0; i<iter; i++){
            
            System.out.println(Nombre+""+i);
            
        }
        
    }
    
    public static void main(String[]args){
        Proceso iter1=new Proceso("ITER 1 ", 10);
        Proceso iter2=new Proceso("ITER 2 ", 10);
        Proceso iter3=new Proceso("ITER 3 ", 10);
        iter1.ejecutar();
        iter2.ejecutar();
        iter3.ejecutar();
    }
}


    
    

