package Condicionales;

import java.util.Scanner;

public class Condicional8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        a = in.nextInt();
        System.out.print("Ingrese el seungo valor: ");
        b = in.nextInt();

        if (a == b){
            c = a*b;
            System.out.println("El resultado es "+c);
        }
        else if (a > b){
            c = a-b;
            System.out.println("El resultado es "+c);
        }
        else{
            c = a+b;
            System.out.println("El resultado es "+c);
        }
    }
}

