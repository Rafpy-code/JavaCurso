package org.ramonfpy.java8.lambda;

import org.ramonfpy.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {

        System.out.println("Primer consumidor de tipo String. 3 Maneras de escribirlas, simplificando la expresión lambda.");
        Consumer<String> consumidor = saludo -> {
            System.out.println(saludo);
        };
        consumidor.accept("Hola, mi nombre es Ramón!");

        Consumer<String> consumidor1 = saludo -> System.out.println(saludo);
        consumidor1.accept("Hola, mi nombre es Ramón!");

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola, mi nombre es Ramón!");

        System.out.println();
        System.out.println("Consumidor 3 de tipo Date");
        Consumer<Date> consumidor3 = fecha -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println(sdf.format(fecha));
        };
        consumidor3.accept(new Date("1973/09/15"));

        System.out.println();
        System.out.println("BicConsumer, 2 tipos de datos, ej. String, Integer");
        BiConsumer<String, Integer> biConsumer = (nombre, edad) -> {
            System.out.println(nombre + " tiene " + edad + " años");
        };

        biConsumer.accept("Ramón", 48);

        System.out.println();
        System.out.println("Trabajando con Arrays.asList();");

        List<String> nombres = Arrays.asList("Ramón", "Francisco", "Portalanza", "Yerovi");
        Consumer<String> consumerList = System.out::println; //Expresión lambda.
        nombres.forEach(consumerList);

        System.out.println();
        System.out.println("Trabajando BiConsumer con la clase usuario.");
        Usuario usuario = new Usuario();

        /*BiConsumer<Usuario, String> asignarNombre = (persona, nombre) ->{
            usuario.setNombre(nombre);
        };*/

        //BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> usuario.setNombre(nombre);

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre; //Simplificado

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String n = scanner.next();

        asignarNombre.accept(usuario, n);
        System.out.println("El nombre del usuario es: " + usuario.getNombre());

        //Usando Supplier para crear usuarios.
        //Supplier<Usuario> crearUsuario = () -> new Usuario();
        Supplier<Usuario> crearUsuario = Usuario::new; //Método simplificado.
        Usuario usuario1 = crearUsuario.get();
        BiConsumer<Usuario, String> asignarNombre1 = Usuario::setNombre;
        asignarNombre1.accept(usuario1, "Ramón Francisco");
        System.out.println("Nombre de usuario con Supplier<Usuario>: " + usuario1.getNombre());

        System.out.println();
        System.out.println("Método Supplier() retorna un valor a través del método get();");

        /*Supplier<String> supplier = () -> {
          return "Hola mundo desde lambda Supplier<String>";
        };*/

        //Si tiene un solo argumento se puede simplificar de esta manera.
        Supplier<String> supplier = () -> "Hola mundo desde lambda Supplier<String>";

        System.out.println(supplier.get());
    }
}
