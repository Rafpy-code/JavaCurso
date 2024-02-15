package org.ramonfpy.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinctReduce {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream distinct reduce(), si hay nombres duplicados no los imprime.");

        Stream<String> nombres = Stream
                .of("Ramón Portalanza", "Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Ramón Portalanza", "Jeydan Portalanza")
                .distinct();
                
                String resultado = nombres.reduce("Resultado concatenación", (a, b) -> a + ", " + b);

        System.out.println(resultado);

    }
}
