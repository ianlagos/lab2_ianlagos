/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ianlagos;

import java.util.ArrayList;


public class Personaje {
    private String clase;
    private String raza;
    private String nacionalidad;
    private double estatura;
    private int años;
    private String descripcion;
    private double peso;
    private ArrayList lista = new ArrayList();

    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public Personaje(){
    }
    
    public Personaje(String clase, String raza, String nacionalidad, double estatura, int años, String descripcion) {
        this.clase = clase;
        this.raza = raza;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.años = años;
        this.descripcion = descripcion;
    }
    
    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}