package org.ramofpy.patrones.decorator;

import org.ramofpy.patrones.decorator.decorador.MayusculaDecorador;
import org.ramofpy.patrones.decorator.decorador.RemplazarEspaciosDecorador;
import org.ramofpy.patrones.decorator.decorador.ReversaDecorador;
import org.ramofpy.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Qué tal Ramón!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        System.out.println("mayuscula = " + mayuscula.darFormato());

        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        System.out.println("reversa = " + reversa.darFormato());

        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        System.out.println("subrayar");
        System.out.println(subrayar.darFormato());

        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(mayuscula);
        System.out.println("remplazar = " + remplazar.darFormato().toLowerCase());
    }
}
