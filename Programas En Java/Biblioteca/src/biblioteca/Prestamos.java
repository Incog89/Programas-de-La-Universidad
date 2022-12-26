/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author joyke
 */
public class Prestamos {
    private Usuarios ListaUsuarios[]=new Usuarios[50];
    private Libros ListaLibros[]=new Libros[50];
    private String fSolicitud;
    private String fRegreso;

    public Prestamos() {
    }

    public Prestamos(String fSolicitud, String fRegreso) {
        this.fSolicitud = fSolicitud;
        this.fRegreso = fRegreso;
    }

    public Usuarios[] getListaUsuarios() {
        return ListaUsuarios;
    }

    public void setListaUsuarios(Usuarios[] ListaUsuarios) {
        this.ListaUsuarios = ListaUsuarios;
    }

    public Libros[] getListaLibros() {
        return ListaLibros;
    }

    public void setListaLibros(Libros[] ListaLibros) {
        this.ListaLibros = ListaLibros;
    }

    public String getfSolicitud() {
        return fSolicitud;
    }

    public void setfSolicitud(String fSolicitud) {
        this.fSolicitud = fSolicitud;
    }

    public String getfRegreso() {
        return fRegreso;
    }

    public void setfRegreso(String fRegreso) {
        this.fRegreso = fRegreso;
    }
    
}
