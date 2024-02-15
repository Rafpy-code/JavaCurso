package org.ramonfpy.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        System.out.println("Encontrar elementos duplicados en un HashSet");
        System.out.println("============================================");
        String[] animales = {"ardilla", "oso", "puma", "monito", "puma", "castor", "ardilla"};
        Set<String> noDuplicados = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String animal : animales) {
            if (!noDuplicados.add(animal)) {
                duplicados.add(animal);
            }
        }
        System.out.println(duplicados.size() + " animales duplicados: " + duplicados);
        System.out.println(noDuplicados.size() + " animales no duplicados: " + noDuplicados);

        System.out.println("Para remover todos los elementos duplicados usamos removeAll()");
        //noDuplicados.removeAll(duplicados);
        noDuplicados.remove(duplicados);

        System.out.println(duplicados.size() + " animales duplicados: " + duplicados);
        System.out.println(noDuplicados.size() + " animales no duplicados: " + noDuplicados);
    }
}
