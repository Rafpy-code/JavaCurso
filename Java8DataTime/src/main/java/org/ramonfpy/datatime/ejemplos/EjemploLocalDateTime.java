package org.ramonfpy.datatime.ejemplos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime fechaCompleta = LocalDateTime.now();
        System.out.println("fechaCompleta = " + fechaCompleta);

        LocalDateTime fechaTiempo = LocalDateTime.of(1973, Month.SEPTEMBER, 15, 23, 30,47);
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fecha1 = LocalDateTime.parse("1994-12-13T17:57:45.330195200");
        System.out.println("fecha1 = " + fecha1);

        LocalDateTime fechaSumada = fechaCompleta.plusDays(3).plusHours(3);
        System.out.println("fechaSumada = " + fechaSumada);

        LocalDateTime fechaRestada = fechaCompleta.minusDays(5).minusHours(7);
        System.out.println("fechaRestada = " + fechaRestada);

        String formatoIso = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formatoIso = " + formatoIso);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formatoPersonalizado = fechaTiempo.format(dtf2);
        System.out.println("formatoPersonalizado = " + formatoPersonalizado);

        String formato2 = dtf2.format(fechaTiempo);
        System.out.println("formato2 = " + formato2);
    }
}
