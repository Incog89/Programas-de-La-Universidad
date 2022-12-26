/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainmetodosnumericos;

/**
 *
 * @author joyke
 */
public class MainLagrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[]={5,7,11,13,17};
	int y[]={150,392,1452,2366,5202};
	MetodoLagrange l=new MetodoLagrange(y, x);
	double res=l.getResultadoP(9);
	System.out.println("\nEl resultado es "+res);
    }
    
}
