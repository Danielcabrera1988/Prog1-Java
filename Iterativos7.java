package Iterativos;

import java.util.Scanner;

public class Iterativos7 {
    public static void main(String[] args) {
        char sexo, carrera;
        char carrera1 = 'a';
        char carrera2 = 'b';
        char carrera3 = 'c';
        char acumA=0;
        char acumB=0;
        char acumC=0;
        char cad = 'm';
        int fin ;
        int edadm, promA=0, promB=0, promC=0;
        int acumM = 0;
        int acumF = 0;
        int acumedadm = 0;

        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Elija su carrera A, B o C: ");
            carrera = in.next().charAt(0);
            if (Character.toLowerCase(carrera) == carrera1){
                System.out.print("Ingrese el Sexo M o F: ");
                sexo = in.next().charAt(0);
                if (Character.toLowerCase(sexo) == cad){
                    System.out.print("Ingrese la edad: ");
                    edadm = in.nextInt();
                    acumedadm+=edadm;
                    acumM=acumM+1;
                    acumA++;
                }
                else{
                    acumF=acumF+1;
                }
                promA = acumedadm/acumA;
            }
            else if (Character.toLowerCase(carrera) == carrera2){
                    System.out.print("Ingrese el Sexo M o F: ");
                    sexo = in.next().charAt(0);
                    if (Character.toLowerCase(sexo) == cad){
                        System.out.print("Ingrese la edad: ");
                        edadm = in.nextInt();
                        acumedadm+=edadm;
                        acumM=acumM+1;
                        acumB++;
                    }
                     else{
                         acumF++;
                    }
                promB = acumedadm/acumB;
            }
            else if (Character.toLowerCase(carrera) == carrera3){
                System.out.print("Ingrese el Sexo M o F: ");
                sexo = in.next().charAt(0);
                if (Character.toLowerCase(sexo) == cad){
                    System.out.print("Ingrese la edad: ");
                    edadm = in.nextInt();
                    acumedadm+=edadm;
                    acumM=acumM+1;
                    acumC++;
                }
                else{
                    acumF++;
                }
                promC = acumedadm/acumC;
            }
            System.out.print("Desea agregar otro alumno? <1/0>: ");
            fin = in.nextInt();
        }
        while(fin != 0);

        if (promA > promB && promA > promC){
            System.out.println("La carrera A es la de menor promedio de edad de hombres");
        }
        else if (promB > promA && promB > promC){
            System.out.println("La carrera B es la de menor promedio de edad de hombres");
        }
        else if (promC > promA && promC > promB){
            System.out.println("La carrera C es la de menor promedio de edad de hombres");
        }
        else{
            System.out.println("todas las carreras tienen el mismo promedio de edad en hombres");
        }
    }
}