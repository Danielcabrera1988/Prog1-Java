package Condicionales;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        a = in.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        b = in.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        c = in.nextInt();

        if(a>b && a>c){
            System.out.println("El mayor de los valores es "+a);
        }
        else if (b>a && b>c){
            System.out.println("El mayor de los valores es "+b);
        }
        else if (c>a && c>b){
            System.out.println("El mayor de los valores es "+c);
        }
        else{
            System.out.println("Los valores son iguales");
        }
    }
}
