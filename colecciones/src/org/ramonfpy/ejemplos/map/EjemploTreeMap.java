package org.ramonfpy.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        System.out.println("==================TreeMap<>=================");
        //No acepta valores repetidos.
        //Map<String, Object> persona = new TreeMap<>(); //Orden ascendente.
        //Map<String, Object> persona = new TreeMap<>((a, b) -> b.compareTo(a)); //Orden descendente manualmente.
        //Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder()); //Orden descendente con la función reverse.
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length)); //Ordenar por el largo de la key.
        //Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed()); //Reverxed




        System.out.println("==================persona.isEmpty() antes de agregar elementos=================");
        System.out.println("persona.isEmpty() = " + persona.isEmpty());
        //No acepta llaves null
        //persona.put(null, "123"); //Acepta un sólo null.
        persona.put("nombre", "Ramón");
        persona.put("apellido", "Portalanza");
        persona.put("email", "ramon@hotmail.com");
        persona.put("edad", 30);
        System.out.println("persona = " + persona);

        //HashMap o TreeMap para agregar la dirección.
        Map<String, String> direccion = new TreeMap<>(Comparator.reverseOrder()); //También se pueden usar los métodos de arriba.
        direccion.put("pais", "Ecuador");
        direccion.put("ciudad", "Riobamba");
        direccion.put("barrio", "Los Pinos");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);
    }
}
