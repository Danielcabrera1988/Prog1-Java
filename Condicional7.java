package Condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicional7 {
    public static void main(String[] args) {

        double d1 = 0.9f;
        double d2 = 0.8f;
        int clave;
        float plibro;
        String nombre;
        char i = '$';
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");
        System.out.print("Ingrese el nombre del Art. :");
        nombre = in.nextLine();
        System.out.print("Ingrese el precio del libro: ");
        plibro = in.nextFloat();

        System.out.print("\nIngrese la clave de descuento: ");
        clave = in.nextInt();

        switch (clave){
            case 1 -> {
                System.out.println("El Art "+nombre+" cuesta "+i+plibro);
                plibro = (float) (plibro*d1);
                System.out.print("Y con el Cod 1 el precio del libro es "+df.format(plibro));
            }
            case 2 ->{
                System.out.println("El Art "+nombre+" cuesta "+i+plibro);
                plibro = (float) (plibro*d2);
                System.out.println("Y con el Cod 2 el precio del libro es "+df.format(plibro));
            }
        }
    }
}
