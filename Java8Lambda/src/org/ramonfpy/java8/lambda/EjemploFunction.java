package org.ramonfpy.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String[] args) {

        Function<String, String> function = parametro -> {
            return "Saludos de Ramón para: " + parametro;
        };

        String resultado = function.apply("Francisco");
        System.out.println(resultado);

        //Function<String, String> function1 = parametro -> parametro.toUpperCase();
        Function<String, String> function1 = String::toUpperCase; //Método de referencia.
        String resultado1 = function1.apply("portalanza");
        System.out.println(resultado1);

        System.out.println();
        System.out.println("BiFunction");

        BiFunction<String, String, String> function2 = (a, b) -> a.toUpperCase().concat(" ").concat(b.toUpperCase());
        String resultado2 = function2.apply("hola,", "buen amigo!");
        System.out.println(resultado2);

        //BiFunction<String, String, Integer> function3 = (a, b) -> a.compareTo(b);
        BiFunction<String, String, Integer> function3 = String::compareTo;

        Integer resultado3 = function3.apply("Ramón", "Francisco");
        System.out.println(resultado3);

        Integer resultado4 = function3.apply("Ramón", "Ramón");
        System.out.println(resultado4);

        BiFunction<String, String, String> function4 = String::concat;
        String resultado5 = function4.apply("Portalanza ", "Yerovi");
        System.out.println(resultado5);
    }
}
