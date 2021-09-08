package Condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condicional10 {
    public static void main(String[] args) {
        int monto, promo = 50000;
        char i = '$';
        float cuota;
        float a = 0.02f;
        float b = 0.03f;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");

        System.out.print("Ingrese el monto a solicitar: ");
        monto = in.nextInt();

        if (monto < promo){
            cuota = monto*b;
        }
        else{
            cuota = monto*a;
        }
        System.out.println("El valor de la cuota es "+i+df.format(cuota));
    }
}
