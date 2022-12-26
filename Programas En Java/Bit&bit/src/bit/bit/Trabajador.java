/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bit.bit;

/**
 *
 * @author bruno
 */
public class Trabajador {
    
    private String cargo;
    private DatosPersonales datos;
    private int cantidadHorasNormales;
    private int cantidadHorasExtra;

    public Trabajador() {
    }

    public Trabajador(String cargo, DatosPersonales datos, int cantidadHorasNormales, int cantidadHorasExtra) {
        this.cargo = cargo;
        this.datos = datos;
        this.cantidadHorasNormales = cantidadHorasNormales;
        this.cantidadHorasExtra = cantidadHorasExtra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public DatosPersonales getDatos() {
        return datos;
    }

    public void setDatos(DatosPersonales datos) {
        this.datos = datos;
    }

    public int getCantidadHorasNormales() {
        return cantidadHorasNormales;
    }

    public void setCantidadHorasNormales(int cantidadHorasNormales) {
        this.cantidadHorasNormales = cantidadHorasNormales;
    }

    public int getCantidadHorasExtra() {
        return cantidadHorasExtra;
    }

    public void setCantidadHorasExtra(int cantidadHorasExtra) {
        this.cantidadHorasExtra = cantidadHorasExtra;
    }
    
    //metodos
    
    public int valorHoraNormal()
    {
        if(cargo.compareToIgnoreCase("Supervisor") == 0)
            return 18500;
        if(cargo.compareToIgnoreCase("Profesional") == 0)
            return 15700;
        if(cargo.compareToIgnoreCase("Tecnico") == 0)
            return 12000;
        return 10000;
    }
    
    public int sueldoBruto()
    {
        return (int) (cantidadHorasNormales * valorHoraNormal() + (cantidadHorasExtra * valorHoraNormal() * 1.5));
    }
}
