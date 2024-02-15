package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        System.out.println("List<Usuario> usuarioList = new ArrayList<>();");

        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(new Usuario("Ram", "On"));
        usuarioList.add(new Usuario("Dulce", "Cisco"));
        usuarioList.add(new Usuario("Port", "Alanza"));
        usuarioList.add(new Usuario("Jeydan", "Ovi"));
        usuarioList.add(new Usuario("Dulce", "Ovi"));

        /*usuarioList.stream()
                .map(usuario -> usuario.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(usuario.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("dulce".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .forEach(System.out::println); //Imprime el nombre coincidente.*/

        //Cambiamos a Stream para usar todas sus funciones.
        Stream<String> nombres = usuarioList.stream()
                .map(usuario -> usuario.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(usuario.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("dulce".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println); //Imprime el nombre coincidente.

        System.out.println("Existen " + nombres.count() + " coincidencias.");
    }
}
