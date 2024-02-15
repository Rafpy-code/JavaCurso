package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamOperadorFilterAnyMatch {

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
                "                 .anyMatch(usu -> usu.getId().equals(4));");
        Boolean existeElUsuario = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(usu -> usu.getId().equals(4));

        System.out.println("Cuando encuentre la coincidencia del peek, Existe El Usuario? -> " + existeElUsuario); //Imprime el primer objeto coincidente.


        System.out.println();
        System.out.println("anyMatch vs iteración con el for");
        System.out.println("List<Usuario> listaUsuarios = Arrays.asList(new Usuario(\"Ramon\", \"Portalanza\"),");

        List<Usuario> listaUsuarios = Arrays.asList(new Usuario("Ramon", "Portalanza"),
                new Usuario("Ramon", "Portalanza"),
                new Usuario("Ramon", "Yerovi"),
                new Usuario("Fran", "Cisco"),
                new Usuario("Port", "Alanza"));

        Boolean existeUsuario = false;
        for (Usuario u : listaUsuarios)  {
            System.out.println(u);
            if (u.getId().equals(8)) {
                System.out.println("si existe es la última coincidencia y sale;");
                existeUsuario = true;
                break;
            }
        }
        System.out.println(" existe? " + existeUsuario);
    }
}
