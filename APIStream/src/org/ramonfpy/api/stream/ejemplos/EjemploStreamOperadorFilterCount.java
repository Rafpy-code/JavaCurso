package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterCount {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream .peek(System.out::println)\n" +
                "                .count();");
        long count = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println("Existen " + count + " usuarios"); //Imprime el primer objeto coincidente.

    }
}
