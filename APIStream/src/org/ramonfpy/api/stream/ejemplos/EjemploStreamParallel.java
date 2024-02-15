package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {

        System.out.println("operador paralell()");

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

        long t1 = System.currentTimeMillis();

        String resultado = usuarioList.stream()
                .parallel()
                .map(usuario -> usuario.toString().toUpperCase())
                //.peek(System.out::println)
                .peek(n -> {
                    System.out.println("Nombre del Thread -> " + Thread.currentThread().getName()
                    + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("dulce".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();

        System.out.println("Tiempo transcurrido en la ejecución -> " + (t2-t1) );
        System.out.println("Nombre coincidente\n" + resultado);
    }
}
