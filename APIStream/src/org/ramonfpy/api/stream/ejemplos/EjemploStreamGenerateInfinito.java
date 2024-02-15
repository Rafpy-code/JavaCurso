package org.ramonfpy.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamGenerateInfinito {
    public static void main(String[] args) {

        int limite = 5;
        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {

                    try {
                        TimeUnit.SECONDS.sleep(1);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    return contador.incrementAndGet() + ".- Se imprime infinitamente si no lo limitamos o detenemos...";

                })
                .limit(limite)
                .forEach(System.out::println);

        System.out.println("Se limitó a " + limite + " el generador.");
    }
}
