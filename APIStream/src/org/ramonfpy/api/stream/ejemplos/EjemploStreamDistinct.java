package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream distinct, si hay nombres duplicados no los imprime.");

        /*Stream<String> nombres = Stream
                .of("Ramón Portalanza", "Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Ramón Portalanza", "Jeydan Portalanza")
                .distinct();

                nombres.foreach(System.out::println);*/

        Stream.of("Ramón Portalanza", "Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Ramón Portalanza", "Jeydan Portalanza")
                .distinct()
                .forEach(System.out::println);

    }
}
