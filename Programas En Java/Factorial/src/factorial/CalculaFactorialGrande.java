/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.math.*;
public class CalculaFactorialGrande {
    private static BigInteger Factorial(BigInteger numero){
        if (numero.compareTo(BigInteger.ONE)<=0) {
            return BigInteger.ONE;
        }else
            return numero.multiply(Factorial(numero.subtract(BigInteger.ONE)));
    }
    
    public static void main(String[] args) {
        int contador;
        for (contador = 0; contador < 50; contador++) {
            System.out.printf("%d! = %d\n",contador,Factorial(BigInteger.valueOf(contador)));
        }
    }
    
}
