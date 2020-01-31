/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ianlagos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_ianlagos {

    public static Scanner leer = new Scanner(System.in);
    public static Random rng = new Random();

    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        int cont = 0;

        ArrayList listaPersonajes = new ArrayList();
        ArrayList<Personaje> lista_buena = new ArrayList();
        lista_buena.add(new Personaje("mago", "humano", "norfair", 1.68, 88, "vende chiles", 150, "juan"));
        lista_buena.add(new Personaje("picaro", "enano", "zebes", 2.58, 350, "YES", 185, "Ricardo"));
        lista_buena.add(new Personaje("barbaro", "humano", "maridia", 1.50, 500, "es inutil", 158, "egroj"));
        lista_buena.add(new Personaje("clerigo", "elfo", "crateria", 1.70, 55, "es muy creido", 85, "pipe"));
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
                    if (cont > 4) {
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
                    String descrip = leer.nextLine();
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
                    lista_buena.add(new Personaje(clase, raza, nacion, estatura, edad, descrip, peso, nombre));
                    cont++;
                    break;
                case 2:
                    System.out.println("que posicion de pesonaje desea modificar");
                    int perso_mod = leer.nextInt();
                    modificacion(perso_mod, lista_buena);
                    break;
                case 3:

                    for (Object o : lista_buena) {
                        System.out.println(o);
                        System.out.println();
                    }

                    break;
                case 4:
                    System.out.println("Que personaje desea eliminar");
                    int elim = leer.nextInt();
                    lista_buena.remove(elim);
                    break;
                case 5:

                    break;
                default:
                    resp = 'n';
            }
        }

    }

    public static void combat(ArrayList lista) {
        int pos = 1 + rng.nextInt(3);
        int pos2 = 1 + rng.nextInt(3);
        int hp = HP(pos, lista);
        int hp2 = HP(pos2, lista);
        int ac = AC(pos, lista);
        int ac2 = AC(pos, lista);
        int cont = 1;
        while (hp > 0 && hp2 > 0) {

            if (cont == 1) {
                System.out.println("1= Atacar o 2=Defender");
                System.out.print("elija:");
                int atc_dfr = leer.nextInt();
                if (atc_dfr == 2) {
                    ac += 15;
                    ac2 += 15;
                } else {

                }

            } else {
                cont = 2;
            }
            ac -= 15;
            ac -= 15;
        }
    }

    public static int HP(int pos, ArrayList lista) {
        int hp = 0;

        if (((Personaje) lista.get(pos)).getClase().contains("mediano")) {
            return hp = 50 + rng.nextInt(60);
        } else if (((Personaje) lista.get(pos)).getClase().contains("enano")) {
            return hp = 80 + rng.nextInt(100);
        } else if (((Personaje) lista.get(pos)).getClase().contains("elfo")) {
            return hp = 50 + rng.nextInt(70);
        } else {
            return hp = 40 + rng.nextInt(75);
        }
    }

    public static int AC(int pos, ArrayList lista) {
        int ac = 0;
        if (((Personaje) lista.get(pos)).getRaza().contains("clerigo")) {
            return ac = 40;
        } else if (((Personaje) lista.get(pos)).getRaza().contains("barbaro")) {
            return ac = 65;
        } else if (((Personaje) lista.get(pos)).getRaza().contains("mago")) {
            return ac = 20;
        } else {
            return ac = 50;
        }
    }

    public static void CS() {

    }

    public static void DM() {

    }

    public static void modificacion(int mod, ArrayList lista_buena) {
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

        System.out.println("Ingrese su nombre");
        String nombre = leer.next();

        //
        System.out.println("mediano, enano, elfo o humano");
        System.out.print("ingrese raza: ");
        String raza = leer.next();
        if (raza != "mediano" || raza != "enano" || raza != "elgo" || raza != "humano") {
            System.out.println("no puede ser de esa raza");
            System.out.print("ingrese raza:");
            raza = leer.next();
        }

        System.out.println("ingrese estatura: ");
        double estatura = leer.nextDouble();
        //
        System.out.println("ingrese peso: ");
        double peso = leer.nextDouble();

        //
        System.out.println("ingrese edad: ");
        int edad = leer.nextInt();

        //
        System.out.println("ingrese descripcion: ");
        String descrip = leer.nextLine();
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

        lista_buena.add(new Personaje(clase, raza, nacion, estatura, edad, descrip, peso, nombre));
    }
}
