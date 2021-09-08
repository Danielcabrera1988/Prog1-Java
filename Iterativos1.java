package Iterativos;

import java.util.Scanner;

public class Iterativos1 {
    public static void main(String[] args) {
        int s, v;
        Scanner in = new Scanner(System.in);

        int acums = 0;
        int acumv = 0;
        int doble = 0;
        int dif = 0;
        do {

            System.out.print("Ingrese un valor para 'S': ");
            s = in.nextInt();
            System.out.print("Ingrese un valor para 'V': ");
            v = in.nextInt();

            if (s != 0 && s % 2 == 0)
                acums++;

            if(v != 0 && v % 2 == 0)
                acumv++;

            if (acums > acumv)
                dif = acums - acumv;

            if (s !=0 && v != 0)
                if (s == (v*2))
                doble++;

            System.out.println("Los pares S son en "+dif+" veces mayores que los pares V");
            System.out.println("Cantidad de pares de S son: "+acums);
            System.out.println("Cantidad de pares de V son: "+acumv);
            System.out.println("El par S es "+doble+" veces doble que V");
        }
        while (s != 0 && v != 0);
    }
}
