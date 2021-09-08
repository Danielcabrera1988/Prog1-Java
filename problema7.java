package Arrays;

import java.util.Scanner;

public class problema7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] analfabeto = new int[10];
        int i, promedio=0, encima=0, debajo=0;

        for (i=0; i<10 ; i++){
            System.out.print("Ingrese la cantidad de Analfabetos de la ciudad "+i+": ");
            analfabeto[i] = in.nextInt();
            promedio = promedio + analfabeto[i];
        }
        promedio = promedio/10;
        System.out.println("\nLa media de Analfabetismo es "+promedio);
        for (i=0 ; i<10 ; i++){
            if(promedio>analfabeto[i]){
                encima++;
            }
            else debajo++;
        }
        System.out.println("\nLa cantidad de ciudades por debajo de la media son "+debajo);
        System.out.println("La cantidad de ciudades por encima de la media son "+encima);
    }
}
