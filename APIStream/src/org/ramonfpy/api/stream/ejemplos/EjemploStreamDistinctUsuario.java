package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Ejemplo Stream Distinct Usuario");
        Stream<Usuario> nombres = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Dulce Castor", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza", "Dulce Castor")
                //.distinct() //Es un operador intermedio.
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct(); //Debemos implementar en la clase usuario  el método equals.

        nombres.forEach(System.out::println);
    }
}
