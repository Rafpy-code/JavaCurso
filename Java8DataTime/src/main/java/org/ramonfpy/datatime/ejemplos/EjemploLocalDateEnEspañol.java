package org.ramonfpy.datatime.ejemplos;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDateEnEspañol {

    public static void main(String[] args) {

        LocalDate fechaActual1 = LocalDate.now();
        System.out.println("LocalDate.now(); = " + fechaActual1);

        System.out.println("Día: " + fechaActual1.getDayOfMonth());
        Month mes = fechaActual1.getMonth();
        System.out.println("Número del mes: " + mes.getValue());
        System.out.println("Mes en español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek diaDeLaSemana = fechaActual1.getDayOfWeek();
        System.out.println("Número del día: " + diaDeLaSemana.getValue());
        System.out.println("Nombre del día: " + diaDeLaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

    }
}
