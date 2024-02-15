package org.ramonfpy.ejemplos.list;

import org.ramonfpy.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploLinkedList {
    public static void main(String[] args) {

        System.out.println("============================Métodos más importantes de LinkedList========================");
        //Funciona igual para cualquiera de estas:
        //List<Alumno> enlazada = new ArrayList<Alumno>();
        //List<Alumno> enlazada = new ArrayList<>();
        LinkedList<Alumno> enlazada = new LinkedList<>(); //Debe ser LinkedList para usar todos los métodos propios.
        System.out.println("============================Tamaño del LinkedList sin elementos========================");
        System.out.println(enlazada + " Largo del LinkedList = " + enlazada.size());
        System.out.println("El Linked está vacío? " + enlazada.isEmpty());

        enlazada.add(new Alumno("Dulce", 10));
        enlazada.add(new Alumno("Jeydan", 9.99));
        enlazada.add(new Alumno("Ramón", 5));
        enlazada.add(new Alumno("Francisco", 7));
        enlazada.add(new Alumno("Ratatui", 7.98));
        enlazada.add(new Alumno("Ratatui", 1.23));
        enlazada.add(new Alumno("Sapo Reumático", 5));
        enlazada.add(3, new Alumno("Dejado", 3)); //Se puede asignar la posición en la que se desea agregar.
        //Set
        enlazada.set(5, new Alumno("Ramón", 8.99)); //Con el set, si hay un elemento en la posición dada lo reemplazará.

        System.out.println("============================Tamaño del LinkedList después de agregar elementos al inicio y al final=======================");
        enlazada.addFirst(new Alumno("Pancho", 3.52));
        enlazada.addLast(new Alumno("Moncho", 7.15));
        System.out.println(enlazada + " Largo del LinkedList = " + enlazada.size());

        System.out.println("============================Mostrando elementos con getFirst, getLast, indice, indexOf(Alumno)=======================");
        System.out.print("Primer elemento: " + enlazada.getFirst()); //peekFirst() no lanza la excepción si el elemento no existe, devuelve null.
        System.out.print("Elemento por indice: " + enlazada.get(4));
        System.out.print("Ultimo elemento: " + enlazada.getLast());

        System.out.println("============================Para remover elementos del LinkedList=======================");
        //enlazada.removeFirst(); //o remove() quita siempre el primer elemento.
        enlazada.removeLast(); //poolLast() si el elemento no existe no lanza la excepción.
        //enlazada.pop(); //Elimina el último elemento.
        //enlazada.remove(new Alumno("Dejado", 3)); //Debe coincidir nombre y nota para eliminarlo.
        System.out.println(enlazada + " Largo del LinkedList = " + enlazada.size());

    }
}
