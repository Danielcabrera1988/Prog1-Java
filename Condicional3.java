package Condicionales;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        int mayor, menor, dif;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese la edad del hermano mayor: ");
        mayor = in.nextInt();
        System.out.print("Ingrese la edad del hermano menor: ");
        menor = in.nextInt();
        dif = mayor - menor;
        System.out.println("La edad del hermano mayor es de "+mayor);
        System.out.println("La diferencia del hermano mayor con el menor es de "+dif);
    }
}