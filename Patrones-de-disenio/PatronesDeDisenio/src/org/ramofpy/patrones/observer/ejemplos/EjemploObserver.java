package org.ramofpy.patrones.observer.ejemplos;

import org.ramofpy.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver( (observable, obj) -> {
            System.out.println("Ramón: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Dulce: " + observable );
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Jeydan: " + observable );
        });

        google.modificaPrecio(2000);
    }
}
