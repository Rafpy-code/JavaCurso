package org.ramonfpy.java8.lambda.tarea2;

import java.util.Map;

@FunctionalInterface
public interface ContadorDePalabras {

    Map<String, Integer> contarPalabrasRepetidas (String frase);

}
