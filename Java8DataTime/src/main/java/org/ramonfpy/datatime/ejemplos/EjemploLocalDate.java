package org.ramonfpy.datatime.ejemplos;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class EjemploLocalDate {

    public static void main(String[] args) {

        LocalDate fechaActual1 = LocalDate.now();
        System.out.println("LocalDate.now(); = " + fechaActual1);

        System.out.println("Día: " + fechaActual1.getDayOfMonth());
        System.out.println("Mes: " + fechaActual1.getMonth());
        System.out.println("Año: " + fechaActual1.getYear());
        System.out.println("Día del año: " + fechaActual1.getDayOfYear());
        System.out.println("Era: " + fechaActual1.getEra()); //CE contemporánea.

        LocalDate fecha2 = LocalDate.of(1973,9,15);
        System.out.println("LocalDate.of(1973,9,15); = " + fecha2);

        LocalDate fecha3 = LocalDate.of(1973, Month.SEPTEMBER,15);
        System.out.println("LocalDate.of(1973, Month.SEPTEMBER,15); = " + fecha3);

        LocalDate f4 = LocalDate.parse("2014-12-13");
        System.out.println("LocalDate.parse(\"2014-12-13\"); = " + f4);

        LocalDate diaDeMañana= LocalDate.now().plusDays(1);
        System.out.println("diaDeMañana  LocalDate.now().plusDays(1); = " + diaDeMañana);

        LocalDate diaMesAnterior = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("diaMesAnterior = LocalDate.now().minus(1, ChronoUnit.MONTHS); = " + diaMesAnterior);

        DayOfWeek domingo = LocalDate.parse("2022-06-26").getDayOfWeek();
        System.out.println("domingo = LocalDate.parse(\"26-06-26\").getDayOfWeek(); = " + domingo);

        int veintiseis = LocalDate.of(2022,06,26).getDayOfMonth();
        System.out.println("veintiseis = LocalDate.of(2022,06,26).getDayOfMonth(); = " + veintiseis);

        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = LocalDate.now().isLeapYear(); = " + esBisiesto);

        boolean fechaAnterior = LocalDate.now().isBefore(LocalDate.parse("2022-06-06"));
        System.out.println("Fecha actual: " + LocalDate.now() + " fechaAnterior = LocalDate.now().isBefore(LocalDate.parse(\"2022-15-06\")); = " + fechaAnterior);

        boolean fechaPosterior = LocalDate.of(2022,06,26).isAfter(LocalDate.of((1973),9,15));
        System.out.println("fechaPosterior = " + fechaPosterior);
    }
}
