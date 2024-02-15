package org.ramonfpy.optional.ejemplo;


import org.ramonfpy.optional.ejemplo.models.Computador;
import org.ramonfpy.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.ramonfpy.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String nombreBuscado = "amd";

        /*//Computador pc = repositorio.filtrar(nombreBuscado);
        if (pc != null) {
            System.out.println("pc buscado = " + pc.getNombre());
        } else {
            System.out.println("No se encuentra ningún registro de: " + nombreBuscado);
        }*/

        /*//Implementando el Optional.
        Optional<Computador> pc = repositorio.filtrar(nombreBuscado);
        if (pc.isPresent()) {
            System.out.println("pc buscado = " + pc.get());
        } else {
            System.out.println("No se encuentra ningún registro de: " + nombreBuscado);
        }*/

        repositorio.filtrar(nombreBuscado).ifPresentOrElse(System.out::println, () -> System.out.println("No se encuentra ningún registro de: " + nombreBuscado));
    }
}
