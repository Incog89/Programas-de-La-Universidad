package control;

import interfaz.VentanaPrincipal;
import modelo.Cliente;

/**
 *
 * @author Christian Hernandez Najera, Lorena Valle Gonzalez y Eduardo Bustos Moran
 */
public class Control {
    
    public Control() {
        ventana = new VentanaPrincipal(this);
        cliente = new Cliente();
        cliente.agregar(ventana);
    }
    
    public void mostrarVentana() {
        ventana.show();
    }
    
    public void conectarse() {
        try {
            cliente.setActivo(true);
            cliente.start();
        } catch(Exception e) {
        }
    }
    public void desconectarse() {
        cliente.setActivo(false);
        cliente.stop();
    }
    public String getMsg() {
        return cliente.getMsg();
    }
    
    Cliente cliente;
    VentanaPrincipal ventana;
}
