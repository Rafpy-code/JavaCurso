package org.ramonfpy.optional.ejemplo;


import org.ramonfpy.optional.ejemplo.models.Computador;
import org.ramonfpy.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.ramonfpy.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioOrElseThrow {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Usando orElseThrow()");
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String nombreBuscado1 = "amd"; //Si no lo encuentra lanza la excepción.
        Computador pc1 = repositorio.filtrar(nombreBuscado1).orElseThrow();
        System.out.println("pc = " + pc1);

        String nombreBuscado2 = "amd"; //Si no lo encuentra lanza la excepción.
        //Computador pc2 = repositorio.filtrar(nombreBuscado2).orElseThrow(() -> new IllegalStateException());
        Computador pc2 = repositorio.filtrar(nombreBuscado2).orElseThrow(IllegalStateException::new); //Referencia del método.
        System.out.println("pc2 = " + pc2);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();

        System.out.println("extension = " + extension);
    }
}
