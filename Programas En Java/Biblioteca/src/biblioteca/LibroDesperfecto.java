/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author joyke
 */
public class LibroDesperfecto extends Libros{
    private String Desperfecto; 

    public LibroDesperfecto() {
    }

    public LibroDesperfecto(String Desperfecto) {
        this.Desperfecto = Desperfecto;
    }

    public LibroDesperfecto(String Desperfecto, int idLibro, String Titulo, String Autor, String Editorial, int Edicion) {
        super(idLibro, Titulo, Autor, Editorial, Edicion);
        this.Desperfecto = Desperfecto;
    }

}
