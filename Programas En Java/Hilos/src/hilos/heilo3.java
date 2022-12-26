
package hilos;


public class heilo3 extends Thread{
    @Override
    public void run(){
        
    for(int i=0; i<10; i++){
        
        System.out.print("L ");
        System.out.println("");
        try {
            heilo.sleep(3400);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(heilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }    
        
    }
}
