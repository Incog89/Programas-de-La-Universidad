package Semana;

import java.util.Scanner;

public class Semana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, flag=0;
        do {
            System.out.println("Inserte un numero de la semana (del 1 al 7): ");
            numero = sc.nextInt();
            if (numero > 7) {
                System.out.println("La semana solo tiene siete dias");
                flag=1;
            } else {
                switch (numero) {
                    case 1,7 -> {
                        System.out.println("Fin de semana");
                        flag = 0;
                    }
                    case 2,3,4,5,6 -> {
                        System.out.println("Dia Laboral");
                        flag = 0;
                    }
                }
            }
        } while (flag == 1);
    }
}
