package Arrays;

import java.util.Scanner;

public class problema4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] letrasDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int dni, resto;

        System.out.print("Ingrese su DNI sin puntos o comas: ");
        dni = in.nextInt();
        resto = dni%23;
        System.out.println("Su Letra es: "+letrasDNI[resto]);
        System.out.println("Su DNI completo es "+letrasDNI[resto]+dni);
    }
}
