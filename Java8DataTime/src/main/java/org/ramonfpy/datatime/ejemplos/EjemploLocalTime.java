package org.ramonfpy.datatime.ejemplos;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {

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

    }
}
