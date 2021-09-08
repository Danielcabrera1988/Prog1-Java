package Condicionales;

import java.util.Scanner;

public class Condicional15 {
    public static void main(String[] args) {
        int n1, n2, p1, p2, suma;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de Conejos Blancos: ");
        n1 = in.nextInt();
        System.out.print("Ingrese el precio de los Conejos Blancos: ");
        p1 = in.nextInt();
        System.out.print("Ingrese la cantidad de Conejos Negros: ");
        n2 = in.nextInt();
        System.out.print("Ingrese el precio de los Conejos Negros: ");
        p2 = in.nextInt();
        suma = n1*p1 + p2*n2;


        if (n1>n2){
            System.out.println("Se vendieron mas Conejos Blancos");
        }
        else if (n2>n1){
            System.out.println("Se vendieron mas Conejos Negros");
        }
        else{
            System.out.println("Se vendieron igual cantidad de Conejos Blancos y Negros");
        }
        System.out.println("El total de la venta de Conejos es "+suma);
    }
}
