package Iterativos;

import java.util.Scanner;

public class Iterativos6 {
    public static void main(String[] args) {
        int n, i;
        int acum = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        n = in.nextInt();

        if (n>0) {
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    acum++;
                }
            }
        }
        if (acum > 2) {
            System.out.println("El numero no es primo");
        }
        else {
            System.out.println("El numero es primo");
        }
    }
}
