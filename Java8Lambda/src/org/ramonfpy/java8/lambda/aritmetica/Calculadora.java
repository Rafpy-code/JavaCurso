package org.ramonfpy.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    //Exoresión lambda propia.
    public double calcular (double a, double b, Aritmetica lambda) {
        return lambda.operacion(a, b);
    }

    //Expresión lambda con BiFunction.
    public double calcularBiFunction (double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }
}
