package Iterativos;

import java.util.Scanner;

public class Iterativos5 {
    public static void main(String[] args) {
        int a, suma;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un numero para sumar sus digitos: ");
        a = in.nextInt();
        suma = 0;
        while(a>0){
            suma = suma + (a%10);
            a = a/10;
        }
        System.out.println("La suma de sus digitos es "+suma);
    }
}
