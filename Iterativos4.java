package Iterativos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Iterativos4 {
    public static void main(String[] args) {
        float a, suma, prom, cont;
        float lim_menor = 0.001f;
        float lim_mayor = 0.100f;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        suma = 0;
        cont = 0;
        do {
            System.out.print("Ingrese valores comprendidos entre 0,001 y 0,100: ");
            a = in.nextFloat();
            if (a>=lim_menor && a<=lim_mayor)
                suma+=a;
                cont++;
        }
        while ((a>=lim_menor) && (a<=lim_mayor));
        prom = suma/cont;
        System.out.println("La suma de los valores agregados es: "+df.format(suma));
        System.out.println("El promedio de los valores agregados es: "+df.format(prom));
    }
}
