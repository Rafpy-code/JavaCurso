package org.ramonfpy.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        System.out.println("==================Identificadores únicos=================");
        //No acepta valores repetidos.
        Map<String, String> persona = new HashMap<>();

        System.out.println("==================persona.isEmpty() antes de agregar elementos=================");
        System.out.println("persona.isEmpty() = " + persona.isEmpty());
        persona.put(null, "123"); //Acepta un sólo null.
        persona.put("Nombre", "Ramón");
        persona.put("Apellido", "Portalanza");
        persona.put("Email", "ramon@hotmail.com");
        persona.put("Edad", "30");
        System.out.println("persona = " + persona);

        System.out.println("==================Podemos obtener los valores de cada key persona.get(\"Nombre\");=================");
        String nombre = persona.get("Nombre");
        System.out.println("nombre = " + nombre);

        System.out.println("==================eliminar  persona.remove(\"Nombre\");=================");
        String eliminado = persona.remove("Nombre");
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
        Collection<String> valores = persona.values();
        for (String valor : valores) {
            System.out.println("valor = " + valor);
        }

        System.out.println("==================persona.keySet()  Set<String>  de lass key de persona=================");
        Set<String> llaves = persona.keySet();
        for (String llave : llaves) {
            System.out.println("llave -> " + llave);
        }

        System.out.println("==================Map.Entry<String, String> de persona=================");
        for (Map.Entry<String, String> par : persona.entrySet()) {
            System.out.println("Llave: " + par.getKey() + ", Valor -> " + par.getValue());
        }

        System.out.println("==================persona.keySet() persona.get(llave) de persona=================");
        for (String llave : persona.keySet()) {
            String valor = persona.get(llave);
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

    }
}
