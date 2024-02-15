package org.ramonfpy.java8.lambda;

import org.ramonfpy.java8.lambda.aritmetica.Aritmetica;
import org.ramonfpy.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunctional {

    public static void main(String[] args) {

        //Aritmetica suma = (a, b) -> a - b;
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> {
            return a - b;
        };
        //Aritmetica resta = (a, b) -> a - b;
        Aritmetica multiplicacion = (a, b) -> a * b;
        Aritmetica division = (a, b) -> a / b;

        Calculadora calculadora = new Calculadora();

        System.out.println("Suma -> " + calculadora.calcular(7, 3.2, suma));
        System.out.println("Resta -> " + calculadora.calcular(7, 3.2, resta));
        System.out.println("Multiplicación -> " + calculadora.calcular(7, 3.2, multiplicacion));
        System.out.println("División -> " + calculadora.calcular(7, 3.2, division));

        System.out.println("calcular con BiFunction");
        System.out.println(calculadora.calcularBiFunction(35.6, 23.78, (a, b) -> a / b));

    }
}
