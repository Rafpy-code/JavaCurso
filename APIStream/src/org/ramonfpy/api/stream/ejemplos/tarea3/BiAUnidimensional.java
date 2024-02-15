package org.ramonfpy.api.stream.ejemplos.tarea3;

import java.util.Arrays;

import java.util.List;

import java.util.function.Function;
import java.util.stream.Collectors;

public class BiAUnidimensional {
    public static void main(String[] args) {
        /*
        El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
        Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
        Por ejemplo, para el arreglo:
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        debería quedar: {"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
        */

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
/*
import java.util.Set;
import java.util.HashSet;
        Set<String> uniqueValues = new HashSet<>();
        for (String[] arr : lenguajes) {
            for (String lenguaje : arr) {
                if (uniqueValues.add(lenguaje)) {
                    System.out.println(lenguaje);
                }
            }
        }
*/
        System.out.println("Lenguajes");
        Arrays.stream(lenguajes)
                .flatMap(arreglo -> Arrays.stream(arreglo))
                //.peek(System.out::println)
                .distinct()
                //.forEach(lenguaje -> System.out.println(lenguaje));
                .forEach(System.out::println);


        System.out.println("------------------------------------------");
        System.out.println("Usando Function<String[][], List<String>> ");
        Function<String[][], List<String>> flatten = arr ->  Arrays.stream(arr).flatMap(a -> Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());

        flatten.apply(lenguajes).forEach(e -> System.out.println(e));
    }
}
