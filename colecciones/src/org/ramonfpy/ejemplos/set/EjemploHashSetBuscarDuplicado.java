package org.ramonfpy.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] animales = {"ardilla", "oso", "puma", "monito", "puma", "castor", "ardilla"};
        Set<String> noDuplicados = new HashSet<>();
        int contadorDuplicados = 0;
        for (String animal : animales) {
            if (!noDuplicados.add(animal)) {
                contadorDuplicados++;
                System.out.println("Elemento duplicado: " + animal);
            }
        }
        System.out.println(contadorDuplicados + " animales duplicados");
                System.out.println(noDuplicados.size() + " animales no duplicados: " + noDuplicados);
    }
}
