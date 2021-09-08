package Arrays;
import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        int sm = 0;
        int dorado = 0;
        int vip = 0;
        int i;
        Scanner in = new Scanner(System.in);

        System.out.println("Entrega de Premios ARGENMUSIC AWARDS 2021");
        System.out.print("Ingrese la cantidad de Partricipantes: ");
        int cant = in.nextInt();
        String[] artists = new String[cant];
        int[] cant_dv = new int[cant];
        String[] menciones = new String[cant];

        for (i = 0; i < artists.length; i++) {
            System.out.print("Ingrese el Artista N°"+(i + 1)+": ");
            artists[i] = in.next();
            System.out.print("Ingrese la cantidad de discos vendidos pos "+(i + 1)+": ");
            cant_dv[i] = in.nextInt();
        }
        for (i = 0 ; i < artists.length ; i++) {
            if (cant_dv[i] < 30000) {
                menciones[i] = "esta Sin Mencion";
                sm++;
            } else if ((cant_dv[i] > 30000) && (cant_dv[i] < 60000)) {
                menciones[i] = "lleva la Mencion DORADA";
                dorado++;
            } else {
                menciones[i] = "lleva la Mencion VIP";
                vip++;
            }
        }
        System.out.println("Los participantes son");
        for (i = 0; i < artists.length; i++) {
            System.out.print(" "+artists[i]);
        }
        System.out.println();
        for (i = 0 ; i < artists.length ; i++)
        {
        System.out.println("El Artista "+artists[i]+" "+menciones[i]+" con "+cant_dv[i]+" discos vendidos");
        }
        System.out.println("los Participantes Sin Menciones son "+sm);
        System.out.println("Los Participantes con Mencion DDORADA son "+dorado);
        System.out.println("Los Participantes con Mencion VIP son "+vip);
    }
}