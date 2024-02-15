package org.ramonfpy.api.stream.ejemplos.tarea1;

import java.util.stream.IntStream;

public class SumatoriaNumerosNo10Divisible {

        public static void main(String[] args) {

            /*
            import java.util.Arrays;
            int[] arreglo = new int[100];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = i+1;
            }
            double total = Arrays.stream(arreglo)
                    .filter(e -> e % 10 != 0)
                    .mapToDouble(e -> (double) e / 2)
                    .reduce(0, (ac, e) -> ac + e);

            System.out.println(total); // 2250.0
            */

            System.out.println("Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int, utilizando el api stream se pide eliminar\n" +
                    "los divisibles en 10, luego convertir los elementos restante del flujo en tipo double y dividirlos en 2, para finalmente\n" +
                    "devolver la suma total de todos ellos usando el operador terminal reduce. El resultado debería ser 2250.0");

            IntStream arreglo = IntStream.rangeClosed(0, 100);

            Double sumatoria = arreglo.asDoubleStream()
                    .filter(n -> n % 10 != 0)
                    .peek(System.out::println)
                    .map(n -> n / 2)
                    .peek(System.out::println)
                    .reduce(0, (a, n) -> a + n);

            System.out.println();
            System.out.println("sumatoria = " + sumatoria);
        }
    }
