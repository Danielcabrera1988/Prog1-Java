package Condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, prom;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");

        System.out.print("Ingrese la primer nota: ");
        nota1 = in.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = in.nextFloat();
        System.out.print("Ingrese la tercer nota: ");
        nota3 = in.nextFloat();

        prom = (nota1+nota2+nota3)/3;
        System.out.println("El Promedio de sus notas es "+df.format(prom));
        if (prom>=60)
            System.out.println("El Alumno fue aprobado");
        else
            System.out.println("El alumno no fue aprobado");
    }
}