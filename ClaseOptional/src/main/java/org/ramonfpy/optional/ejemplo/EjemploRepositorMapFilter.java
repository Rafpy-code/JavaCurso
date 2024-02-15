package org.ramonfpy.optional.ejemplo;


import org.ramonfpy.optional.ejemplo.models.Computador;
import org.ramonfpy.optional.ejemplo.models.Fabricante;
import org.ramonfpy.optional.ejemplo.models.Procesador;
import org.ramonfpy.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.ramonfpy.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorMapFilter {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("map().filter();");

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String nombreBuscado = "huawei";

        Fabricante f1 = repositorio.filtrar(nombreBuscado)
                //.map(computador -> computador.getProcesador())
                .map(Computador::getProcesador)
                //.map(procesador -> procesador.getFabricante())
                .map(Procesador::getFabricante)
                .orElseThrow();

        System.out.println(f1);

        System.out.println();
        System.out.println("Convirtiéndolo a un String.");

        String nombreBuscado2 = "huawei";

        String f2 = repositorio.filtrar(nombreBuscado2)
                //.map(computador -> computador.getProcesador())
                .map(Computador::getProcesador)
                //.map(procesador -> procesador.getFabricante())
                .map(Procesador::getFabricante)
                //.map(fabricante -> fabricante.getNombre())
                .filter(fab -> "amd".equalsIgnoreCase(fab.getNombre())) //Si queremos buscar solo las que sean apple.
                .map(Fabricante::getNombre)
                .orElse("Fabricante desconocido!");

        System.out.println(f2);

        //Se puede usar flatMap, pero hay que modificar los get de Optional<Fabricante> y Optional<Procesador>x

    }
}
