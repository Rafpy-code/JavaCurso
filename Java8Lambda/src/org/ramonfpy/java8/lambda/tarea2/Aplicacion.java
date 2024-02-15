package org.ramonfpy.java8.lambda.tarea2;

import java.util.Collections;

public class Aplicacion {

    public static void main(String[] args) {

        ContadorDePalabras contador = frase -> {
            String[] arregloFrase = frase.replace(".", "")
                    .replace(",", "")
                    .toLowerCase()
                    .split(" ");

            String palabraRepetida = null;
            int max = Integer.MIN_VALUE;

            //for (int i = 0; i < arregloFrase.length; i++)
            for (String s : arregloFrase) {
                int seRepite = 0;

                //for (int j = 0; j < arregloFrase.length; j++)
                for (String value : arregloFrase) {
                    if (s.equalsIgnoreCase(value)) {
                        seRepite++;
                    }
                }

                if (seRepite > max) {
                    max = seRepite;
                    palabraRepetida = s;
                } else {
                    max = 0;
                    palabraRepetida = "------";
                }
            }
            return Collections.singletonMap(palabraRepetida, max);
        };

        System.out.println();
        String fraseIngresada = "la vida,";

        System.out.println("Frase a analizar:" + fraseIngresada);

        contador.contarPalabrasRepetidas(fraseIngresada)
                .forEach( (palabra, veces) -> System.out.println("\tLa palabra >" + palabra + "< se repite " + veces + " veces."));
    }
}
