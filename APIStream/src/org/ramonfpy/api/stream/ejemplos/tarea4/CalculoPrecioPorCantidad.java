package org.ramonfpy.api.stream.ejemplos.tarea4;

import java.util.Arrays;
import java.util.List;

public class CalculoPrecioPorCantidad {
    public static void main(String[] args) {
        /*El siguiente requerimiento es para una lista de productos List<Producto>, de 3 a 5 elementos,
        se pide calcular el importe (precio por cantidad) y sumarlos. La clase Producto debe tener el
        atributo precio del tipo double y cantidad int, entonces utilizando stream convertir la lista
        de productos en el gran total del tipo double.*/

        List<Producto> productos = Arrays.asList(new Producto(2, 3.5),
                new Producto(3, 7.34),
                new Producto(1, 12.68));

        System.out.println(productos);
        /*Double total = 0D;
        for (Producto producto : productos) {
            Double aDouble = producto.getCantidad() * producto.getPrecio();
            total = total + aDouble;

            double total2 = facturas.stream()
                .mapToDouble(productp -> producto.getCantidad() * producto.getPrecio())
                .sum();

        System.out.println(total2);
        }*/

        Double total3 = productos.stream()
                .map(producto -> producto.getCantidad() * producto.getPrecio())
                //.reduce(0D, (a, b) -> a + b);
                .reduce(0D, Double::sum);

        System.out.println("total = " + total3);
    }
}
