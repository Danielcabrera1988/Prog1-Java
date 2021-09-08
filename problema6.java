package Arrays;
import java.util.Scanner;

public class problema6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cant, select, i, venta, compra, cod;
        char fin;
        System.out.print("Ingrese la cantida de articulos a Codificar: ");
        cant = in.nextInt();

        int[] Art = new int[cant];

        for (i=0 ; i<Art.length; i++) {
            System.out.print("Ingrese las cantidades de los Art del cod "+i+": ");
            Art[i] = in.nextInt();
        }
        do {

        System.out.println("** Ingrese la Operacion a realizar **");
        System.out.println("** 1 ** Ventas ");
        System.out.println("** 2 ** Compras ");
        select = in.nextInt();

            switch (select) {
                case 1 -> {
                    System.out.println("Ha seleccionado VENTAS");
                    System.out.print("Ingrese el codigo del art: ");
                    cod = in.nextInt();
                    System.out.print("Ingrese la cantidad a vender: ");
                    venta = in.nextInt();
                    if (venta > Art[cod]) {
                        System.out.println("Stock Insuficiente");
                    }
                    else {
                        Art[cod] = Art[cod] - venta;
                        System.out.println("Venta Exitosa");
                    }
                    System.out.println("El Stock restante es " + Art[cod]);
                }
                case 2 -> {
                    System.out.println("Ha seleccionado COMPRAS");
                    System.out.print("Ingrese el codigo del art: ");
                    cod = in.nextInt();
                    System.out.println("El Stock del Art es "+Art[cod]);
                    System.out.print("Ingrese la cantidad a comprar: ");
                    compra = in.nextInt();
                    Art[cod] = Art[cod] + compra;
                    System.out.println("El Stock nuevo es de " + Art[cod]);
                }
                default -> System.out.println("Opcion incorrecta");
            }
            System.out.print("Desea volver a elegir su opcion? <s/n>: ");
            fin = in.next().charAt(0);
        }
        while (fin != 'n');
    }
}
