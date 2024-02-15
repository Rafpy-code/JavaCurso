package org.ramonfpy.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String[] args) {

        System.out.println("Stream.of(nombres)");
        Stream<String> nombres1 = Stream.of("Ramón", "Francisco", "Portalanza", "Yerovi");
        //nombres1.forEach(e -> System.out.println(e));
        nombres1.forEach(System.out::println);

        System.out.println();
        System.out.println("Arrays.stream(arreglo);");
        String[] arreglo = {"Ramón", "Francisco", "Portalanza", "Yerovi"};
        Stream<String> nombres2 = Arrays.stream(arreglo);
        //nombres2.forEach(nombre -> System.out.println(nombre));
        nombres2.forEach(System.out::println);

        System.out.println();
        System.out.println("Stream.builder().add(\"nombre\").build()");

        Stream<String> nombres3 = Stream.<String>builder().add("Ramón")
                                                          .add("Francisco")
                                                          .add("Portalanza")
                                                          .add("Yerovi")
                                                          .build();
        //nombres3.forEach(nombre -> System.out.println(nombre));
        nombres3.forEach(System.out::println);


        System.out.println();
        System.out.println("listaNombres = new ArrayList<>();");
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Ramón");
        listaNombres.add("Yerovi");
        listaNombres.add("Portalanza");
        listaNombres.add("Francisco");

        Stream<String> nombres4 = listaNombres.stream();
        nombres4.forEach(System.out::println);

        System.out.println();
        System.out.println("lO ANTERIOR SE PUEDE SIMPLIFICAR DE ESTÁ MANERA: listaNombres.stream().forEach(System.out::println);");
        listaNombres.stream().forEach(System.out::println);
    }
}
