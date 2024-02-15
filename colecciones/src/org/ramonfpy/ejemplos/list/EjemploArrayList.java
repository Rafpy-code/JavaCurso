package org.ramonfpy.ejemplos.list;

import org.ramonfpy.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {

        System.out.println("============================Métodos más importantes de ArrayList========================");
        //Funciona igual para cualquiera de estas:
        //List<Alumno> al = new ArrayList<Alumno>();
        List<Alumno> al = new ArrayList<>();
        //List<Alumno> al = new LinkedList<>();
        System.out.println("============================Tamaño del ArrayList sin elementos========================");
        System.out.println(al + " Largo del ArrayList = " + al.size());
        System.out.println("El array está vacío? " + al.isEmpty());

        al.add(new Alumno("Dulce", 10));
        al.add(new Alumno("Jeydan", 9.99));
        al.add(new Alumno("Ramón", 5));
        al.add(new Alumno("Francisco", 7));
        al.add(new Alumno("Ratatui", 7.98));
        al.add(new Alumno("Ratatui", 1.23));
        al.add(new Alumno("Sapo Reumático", 5));
        al.add(3, new Alumno("Dejado", 3)); //Se puede asignar la posición en la que se desea agregar.
        al.set(5, new Alumno("Ramón", 8.99)); //Con el set, si hay un elemento en la posición dada lo reemplazará.

        System.out.println("============================Tamaño del ArrayList después de agregar elementos=======================");
        System.out.println(al + " Largo del ArrayList = " + al.size());

        System.out.println("============================Eliminando elementos=======================");
        //Utiliza el método equals de implementado en Alumno.
        al.remove(new Alumno("Ramón", 5)); //Eliminando el objeto alumno.
        al.remove(2); //Eliminando por el índice.
        System.out.println(al + " Largo del ArrayList = " + al.size());

        System.out.println("============================Para saber si el ArrayList contiene un elemento=======================");
        boolean b = al.contains(new Alumno("Ratatui", 1.23));
        System.out.println("Se encuentra el alumno Ratatui en esta clase? -> " + b);

        System.out.println("============================Para convertir el ArrayList en un arreglo=======================");
        Object arreglo[] = al.toArray();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("ArrayList convertido a un arreglo. Posición [" + i + "] -> " + arreglo[i]);
        }
    }
}
