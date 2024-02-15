package org.ramonfpy.java8.lambda;

import org.ramonfpy.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {

        System.out.println("Predicate siempre devuelve un boolean.");
        Predicate<Integer> predicate1 = numero -> numero > 10;
        boolean resultado1 = predicate1.test(5);
        System.out.println("10 es menor que 5" + resultado1);

        Predicate<String> predicate2 = comparar -> comparar.equals("ADMINISTRADOR");
        boolean resultado2 = predicate2.test("USUARIO");
        System.out.println("USUARIO == ADMINISTRADOR -> " + resultado2);

        boolean resultado2_1 = predicate2.test("ADMINISTRADOR");
        System.out.println("ADMINISTRADOR == ADMINISTRADOR -> " + resultado2_1);

        BiPredicate<String, String> biPredicate3 = (a, b) -> a.equals(b);
        boolean resultado3 = biPredicate3.test("Ramón", "Francisco");
        System.out.println("Ramón == Francisco -> " + resultado3);

        BiPredicate<String, String> biPredicate3_1 = String::equals;
        boolean resultado3_1 = biPredicate3_1.test("Francisco", "Francisco");
        System.out.println("Francisco == Francisco -> " + resultado3_1);

        BiPredicate<Integer, Integer> biPredicate4 = (i, j) -> j > i;
        boolean resultado4 = biPredicate4.test(5,10);
        System.out.println("5 es mayor que 10 -> " + resultado4);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Ramón");
        b.setNombre("Francisco");

        BiPredicate<Usuario, Usuario> biPredicate5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        boolean resultado5 = biPredicate5.test(a, b);
        System.out.println("Usuario: Ramón == Usuario: Francisco -> " + resultado5);
    }
}
