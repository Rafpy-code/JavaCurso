package org.ramonfpy.optional.ejemplo.models;

import java.util.Objects;

public class Fabricante {
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fabricante)) return false;
        Fabricante that = (Fabricante) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
