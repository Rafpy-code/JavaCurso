package org.ramonfpy.ejemplos.set;

import org.ramonfpy.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        System.out.println("Implemetando el método Comparable<Alumno>, hashCode y equals");
        //Con TreeSet hay que implementar en la clase Alumno el Comparable<Alumno>, para poder ordenar
        Set<Alumno> hashSet = new HashSet<>(); //Con HashSet no necesita implementar el Comparable.
        //Si hay nombres o notas repetidas, no las aceptará.
        hashSet.add(new Alumno("Dulce", 10));
        hashSet.add(new Alumno("Jeydan", 9));
        hashSet.add(new Alumno("Ramón", 5));
        hashSet.add(new Alumno("Francisco", 7));
        hashSet.add(new Alumno("Dejado", 3));
        hashSet.add(new Alumno("Ramón", 9.99)); //Si tuviese la misma nota 5, ya no lo mostraría.


        System.out.println("treeSet = " + hashSet);
    }
}
