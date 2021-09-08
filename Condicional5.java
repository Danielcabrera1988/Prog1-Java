package Condicionales;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {
        int l1, l2, l3;
        Scanner in = new Scanner(System.in);

        System.out.println("Programa que calcula un tipo de triangulo");
        System.out.print("Ingrese un valor: ");
        l1 = in.nextInt();
        System.out.print("\nIngrese otro valor: ");
        l2 = in.nextInt();
        System.out.print("\nIngrese otro valor: ");
        l3 = in.nextInt();

        if (l1 == l2 && l2 == l3){
            System.out.println("El trinagulo es equilatero");
        }
        else if (l1 == l2 || l2 == l3 || l1 == l3){
            System.out.println("El triangulo es isoceles");
        }
        else{
            System.out.println("el triangulo es escaleno");
        }
    }
}
