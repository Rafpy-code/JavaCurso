package org.ramonfpy.optional.ejemplo.repositorio;

import org.ramonfpy.optional.ejemplo.models.Computador;

import java.util.Comparator;
import java.util.Optional;

public interface Repositorio<T> {

    //Computador filtrar (String nombre);

    //Implementando Optional.
    Optional<Computador> filtrar (String nombre);

}
