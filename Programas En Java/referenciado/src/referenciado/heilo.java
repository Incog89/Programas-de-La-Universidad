package referenciado;


public class heilo extends Thread {
    int num;
    @Override
    public void run() {

        for (int i = 0; i < num; i++) {

            System.out.println("Numero: " + i);

        }

    }
    
    public void pasar(int variable){
        this.num=variable;
    }

}
