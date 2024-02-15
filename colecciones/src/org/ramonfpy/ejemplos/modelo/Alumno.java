package org.ramonfpy.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    //private double nota;
    private Double nota;

    public Alumno() {
    }

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " -> Nota: " + nota + "\n";
    }
/*
    //Ordenar por nota.
    @Override
    public int compareTo(Alumno a) {
        if (this.nota == a.nota) {
            return 0;
        }
        if (this.nota > a.nota){
            return 1;
        } else {
            return -1;
        }
    }

    //Ordenar por nombre.
    @Override
    public int compareTo(Alumno a) {
        //Para evitar un NullPointerException
        if (this.nombre == null) {
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
    }

 */
    //Si fuese primitivo Double en vez de double.
    @Override
    public int compareTo(Alumno a) {
        if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.nota);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
