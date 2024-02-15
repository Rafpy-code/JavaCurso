package org.ramonfpy.optional.ejemplo.models;

import java.util.Objects;

public class Computador {

    private String nombre;
    private String modelo;
    private Procesador procesador; //Se amplía en el 300

    public Computador() {
    }

    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computador)) return false;
        Computador that = (Computador) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(modelo, that.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, modelo);
    }

    @Override
    public String toString() {
        return nombre + " - " + modelo;
    }
}
