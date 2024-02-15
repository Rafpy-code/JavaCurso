package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Ejemplo Stream Distinct Usuario");

        IntStream largoNombres = Stream
                .of("Ramón Yerovi", "Ramón Portalanza", "Dulce Castor", "Francisco Yerovi", "Dulce Castor", "Jeydan Portalanza", "Dulce Castor")
                //.distinct() //Es un operador intermedio.
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct() //Debemos implementar en la clase Usuario el método equals.
                .mapToInt(usuario -> usuario.toString().length())
                .peek(System.out::println); //Para mostrar los nombres

        //Siempre usar solo un operador final para imprimir.
        //largoNombres.forEach(System.out::println);

        //Si deseamos mostrar todas las opciones debemos usar el IntSummaryStatistics.
        IntSummaryStatistics statistics = largoNombres.summaryStatistics();
        System.out.println("El nombre más largo = " + statistics.getMax());
        System.out.println("El nombre más corto = " + statistics.getMin());
        System.out.println("Cuántos nombres hay? = " + statistics.getCount()); //Contabiliza solo los nombres que no se repiten por el distinct().
        System.out.println("Sumatoria del todos los caracteres = " + statistics.getSum());

    }
}
