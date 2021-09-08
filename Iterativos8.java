package Iterativos;

import java.util.Scanner;

public class Iterativo8 {
    public static void main(String[] args) {
        int codigo = 1024, contras = 4567;
        int cod, cont, it=0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Ingrese su codigo de acceso: ");
            cod = in.nextInt();
            System.out.print("Ingrese su contraseña: ");
            cont = in.nextInt();
            while ((cod == codigo) && (cont == contras)) {
                System.out.println("Access Granted");
                return;
            }
            it++;
            if (it>=3){
                System.out.println("Usuario bloqueado");
            }
            else{
                System.out.println("Codigo y/o Contraseña incorrecto/s, por favor reintente");
            }
        }
        while (it < 3);
    }
}
