package org.ramonfpy.ejemplos.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {
        //El más genérico es Set porque de este heredan.
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("HashSet");
        //HashSet no admite elementos repetidos y es desordenada.
        hashSet.add("seis");
        hashSet.add("tres");
        hashSet.add("cinco");
        hashSet.add("nueve");
        hashSet.add("cuatro");
        hashSet.add("dos");
        System.out.println("hashSet = " + hashSet);
        //Este elemento que está repetido no lo admite.
        hashSet.add("seis");
        System.out.println("hashSet.add(\"seis\"); agregando el seis nuevamente = " + hashSet);
        boolean admite = hashSet.add("seis");
        System.out.println("hashSet admite elementos duplicados? -> " + admite);


        //Para poder ordenar un HashSet hay que convertirlo a un ArrayList.
        List<String> hashConvertidoAList = new ArrayList<>(hashSet);
        Collections.sort(hashConvertidoAList);
        System.out.println("hashConvertidoAList = " + hashConvertidoAList);

        System.out.println("========================================================");

        System.out.println("List     ArrayList<>");
        List<String> lista = new ArrayList<>();
        //List admite elementos repetidos y es ordenada.
        lista.add("seis");
        lista.add("tres");
        lista.add("cinco");
        lista.add("nueve");
        lista.add("cuatro");
        lista.add("dos");
        System.out.println("lista = " + lista);
        //Este elemento que está repetido lo admite.
        lista.add("seis");
        System.out.println("list.add(\"seis\"); agregando el seis nuevamente = " + lista);
        boolean admite1 = lista.add("seis");
        System.out.println("List admite elementos duplicados? -> " + admite1);

        //List admite sort
        Collections.sort(lista);
        System.out.println("lista ordenada Collections.sort(lista); = " + lista);
    }
}
