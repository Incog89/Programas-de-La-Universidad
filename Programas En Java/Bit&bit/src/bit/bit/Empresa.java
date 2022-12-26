/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bit.bit;
import java.util.ArrayList;
/**
 *
 * @author PC01
 */
public class Empresa {
    
    private ArrayList <Trabajador> traba=new ArrayList <Trabajador>();

    public Empresa() {
    }

    public ArrayList<Trabajador> getTraba() {
        return traba;
    }

    public void setTraba(ArrayList<Trabajador> traba) {
        this.traba = traba;
    }
    
    //
    
    public int buscar(String rut)
    {
        for (int i = 0; i < traba.size(); i++) 
        {
            if(traba.get(i).getDatos().getRut().compareToIgnoreCase(rut)==0)
                return i;
        }
        return -1;
    }
    
    public String ingresarTrabajador(Trabajador tra)
    {
        if(buscar(tra.getDatos().getRut())==-1)
        {
            traba.add(tra);
            return "\n\tTrabajador Ingresado";
            
        }
        else
            return "\n\tTrabajador ya esistente... No se puede agregar";
    }
    
    public String eliminarTrabajador(String rut)
    {
            
        int pos=buscar(rut);
        if(pos!= -1)
        {
            traba.remove(pos);
            return "\nTrabajador Eliminado.";
                
        }
        else 
            return "\nTrabajador NO existente.... Nada que eliminar";
    }
    
    public int cantidadProfesores()
    {
        int cont=0;
        for (int i = 0; i < traba.size(); i++)
        {
            if(traba.get(i).getCargo().compareToIgnoreCase("profesional")==0)
            cont++;
        }
        return cont;
        
    }
    
    public int mayorSueldoBruto()
    {
        int may=-1;
        int pos=-1;
        for (int i = 0; i < traba.size(); i++)
        {
            if(may<traba.get(i).sueldoBruto())
            {
                
                may=traba.get(i).sueldoBruto();
                pos=i;
            }
        }
        return pos;
    }    
    public String infoMayorSueldo()
    {
        
        int pos=mayorSueldoBruto();
        if(pos==-1)
            return "La Empresa no tiene trabajadores";
        else
            return "El Trabajador con Mayor sueldo bruto es: "+
                    "\nNombre: "+traba.get(pos).getDatos().getNombre()+
                    "\nRut: "+ traba.get(pos).getDatos().getRut();
    }
}
