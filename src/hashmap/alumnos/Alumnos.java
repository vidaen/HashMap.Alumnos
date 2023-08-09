/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap.alumnos;

import java.util.HashSet;
import java.util.Set;


public class Alumnos {
   private int legajo;
   private String nombre;
   private String apellido;
   private int anio;
    
   
   public Alumnos() {
    }

    public Alumnos(int legajo, String nombre, String apellido, int anio) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anio = anio;
    }
    

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnio() {
        return anio;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", anio=" + anio + '}';
    }
   
   
}
