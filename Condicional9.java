package Condicionales;

import java.util.Scanner;

public class Condicional9 {
    public static void main(String[] args) {
        int hora, sueldoxh, sueldo, maxhoras = 40, horasx2 = 8, horasex;
        char i = '$';
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        hora = in.nextInt();
        System.out.print("\nIngrese el sueldo por hora: ");
        sueldoxh = in.nextInt();

        if (hora>=maxhoras){
            System.out.print("\nIngrese las horas extras trabajadas: ");
            horasex = in.nextInt();
            if (horasex<=horasx2){
                sueldo = (hora*sueldoxh) + (horasex*sueldoxh*2);
            }
            else{
                sueldo = (hora*sueldoxh) + (horasex*sueldoxh*3);
            }
            System.out.println("El sueldo a cobrar es de "+i+sueldo);
        }
        else{
            sueldo = hora*sueldoxh;
            System.out.println("El total a cobrar es de "+i+sueldo);
        }
    }
}

