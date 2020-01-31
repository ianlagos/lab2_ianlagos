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
        int cont=0;
        ArrayList listaPersonajes = new ArrayList();
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
                    if (cont>4) {
                        System.out.println("no se pueden mas personajes");
                        break;
                    }
                    System.out.println("clerigo, barbaro, mago o picaro");
                    System.out.print("Eliga su Clase: ");
                    leer.next();
                    String clase = leer.nextLine();
                    
                    if (clase != "clerigo" || clase != "barbaro" || clase != "mago" || clase != "picaro") {
                        System.out.println("usted no puede elejir esa clase");
                        System.out.print("Eliga su Clase: ");
                        clase = leer.next();
                    }
                    //
                    listaPersonajes.add(cont, clase);
                    System.out.println("Ingrese su nombre");
                    String nombre = leer.next();
                    listaPersonajes.add(cont, nombre);
                    //
                    System.out.println("mediano, enano, elfo o humano");
                    System.out.print("ingrese raza: ");
                    
                    String raza = leer.next();
                    if (raza != "mediano" || raza != "enano" || raza != "elgo" || raza != "humano") {
                        System.out.println("no puede ser de esa raza");
                        System.out.print("ingrese raza:");
                        raza = leer.next();
                    }
                    listaPersonajes.add(cont, raza);
                    System.out.println("ingrese estatura: ");
                    double estatura = leer.nextDouble();
                    listaPersonajes.add(cont, estatura);
                    //
                    System.out.println("ingrese peso: ");
                    double peso = leer.nextDouble();
                    listaPersonajes.add(cont, peso);
                    //
                    System.out.println("ingrese edad: ");
                    int edad = leer.nextInt();
                    listaPersonajes.add(cont, edad);
                    //
                    System.out.println("ingrese descripcion: ");
                    String descrip = leer.next();
                    listaPersonajes.add(cont, descrip);
                    //
                    System.out.println("norfair ,brinstar , maridia, zebes o crateria");
                    System.out.print("ingrese nacionalidad: ");
                    String nacion = leer.next();
                    //
                    if (nacion != "norfair" || nacion != "brinstat" || nacion != "maridia" || nacion != "zebes" || nacion != "crateria") {
                        System.out.println("no puede ser de esa region: ");
                        System.out.print("ingrese nacionalidad: ");
                        nacion = leer.next();
                    }
                    //
                    listaPersonajes.add(cont, nacion);
                    
                    cont++;
                    break;
                case 2:

                    break;
                case 3:
                    for (Object o : listaPersonajes) {
                        System.out.println(o);
                    }
                    break;
                case 4:
                    System.out.println("Que personaje desea eliminar");
                    int elim = leer.nextInt();
                    listaPersonajes.remove(elim);
                    break;
                case 5:

                    break;
                default:
                    resp = 'n';
            }
        }

    }

    public static void HP(ArrayList list) {
        
    }
    public static void AC(){
        
    }
    public static void CS(){
        
    }
    public static void DM(){
        
    }
}
