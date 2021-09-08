package Condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        float total, descuento, pd;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");

        System.out.print("Ingrese el total de la compra: ");
        total = in.nextFloat();
        descuento = 0.8f;
        if (total>1000) {
            pd = total * descuento;
            System.out.println("\nEl precio a abonar es de "+df.format(pd));
        }
        else {
            System.out.println("\nEl precio a abonar es de "+df.format(total));
        }
    }
}
