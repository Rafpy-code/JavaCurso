package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamOperadorMapUsuario {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Stream para agregar los nombres a la clase Usuario");
        Stream<Usuario> nombres = Stream
                .of("Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(usuario -> System.out.println(usuario.getNombre()))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                        });

        System.out.println("listaNombres del Stream");
        List<Usuario> listaNombres = nombres.collect(Collectors.toList());
        //listaNombres.forEach(usuario -> System.out.println(usuario.getNombre() + " " + usuario.getApellido()));
        listaNombres.forEach(System.out::println); //Usando el toString.
    }
}
