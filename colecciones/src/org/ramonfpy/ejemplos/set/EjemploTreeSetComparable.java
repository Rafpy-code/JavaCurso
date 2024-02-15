package org.ramonfpy.ejemplos.set;

import org.ramonfpy.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        System.out.println("Implemetando el método Comparable<Alumno> ordenado por nota ascendente");
        //Con TreeSet hay que implementar en la clase Alumno el Comparable<Alumno>, para poder ordenar
        Set <Alumno> treeSet = new TreeSet<>(); //Con HashSet no necesita implementar el Comparable.
        //Si hay nombres o notas repetidas, no las aceptará.
        treeSet.add(new Alumno("Dulce", 10));
        treeSet.add(new Alumno("Jeydan", 9));
        treeSet.add(new Alumno("Ramón", 5));
        treeSet.add(new Alumno("Francisco", 7));
        treeSet.add(new Alumno("Dejado", 3));

        System.out.println("treeSet = " + treeSet);

        System.out.println("Comparable lambda dentro del new TreeSet");
        Set <Alumno> treeSet1 = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
        //Si hay nombres o notas repetidas, no las aceptará.
        treeSet1.add(new Alumno("Dulce", 10));
        treeSet1.add(new Alumno("Jeydan", 9));
        treeSet1.add(new Alumno("Ramón", 5));
        treeSet1.add(new Alumno("Francisco", 7));
        treeSet1.add(new Alumno("Dejado", 3));

        System.out.println("treeSet = " + treeSet1);

        System.out.println("Comparable al vuelo dentro del new TreeSet Comparator.comparing(Alumno::getNombre)");
        Set <Alumno> treeSet2 = new TreeSet<>(Comparator.comparing(Alumno::getNombre));
        //Si hay nombres o notas repetidas, no las aceptará.
        treeSet2.add(new Alumno("Dulce", 10));
        treeSet2.add(new Alumno("Jeydan", 9));
        treeSet2.add(new Alumno("Ramón", 5));
        treeSet2.add(new Alumno("Francisco", 7));
        treeSet2.add(new Alumno("Dejado", 3));

        System.out.println("treeSet = " + treeSet2);

        System.out.println("Comparable al vuelo dentro del new TreeSet Comparator.reverseOrder()");
        Set <Alumno> treeSet3 = new TreeSet<>(Comparator.reverseOrder());
        //Si hay nombres o notas repetidas, no las aceptará.
        treeSet3.add(new Alumno("Dulce", 10));
        treeSet3.add(new Alumno("Jeydan", 9));
        treeSet3.add(new Alumno("Ramón", 5));
        treeSet3.add(new Alumno("Francisco", 7));
        treeSet3.add(new Alumno("Dejado", 3));

        System.out.println("treeSet = " + treeSet3);

        System.out.println("Comparable al vuelo dentro del new TreeSet Comparator.comparing(Alumno::getNota)");
        Set <Alumno> treeSet4 = new TreeSet<>(Comparator.comparing(Alumno::getNota));
        //Si hay nombres o notas repetidas, no las aceptará.
        treeSet4.add(new Alumno("Dulce", 10));
        treeSet4.add(new Alumno("Jeydan", 9));
        treeSet4.add(new Alumno("Ramón", 5));
        treeSet4.add(new Alumno("Francisco", 7));
        treeSet4.add(new Alumno("Dejado", 3));

        System.out.println("treeSet = " + treeSet4);
    }
}
