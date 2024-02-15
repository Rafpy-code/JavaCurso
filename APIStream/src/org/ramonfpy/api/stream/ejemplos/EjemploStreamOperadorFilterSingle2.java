package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterSingle2 {

    public static void main(String[] args) {
/*
        System.out.println();
        System.out.println("Stream .filter(usu -> usu.getId().equals(2))\n" +
                "                .findFirst().get();;");
        Usuario usuario = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usu -> usu.getId().equals(2))
                .findFirst().get(); //Operador terminal

        System.out.println(usuario); //Imprime el primer objeto coincidente.

 */
        System.out.println();
        System.out.println("Stream peek(sout).filter(usu -> usu.getId().equals(2))\n" +
                "                .findFirst().get();;");
        Usuario usuario = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(usu -> usu.getId().equals(4))
                .findFirst().orElseGet(() -> new Usuario("No", "Esxiste")); //Operador terminal

        System.out.println(usuario); //Imprime el primer objeto coincidente.
        System.out.println("Va imprimiendo con el peek(), luego vuelve a imprimir la coincidencia y sale.");
    }
}
