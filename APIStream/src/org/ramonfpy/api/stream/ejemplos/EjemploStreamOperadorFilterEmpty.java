package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterEmpty {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream Filter(String::isEmpty);");
        long count = Stream
                .of("", "Ramón Portalanza", "", "Dulce Castor", "Jeydan Portalanza")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println();
        System.out.println("Nombres vacios -> " + count);

    }
}
