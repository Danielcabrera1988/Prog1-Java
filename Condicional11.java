package Condicionales;

import java.util.Scanner;

public class Condicional11 {
    public static void main(String[] args) {
    int altura, baja = 150, media = 170;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese la Estatura en cm: ");
        altura = in.nextInt();

        if (altura<=baja){
            System.out.println("Persona de altura baja");
        }
        else if (altura <= media){
            System.out.print("Persona de altura media");
        }
        else {
            System.out.println("Persona Alta");
        }
    }
}
