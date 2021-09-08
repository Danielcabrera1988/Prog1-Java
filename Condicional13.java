package Condicionales;

import java.util.Scanner;

public class Condicional13 {
    public static void main(String[] args) {
        int a;
        Scanner in =  new Scanner(System.in);

        System.out.print("Ingrese un numero para comprobar si es par: ");
        a = in.nextInt();

        if (a <= 0)
            System.out.println("Ingrese un valor positivo");
        else if (a % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }
    }
}
