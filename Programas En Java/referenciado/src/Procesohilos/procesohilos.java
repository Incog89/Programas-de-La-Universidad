package Procesohilos;

public class procesohilos {//extends Thread{

    private String Nombre;
    private int iteracion;
    private Thread hilo;

    public procesohilos(String Nombre, int iteracion) {
        this.Nombre = Nombre;
        this.iteracion = iteracion;

    }

    public void empezar() {
        asignar();
        hilo.start();
    }

    public void detener() {
    }

//@Override
    /*public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Nombre + " " + i);

        }
    }
     */
    public void asignar() {
        hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Nombre + "--->" + i);

                }

            }
        });
    }

    public static void main(String[] args) {
        procesohilos iter = new procesohilos("Iteracion--->", 10);
        //iter.start;
        
        iter.empezar();
    }

}
