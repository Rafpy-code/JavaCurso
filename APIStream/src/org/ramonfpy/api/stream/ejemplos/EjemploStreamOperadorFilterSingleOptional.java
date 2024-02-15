package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterSingleOptional {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream Filter(\"nombre\");");
        Stream<Usuario> nombres = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                        .filter(usuario -> usuario.getNombre().equals("Ramónw"))
                                .peek(System.out::println);

        System.out.println();
        System.out.println("Optional<Usuario> usuario = nombres.findFirst();");
        Optional<Usuario> usuario = nombres.findFirst();
        //listaNombres.forEach(usuario -> System.out.println(usuario.getNombre() + " " + usuario.getApellido()));

        //System.out.println("El usuario: " + usuario.orElse(new Usuario("No", "existe")));

        //System.out.println("El usuario: " + usuario.orElseGet(() -> new Usuario("No", "existe")));

        if (usuario.isPresent()) {
            System.out.println("El usuario: " + usuario.get().getNombre());
        } else {
            System.out.println("No se encontró el objeto Usuario.");
        }
    }
}
