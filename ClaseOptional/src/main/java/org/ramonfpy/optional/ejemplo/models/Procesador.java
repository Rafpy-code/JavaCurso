package org.ramonfpy.optional.ejemplo.models;

import java.util.Objects;

public class Procesador {
    private String nombre;
    private Fabricante fabricante;

    public Procesador() {
    }

    public Procesador(String nombre, Fabricante fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Procesador)) return false;
        Procesador that = (Procesador) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "nombre='" + nombre + '\'' +
                ", fabricante=" + fabricante +
                '}';
    }
}
