package org.ramonfpy.optional.ejemplo;


import org.ramonfpy.optional.ejemplo.models.Computador;
import org.ramonfpy.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.ramonfpy.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioOrElse {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Usando orElse()");
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String nombreBuscado = "5amd";

        Computador porDefecto = new Computador("Ramón 1200", "Marca de la casa");

        Computador pc = repositorio.filtrar(nombreBuscado).orElse(porDefecto);
        //Computador pc = repositorio.filtrar(nombreBuscado).orElse(getValorPorDefecto()); //Aun si lo encuentra se ejecuta, mejor usar orElseGet();

        System.out.println("pc = " + pc);

        System.out.println();
        System.out.println("Usando orElseGet()");
        /*pc = repositorio.filtrar("apple").orElseGet(() -> {
            return porDefecto;
        });*/

        //pc = repositorio.filtrar("apple").orElseGet(() -> new Computador("Ramón 1200", "Marca de la casa"));

        pc = repositorio.filtrar("apple").orElseGet(EjemploRepositorioOrElse::getValorPorDefecto);

        System.out.println("pc = " + pc);
    }

    //Extrae el método.
    private static Computador getValorPorDefecto() {
        System.out.print("Valor por defecto! -> ");
        return new Computador("Ramón 1200", "Marca de la casa");
    }
}
