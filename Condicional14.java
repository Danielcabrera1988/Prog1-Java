package Condicionales;

import java.util.Scanner;

public class Condicional14 {
    public static void main(String[] args) {
        int primero, segundo, numero, suma;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese un numero de 2 cifras: ");
        numero = in.nextInt();

         primero =  numero/10;
         segundo = numero%10;
         suma = primero + segundo;

         if (suma % 3 == 0) {
             System.out.println("Es multiplo de 3");
             System.out.println("Y la suma de "+primero+" + "+segundo+" es "+suma);
         }
         else {
             System.out.println("los numeros son " + primero + " y " + segundo);
             System.out.println("Y la suma no es multiplo de 3");
         }
    }
}
