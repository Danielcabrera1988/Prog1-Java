package Condicionales;

import java.util.Scanner;

public class Condicional12 {
    public static void main(String[] args) {

        int select;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        select = in.nextInt();

        switch (select) {
            case 1 -> System.out.println("lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("No hay mas dias de la semana");

        }
    }
}



