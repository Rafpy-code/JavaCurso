package org.ramonfpy.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("IntStream numeros = IntStream.range(5, 31).peek(System.out::println); ");

        //rangeClosed(5,31); incluye el segundo parámetro.
        IntStream numeros = IntStream.range(5, 31).peek(System.out::println); //El 31 último número del range no se incluye solo hasta 20.
                
        //int resultado = numeros.reduce(0, (a, b) -> a + b);
        //int resultado = numeros.reduce(0, (a, b) -> Integer.sum(a + b));
        //int resultado = numeros.reduce(0, Integer::sum); //Referencia del método.

        //int resultado = numeros.sum();
        //System.out.println(resultado);

        IntSummaryStatistics statistics = numeros.summaryStatistics();

        System.out.println("IntSummaryStatistics statistics = numeros.summaryStatistics();");

        System.out.println("El número mayor -> " + statistics.getMax());
        System.out.println("El número menor -> " + statistics.getMin());
        System.out.println("Sumatoria -> " + statistics.getSum());
        System.out.println("Hay  -> " + statistics.getCount() + " números.");
        System.out.println("El promedio -> " + statistics.getAverage());

    }
}
