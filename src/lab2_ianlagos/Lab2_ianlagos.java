/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ianlagos;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_ianlagos {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        while (resp == 's' || resp == 's') {
            System.out.println("0 Salir");
            System.out.println("1 Crear Personaje");
            System.out.println("2 Modificar personaje");
            System.out.println("3 Ver atributos de personaje");
            System.out.println("4 Eliminar personaje");
            System.out.println("5 Combate");
            System.out.print("ingrese opcion");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    ArrayList listaClases = new ArrayList();
                    System.out.println("clérigo, bárbaro, mago o pícaro");
                    System.out.println("Eliga su Clase");
                    String clase = leer.next();
                    if (clase != "clerigo" || clase != "barbaro" || clase != "mago" || clase != "picaro") {
                        System.out.println("usted no puede elejir esa clase");
                        break;
                    } 
                    System.out.println("hola");
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    resp = 'n';
            }
        }

    }

}
