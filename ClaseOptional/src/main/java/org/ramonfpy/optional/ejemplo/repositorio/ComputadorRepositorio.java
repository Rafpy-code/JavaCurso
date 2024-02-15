package org.ramonfpy.optional.ejemplo.repositorio;

import org.ramonfpy.optional.ejemplo.models.Computador;
import org.ramonfpy.optional.ejemplo.models.Fabricante;
import org.ramonfpy.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();

        Procesador procesador = new Procesador("Ryzen 12", new Fabricante("AMD"));
        Computador huawei = new Computador("Huawei 12000 series", "Ryzen 5");
        huawei.setProcesador(procesador);
        dataSource.add(huawei);
    }

    /*@Override
    public Computador filtrar(String nombre) {
        for (Computador c : dataSource) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }*/

   /* //Implementando el Optional
    @Override
    public Optional<Computador> filtrar(String nombre) {
        for (Computador c : dataSource) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }*/


    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()
                //.filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
    }


}
