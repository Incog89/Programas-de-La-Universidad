package control;

import interfaz.VentanaPrincipal;
import java.io.PrintStream;
import modelo.Servidor;

/**
 *
 * @author Christian Hernandez Najera, Lorena Valle Gonzalez y Eduardo Bustos Moran
 */
public class Control {
    
    VentanaPrincipal ventana;
    Servidor servidor;
    int cantidad = 0;
    PrintStream ps;
    
    public Control() {
        ventana = new VentanaPrincipal(this);
        servidor = new Servidor();        
    }
    
    public void muestraVentana() {
        ventana.show();        
    }
    
    public void agregarIp(String ip) {
        servidor.agregarClientes(ip);
        ventana.addIP(ip);
    }
    public void agregarCantidad(int cant) {
        cantidad = cant;
    }
    public void calcular(String cmd) {
        servidor.ejecutar(cmd, cantidad);
    }   
    
}
