package Arrays;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        int[] pares = new int[20];
        int i;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese 20 valores para comprobar si son pares o no");
        for (i = 0; i <20; i++) {
            System.out.print("Posicion "+i+": ");
            pares[i] = in.nextInt();
        }
        System.out.println("**Los N° pares son**");
        System.out.print("[");
        for (i = 0; i<20 ; i++) {
            if (pares[i] % 2 == 0) {
                System.out.print(" - "+pares[i]);
            }
        }
        System.out.println(" -]");
    }
}
