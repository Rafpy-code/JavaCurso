package org.ramonfpy.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {

        String nombre = "Francisco";

        Optional optional = Optional.of(nombre); //Se usa of() cuando se está seguro que el valor no es null.
        System.out.println("optional = " + optional);

        boolean estaPresente = optional.isPresent();
        System.out.println("estaPresente = " + estaPresente);

        if (optional.isPresent()) {
            System.out.println("Hola " + optional.get());
        }

        //Se puede usar lo siguiente:
        /*optional.ifPresent(valor -> {
            System.out.println("Qué tal " + valor);
        });*/
        optional.ifPresent(valor -> System.out.println("Qué tal " + valor));

        boolean estaVacio = optional.isEmpty();
        System.out.println("estaVacio = " + estaVacio);

        System.out.println();
        System.out.println("Ahora nombre tiene el valor null.");
        nombre = null;

        optional = Optional.ofNullable(nombre);
        System.out.println("optional = " + optional);
        boolean estaPresente1 = optional.isPresent();
        System.out.println("estaPresente = " + estaPresente1);
        boolean estaVacio1 = optional.isEmpty();
        System.out.println("estaVacio = " + estaVacio1);

        optional.ifPresentOrElse(valor -> System.out.println( "Hey "  + valor), () -> {
            System.out.println("La variable nombre no tiene valor.");
        });

        Optional<String> optVacio = Optional.empty();
        System.out.println("optVacio = " + optVacio);
        boolean estaPresente2 = optional.isPresent();
        System.out.println("estaPresente = " + estaPresente2);
        boolean estaVacio2 = optional.isEmpty();
        System.out.println("estaVacio = " + estaVacio2);
    }
}
