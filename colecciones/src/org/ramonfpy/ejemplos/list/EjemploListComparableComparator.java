package org.ramonfpy.ejemplos.list;

import org.ramonfpy.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        System.out.println("============================Listas con Comparable y comparator========================");
        //Funciona igual para cualquiera de estas:
        //List<Alumno> alumnoList = new ArrayList<Alumno>();
        List<Alumno> alumnoList = new LinkedList<>();
        alumnoList.add(new Alumno("Dulce", 10));
        alumnoList.add(new Alumno("Jeydan", 9));
        alumnoList.add(new Alumno("Ramón", 5));
        alumnoList.add(new Alumno("Francisco", 7));
        alumnoList.add(new Alumno("Dejado", 3));
        alumnoList.add(new Alumno("Ramón", 9.99));

        System.out.println("============================sout normal del array original========================");
        System.out.println("Alumno = " + alumnoList);

        System.out.println("===========Diferentes maneras de sort=================Para ordenar usamos la interfaz Collections.sort(alumnoList)========================");
        //Collections.sort(alumnoList);
        /* alumnoList.sort((a, b) -> {
            return a.compareTo(b);
        }); */
        //alumnoList.sort((a, b) -> b.compareTo(a));
        //alumnoList.sort(Alumno::compareTo);
        //alumnoList.sort(Comparator.naturalOrder());
        alumnoList.sort(Comparator.reverseOrder());

        System.out.println("============================Iterando usando stream foreach========================");
        alumnoList.forEach(System.out::print);

        System.out.println("================Descendente============Collections.sort(alumnoList, (a, b) -> b.getNombre().compareTo(a.getNombre()))========================");
        //Collections.sort(alumnoList, (a, b) -> a.getNombre().compareTo(b.getNombre()));
        Collections.sort(alumnoList, (a, b) -> b.getNombre().compareTo(a.getNombre()));

        System.out.println("============================Iterando usando stream foreach========================");
        alumnoList.forEach(System.out::print);

        System.out.println("=================Ascendente===========Collections.sort(alumnoList, Comparator.comparing(Alumno::getNombre));========================");
        Collections.sort(alumnoList, Comparator.comparing(Alumno::getNombre));

        System.out.println("============================Iterando usando stream foreach========================");
        alumnoList.forEach(System.out::print);

        System.out.println("=================Ascendente===========alumnoList.sort(alumnoList, Comparator.comparing(Alumno::getNota));========================");
        System.out.println("============================Iterando usando stream foreach========================");
        alumnoList.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        //alumnoList.sort(Comparator.comparing(Alumno::getNota).reversed());
        alumnoList.forEach(System.out::print);
    }
}
