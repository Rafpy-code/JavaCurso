package org.ramonfpy.api.stream.ejemplos.tarea2;

import java.util.Arrays;
import java.util.function.Function;

public class NumeroMayor {
    public static void main(String[] args) {
        /*Obtener el número mayor en un arreglo con programación funcional lambda y api stream
        * El siguiente ejercicio es obtener el número mayor de un arreglo pero utilizando
        * programación funcional, implementando la expresión lambda Function<T,R> (que viene predefinida)
        * con el api stream y operador reduce.*/

        Function<Integer[], Integer> mayor = arreglo -> Arrays.stream(arreglo)
                .reduce(0, (a, b) -> a > b ? a : b);

        int resultado = mayor.apply(new Integer[]{3,7,9,12,4,1});

        System.out.println("El número mayor es: " + resultado);
    }
}
