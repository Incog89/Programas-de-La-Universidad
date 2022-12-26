
package hilos;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

//otra forma de implementar hilos es heilo implements runnable
public class heilo extends Thread{
    
    @Override
    public void run(){
        
    for(int i=0; i<10; i++){
        
        System.out.print("A");
        try {
            heilo.sleep(3200);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(heilo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }    
        
    }
    
    
}
