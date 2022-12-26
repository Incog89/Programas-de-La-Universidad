/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gausssaidel;
import java.math.BigDecimal;
import java.util.Scanner;
/**
 *
 * @author joyke
 */
public class Gausssaidel {

    final static int MAXN=10;
    static double a[][]=new double[MAXN][MAXN];
   // static double b[]=new double[MAXN];
    static double x1[]=new double[MAXN];// Se usa para guardar el valor para la iteración

    static int flag=7;// Número de iteraciones
    static int num;
    public static void main(String[] args) {
        System.out.println("Número de incógnitas:");
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Introduzca un sistema de ecuaciones como una matriz");
        for(int i=0;i<num;i++){
            for(int j=0;j<=num;j++){
                a[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Ingrese el valor de iteración inicial del sistema de ecuaciones");
        for(int i=0;i<num;i++){
            x1[i]=sc.nextDouble();
            //x2[i]=0;
        }
        for(int i=0;i<num;i++){// Escribe el sistema de ecuaciones como un sistema equivalente de ecuaciones
            for(int j=0;j<=num;j++){
                if(j<num&&j!=i){
                    a[i][j]=-(a[i][j]/a[i][i]);
                }else if(j==num){
                    a[i][j]=(a[i][j]/a[i][i]);
                }
            }
            a[i][i]=0;
        }
        for(int i=1;i<=flag;i++){// Iniciar iteración
            diedai();
            System.out.println("Iteración"+(i)+"Veces:");
            for(int j=0;j<num;j++){

                System.out.println("x"+(j+1)+"="+ new BigDecimal(x1[j]).
                        setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue());// Mantenga cinco dígitos después del punto decimal

            }
        }
    }
    static void diedai(){
        for(int i=0;i<num;i++){
            double temp=0;
            for(int j=0;j<num;j++){
                temp+=x1[j]*a[i][j];
            }
            temp+=a[i][num];
            x1[i]=temp;
        }
    }
}
