/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bit.bit;

/**
 *
 * @author bruno
 */
public class DatosPersonales {
    
    private String rut;
    private String nombre;
    private String estadoCivil;

    public DatosPersonales() {
    }

    public DatosPersonales(String rut, String nombre, String estadoCivil) {
        this.rut = rut;
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    
}
