package org.ramonfpy.datatime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTimeFormatter {

    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println("Tiempo actual: " + ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());
        System.out.println("NanoSegundos: " + ahora.getNano());

        //LocalTime cincoTreinta = LocalTime.of(5, 30);
        LocalTime cincoTreinta = LocalTime.of(5,30,45);
        System.out.println("cincoTreinta = " + cincoTreinta);

        cincoTreinta = LocalTime.parse("05:30:46"); //De la mañana, a la tarde sería 17:30
        System.out.println("cincoTreinta = " + cincoTreinta);

        LocalTime sumarHoras = LocalTime.of(13,30).plus(2, ChronoUnit.HOURS);
        System.out.println("sumarHoras (13:30 + 2:00)= " + sumarHoras);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss, a"); //a para am - pm, o "HH:mm:ss" para 24 horas.
        String ahoraFormateado1 = ahora.format(dtf);
        System.out.println("ahoraFormateado = " + ahoraFormateado1);

        String ahoraFormateado2 = cincoTreinta.format(dtf);
        System.out.println("05:30 ahoraFormateado2 = " + ahoraFormateado2);

        ahoraFormateado1 = dtf.format(ahora);
        System.out.println("dtf.format(ahora); = " + ahoraFormateado1);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min + ", max = " + max);

    }
}
