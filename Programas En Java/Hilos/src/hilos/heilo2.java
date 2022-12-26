
package hilos;


public class heilo2 extends Thread{
    @Override
    public void run(){
        
    for(int i=0; i<10; i++){
        
        System.out.print("X");
        try {
            heilo.sleep(3300);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(heilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }    
        
    }
}
