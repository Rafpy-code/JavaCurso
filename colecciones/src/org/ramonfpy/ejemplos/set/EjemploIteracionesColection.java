package org.ramonfpy.ejemplos.set;

import org.ramonfpy.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploIteracionesColection {
    public static void main(String[] args) {

        System.out.println("Iteraciones de las colections. Estas no admiten un for con indice como lo hacen los ArrayList.");
        //Con TreeSet hay que implementar en la clase Alumno el Comparable<Alumno>, para poder ordenar
        Set<Alumno> hashSet = new HashSet<>(); //Con HashSet no necesita implementar el Comparable.
        //Si hay nombres o notas repetidas, no las aceptará.
        hashSet.add(new Alumno("Dulce", 10));
        hashSet.add(new Alumno("Jeydan", 9));
        hashSet.add(new Alumno("Ramón", 5));
        hashSet.add(new Alumno("Francisco", 7));
        hashSet.add(new Alumno("Dejado", 3));
        hashSet.add(new Alumno("Ramón", 9.99)); //Si tuviese la misma nota 5, ya no lo mostraría.
        System.out.println("=====================Sout normal===================");
        System.out.println("treeSet = " + hashSet);

        System.out.println("=====================foreach===================");
        for (Alumno  a : hashSet) {
            System.out.print("Alumno = " + a);
        }

        System.out.println("=====================while e iterator===================");
        Iterator<Alumno> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Alumno alumno = iterator.next();
            System.out.println("Alumno = " + alumno.getNombre() + " -> " + alumno.getNota());
        }

        System.out.println("=====================Stream foreach===================");
        hashSet.forEach(System.out::print);
    }
}
