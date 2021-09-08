package Arrays;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        int[] tabla = new int[35];
        int mayor = 0, i, cod=0;
        Scanner in = new Scanner(System.in);

        for (i = 0; i<35 ; i++){
            System.out.print("Ingrese los datos para el cod "+i+": ");
            tabla[i] = in.nextInt();
        }
        for (i = 0; i<35 ; i++){
            if(tabla[i] > mayor){
                mayor = tabla[i];
                cod = i;
            }
        }
        System.out.print("EL Cod "+cod+" fue el mayor con "+mayor+" violaciones");
    }
}
