package org.ramonfpy.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinctReduceInteger {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream<Integer> reduce(), si hay nombres duplicados no los imprime.");

        Stream<Integer> numeros = Stream
                .of(5, 7, 3, 6, 13);
                
        //int resultado = numeros.reduce(0, (a, b) -> a + b);
        //int resultado = numeros.reduce(0, (a, b) -> Integer.sum(a + b));
        int resultado = numeros.reduce(0, Integer::sum); //Referencia del método.

        System.out.println("La sumatoria de los números da -> " + resultado);

    }
}
