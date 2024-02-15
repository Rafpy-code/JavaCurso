package org.ramonfpy.api.stream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorMap {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream.of(nombres).map(); y después se imprime con un foreach.");
        Stream<String> nombres1 = Stream.of("Ramón", "Francisco", "Portalanza", "Yerovi")
                .map(nombre -> {
                    return nombre.toUpperCase();
                });
        nombres1.forEach(nombre -> System.out.println(nombre));

        System.out.println();
        System.out.println("Stream.of(nombres).peek().map(); y después se imprime con un foreach.");
        Stream<String> nombres2 = Stream
                .of("Ramón", "Francisco", "Portalanza", "Yerovi")
                .peek(nombre -> System.out.println(nombre))
                .map(nombre -> {
                    return nombre.toUpperCase();
                });
        nombres2.forEach(nombre -> System.out.println(nombre));


        System.out.println();
        System.out.println("Stream.of(nombres).map().forEach();");
        Stream.of("Ramón", "Francisco", "Portalanza", "Yerovi")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("List<String> listaNombres = nombres2.collect(Collectors.toList());");

        Stream<String> nombres3 = Stream
                .of("Ramón", "Francisco", "Portalanza", "Yerovi")
                .peek(nombre -> System.out.println(nombre))
                .map(nombre -> {
                    return nombre.toUpperCase();
                });

        System.out.println("listaNombres del Stream");
        List<String> listaNombres = nombres3.collect(Collectors.toList());

        listaNombres.forEach(System.out::println);
        System.out.println("repositorio en Github");
    }
}
