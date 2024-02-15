package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilter {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream Filter(\"nombre\");");
        Stream<Usuario> nombres = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .filter(usuario -> usuario.getNombre().equals("Ramón"))
                                .peek(System.out::println);

        System.out.println();
        System.out.println(" List<Usuario> listaNombres = nombres.collect(Collectors.toList());");
        List<Usuario> listaNombres = nombres.collect(Collectors.toList());
        //listaNombres.forEach(usuario -> System.out.println(usuario.getNombre() + " " + usuario.getApellido()));
        listaNombres.forEach(System.out::println); //Usando el toString.
    }
}
