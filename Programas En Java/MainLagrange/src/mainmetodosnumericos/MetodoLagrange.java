/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmetodosnumericos;

/**
 *
 * @author joyke
 */
public class MetodoLagrange {

    private int y[];
    private int x[];
    private double a[];

    public MetodoLagrange(int[] y, int[] x) {
        this.y = y;
        this.x = x;
        a = new double[x.length];
    }

    private void getPolinomios_a() {
        double mult;
        for (int i = 0; i < y.length; i++) {
            mult = 1;
            for (int j = 0; j < x.length; j++) {
                if (i == j) {
                    continue;
                }
                mult = (x[i] - x[j]) * mult;
            }
            a[i] = y[i] / mult;
            System.out.print("a"+"["+i+"]="+a[i]+"  ");
        }
    }

    public double getResultadoP(int p) {
        getPolinomios_a();
        int mult = 1;
        double valores[] = new double[a.length];
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            mult = 1;
            for (int j = 0; j < a.length; j++) {

                if (i == j) {
                    continue;
                }
                mult = (p - x[j]) * mult;
            }
            valores[i] = a[i] * mult;
            System.out.print(valores[i]);
            if(i!=a.length-1)
                System.out.print(" + ");
        }

        double resultado = 0;
        for (int k = 0; k < valores.length; k++) {
            resultado = resultado + valores[k];
        }
        return resultado;
    }
}
