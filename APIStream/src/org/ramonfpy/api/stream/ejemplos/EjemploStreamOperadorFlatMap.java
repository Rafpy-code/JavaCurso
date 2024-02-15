package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorFlatMap {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream flatMap(usuario->{})");
        System.out.println("\tUsuarios");

        Stream<Usuario> nombres = Stream
                .of("Jeydan Ortiz", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(usuario -> {
                    if (usuario.getNombre().equals("Jeydan")) {
                        return Stream.of(usuario);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        System.out.println();
        //nombres.forEach(System.out::println); //Usando el toString.
        System.out.println("Cuántos nombres repetidos existen? -> " + nombres.count());
    }
}
