package Condicionales;

import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {
        int select;
        Scanner in = new Scanner(System.in);

        System.out.println("Programa que muestra su equivalente en numeros romanos del 1 al 10");
        System.out.print("Ingrese un valor: ");
        select = in.nextInt();

        switch (select) {
            case 1 -> System.out.println("El 1 es I");
            case 2 -> System.out.println("El 2 es II");
            case 3 -> System.out.println("El 3 es III");
            case 4 -> System.out.println("El 4 es IV");
            case 5 -> System.out.println("El 5 es V");
            case 6 -> System.out.println("El 6 es VI");
            case 7 -> System.out.println("El 7 es VII");
            case 8 -> System.out.println("El 8 es VIII");
            case 9 -> System.out.println("El 9 es IX");
            case 10 -> System.out.println("El 10 es X");
            default -> {
                System.out.println("El 0 y N° negativos no existen en los Rumeros Romanos");
                System.out.println("Solo se muestran valores desde 1 hasta el 10");
            }
        }
    }
}
