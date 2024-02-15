package org.ramonfpy.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        System.out.println("Ejemplo TreeSet(), es ordenado en forma ascendente");
        //Set<String> treeSet = new TreeSet<>();
        //Formas de ordenar usando la firma de métodos.
        Set<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                //Ascendente a.compareTo(b) o descendente;
                return b.compareTo(a);
            }
        });
        /*Expresión lambda
        Set<String> treeSet = new TreeSet<>(a, b -> {
                return b.compareTo(a);
             });
        */

        treeSet.add("uno");
        treeSet.add("dos");
        treeSet.add("tres");
        treeSet.add("tres");
        treeSet.add("cuatro");
        treeSet.add("cinco");

        System.out.println("treeSet = " + treeSet);

        //Set<Integer> numeros = new TreeSet<>();
        //Set<Integer> numeros = new TreeSet<>((a, b) -> b.compareTo(a));
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(6);
        numeros.add(3);
        numeros.add(1);
        numeros.add(6);
        numeros.add(2);
        numeros.add(4);

        System.out.println("numeros = " + numeros);
    }
}
