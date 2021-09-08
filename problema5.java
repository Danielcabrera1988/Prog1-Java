package Arrays;

import java.util.Scanner;

public class problema5 {
    public static void main(String[] args) {
        int[] n = new int[5];
        int aux;
        int[] inverso = new int[5];
        int cifra, i;
        Scanner in = new Scanner(System.in);

        for ( i = 0; i < 5; i++) {
            System.out.print("Introduce un número >= 10: ");
            n[i] = in.nextInt();
        }
        //lo damos la vuelta al número
        for ( i = 0; i<5 ;i++) {
            aux = n[i];
            while (aux != 0) {
                cifra = aux % 10;
                inverso[i] = inverso[i] * 10 + cifra;
                aux = aux / 10;
            }
        }
        for ( i = 0; i < 5; i++) {
            if (n[i] != inverso[i]) {
                System.out.println(n[i]+" No es capicua");
            } else {
                System.out.println(n[i]+" Es capicua");
            }
        }
    }
}
