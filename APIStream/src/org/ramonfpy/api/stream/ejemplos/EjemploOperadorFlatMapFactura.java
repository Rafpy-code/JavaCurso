package org.ramonfpy.api.stream.ejemplos;

import org.ramonfpy.api.stream.ejemplos.models.Factura;
import org.ramonfpy.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploOperadorFlatMapFactura {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Ratón", "Pérez");
        Usuario u2 = new Usuario("Perico", "Paltyes");

        u1.addFactura(new Factura("Compra computador La bestia de 2 patas."));
        u1.addFactura(new Factura("Compra seguro de la bestia."));

        u2.addFactura(new Factura("Compra de la media bestia."));
        u2.addFactura(new Factura("Compra de la otra media bestia."));

        List<Usuario> usuarioList = Arrays.asList(u1, u2);

        /*
         * for (Usuario u : usuarioList) {
         * for (Factura f : u.getFacturas()) {
         * System.out.println("Usuario: " + u.getNombre() + "\tDescripción: " +
         * f.getDescripcion());
         * }
         * }
         */

        /*
         * usuarioList.stream().flatMap(usuario -> usuario.getFacturas().stream())
         * .forEach(factura -> System.out.println(factura.getUsuario().getNombre() //Se
         * puede reemplazar con el toString(usuario).
         * .concat(" ").concat(factura.getUsuario().getApellido())
         * .concat(", Descripción: ").concat(factura.getDescripcion())));
         */

        usuarioList.stream()
                // .map(usuario -> usuario.getFacturas())
                .map(Usuario::getFacturas)
                // .flatMap(listaFacturas -> listaFacturas.stream())
                .flatMap(List::stream)
                .forEach(factura -> System.out.println(factura.getUsuario().getNombre() // Se puede reemplazar con el
                                                                                        // toString(usuario).
                        .concat(" ").concat(factura.getUsuario().getApellido())
                        .concat(", Descripción: ").concat(factura.getDescripcion())));
    }
}
