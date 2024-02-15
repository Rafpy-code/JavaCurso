package org.ramonfpy.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapObjectRelaciones {
    public static void main(String[] args) {

        System.out.println("==================HashMap con HashMap anidados, Object y relaciones de objetos=================");
        //No acepta valores repetidos.
        Map<String, Object> persona = new HashMap<>();

        System.out.println("==================persona.isEmpty() antes de agregar elementos=================");
        System.out.println("persona.isEmpty() = " + persona.isEmpty());
        persona.put(null, "123"); //Acepta un sólo null.
        persona.put("Nombre", "Ramón");
        persona.put("Apellido", "Portalanza");
        persona.put("Email", "ramon@hotmail.com");
        persona.put("Edad", 30); //Ahora es de tipo int y no string como el anterior ejemplo.

        //Map para agregar la dirección.
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "Ecuador");
        direccion.put("ciudad", "Riobamba");
        direccion.put("barrio", "Los Pinos");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);

        //Al ser de tipo Object hay que hacer el cast a String.
        System.out.println("==================Podemos obtener los valores de cada key persona.get(\"Nombre\");=================");
        String nombre = (String) persona.get("Nombre");
        System.out.println("nombre = " + nombre);

        System.out.println("==================eliminar  persona.remove(\"Nombre\");=================");
        String eliminado = (String) persona.remove("Nombre");
        System.out.println("eliminado key(\"Nombre\") = " + eliminado);
        System.out.println("persona = " + persona);

        boolean b = persona.remove(null, "123");
        System.out.println("eliminado boolean b = persona.remove(null, \"123\") = " + b);
        System.out.println("persona = " + persona);

        System.out.println("==================persona.contains<key o valor>(\"Portalanza\");=================");
        boolean b1 = persona.containsValue("Portalanza");
        System.out.println("persona.containsValue(\"Portalanza\"); = " + b1);

        System.out.println("==================persona.values()  Collection<String>  de los valores de persona=================");
        //No es ordenado.
        Collection<Object> valores = persona.values();
        for (Object valor : valores) {
            System.out.println("valor = " + valor);
        }

        System.out.println("==================persona.keySet()  Set<String>  de lass key de persona=================");
        Set<String> llaves = persona.keySet();
        for (String llave : llaves) {
            System.out.println("llave -> " + llave);
        }

        System.out.println("==================Map.Entry<String, String> de persona=================");
        for (Map.Entry<String, Object> par : persona.entrySet()) {
            System.out.println("Llave: " + par.getKey() + ", Valor -> " + par.getValue());
        }

        //Convertir a tipo Object el valor, ya que podría contener números, etc.
        System.out.println("==================persona.keySet() persona.get(llave) de persona=================");
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            System.out.println(llave + " -> " + valor);
        }

        System.out.println("==================persona.forEach((llave, valor) ->{ System.out.println(llave + \" -> \" + valor);});=================");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " -> " + valor);
        });

        System.out.println("==================Se puede abreviar así=================");
        persona.forEach((llave, valor) -> System.out.println(llave + " -> " + valor));

        System.out.println("==================persona.size()=================");
        System.out.println("persona.size() = " + persona.size());

        System.out.println("==================persona.isEmpty() después de agregar elementos=================");
        System.out.println("persona.isEmpty() = " + persona.isEmpty());

        System.out.println("==================persona.replace(\"key\", \"valor\") para reemplazar elementos=================");

        System.out.println("=====================Obtener los valores de la direccion=======================");
        //Tambien hay que realizar el cast a Map<S, S>
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");

        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.get("barrio");
        //Devuelve un valor por defecto si no encuentra ningún valor registrado.
        String calle = direccionPersona.getOrDefault("calle", "Los Álamos");

        System.out.println("El país de " + nombre + " es " + pais);
        System.out.println("La ciudad de " + nombre + " es " + ciudad);
        System.out.println("El barrio de " + nombre + " es " + barrio);
        System.out.println("La calle de " + nombre + " es " + calle + " -> Este es un valor por defecto");

    }
}
