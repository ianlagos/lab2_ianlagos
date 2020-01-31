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
                    
                    cont++;
                    break;
                case 2:
                    System.out.println("que posicion de pesonaje desea modificar");
                    int perso_mod = leer.nextInt();
                    modificacion(perso_mod, listaPersonajes);
                    break;
                case 3:
                    listaPersonajes.add(cont + 1, "mago");
                    listaPersonajes.add(cont + 1, "juan");
                    listaPersonajes.add(cont + 1, "humano");
                    listaPersonajes.add(cont + 1, 1.68);
                    listaPersonajes.add(cont + 1, 150);
                    listaPersonajes.add(cont + 1, 88);
                    listaPersonajes.add(cont + 1, "vende chiles");
                    listaPersonajes.add(cont + 1, "norfair");
                    listaPersonajes.add(cont + 1, "brinstat");
                    //
                    listaPersonajes.add(cont + 2, "picaro");
                    listaPersonajes.add(cont + 2, "ricardo");
                    listaPersonajes.add(cont + 2, "enano");
                    listaPersonajes.add(cont + 2, 2.58);
                    listaPersonajes.add(cont + 2, 350);
                    listaPersonajes.add(cont + 2, 185);
                    listaPersonajes.add(cont + 2, "YES");
                    listaPersonajes.add(cont + 2, "zebs");
                    listaPersonajes.add(cont + 2, "maridia");
                    //
                    for (int i = 0; i < listaPersonajes.size(); i++) {
                        System.out.println("personaje" + i);
                        for (Object o : listaPersonajes) {
                            System.out.println(o);
                        }
                    }

                    break;
                case 4:
                    System.out.println("Que personaje desea eliminar");
                    int elim = leer.nextInt();
                    listaPersonajes.remove(elim);
                    break;
                case 5:

                    combat(listaPersonajes);
                    break;
                default:
                    resp = 'n';
            }
        }

    }

    public static void combat(ArrayList lista) {
        int pos = 1 + rng.nextInt(4);
        int pos2 = 1 + rng.nextInt(4);
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

        if (lista(pos)= "mediano") {
            return hp = 50 + rng.nextInt(60);
        } else if (( lista.get(pos)).getClase() == "enano") {
            return hp = 80 + rng.nextInt(100);
        } else if (((Personaje) lista.get(pos)).getClase() == "elfo") {
            return hp = 50 + rng.nextInt(70);
        } else {
            return hp = 40 + rng.nextInt(75);
        }
    }

    public static int AC(int pos, ArrayList lista) {
        int ac = 0;
        if (((Personaje) lista.get(pos)).getRaza() == "clerigo") {
            return ac = 40;
        } else if (((Personaje) lista.get(pos)).getRaza() == "barbaro") {
            return ac = 65;
        } else if (((Personaje) lista.get(pos)).getRaza() == "mago") {
            return ac = 20;
        } else {
            return ac = 50;
        }
    }

    public static void CS() {

    }

    public static void DM() {

    }

    public static void modificacion(int mod, ArrayList listaPersonajes) {
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
        listaPersonajes.add(mod, clase);
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        listaPersonajes.add(mod, nombre);
        //
        System.out.println("mediano, enano, elfo o humano");
        System.out.print("ingrese raza: ");

        String raza = leer.next();
        if (raza != "mediano" || raza != "enano" || raza != "elgo" || raza != "humano") {
            System.out.println("no puede ser de esa raza");
            System.out.print("ingrese raza:");
            raza = leer.next();
        }
        listaPersonajes.add(mod, raza);
        System.out.println("ingrese estatura: ");
        double estatura = leer.nextDouble();
        listaPersonajes.add(mod, estatura);
        //
        System.out.println("ingrese peso: ");
        double peso = leer.nextDouble();
        listaPersonajes.add(mod, peso);
        //
        System.out.println("ingrese edad: ");
        int edad = leer.nextInt();
        listaPersonajes.add(mod, edad);
        //
        System.out.println("ingrese descripcion: ");
        String descrip = leer.next();
        listaPersonajes.add(mod, descrip);
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
        listaPersonajes.add(mod, nacion);
    }
}
