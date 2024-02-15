package org.ramonfpy.api.stream.ejemplos.tarea4;

import java.util.Objects;

public class Producto {

    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("cantidad: ").append(cantidad).append("\tprecio = ").append(precio).toString();
    }
}
