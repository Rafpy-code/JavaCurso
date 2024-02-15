package org.ramonfpy.datatime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {

    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2015,5,25);
        LocalDate fecha2 = LocalDate.of(2017,11,3);

        Period period = Period.between(fecha1, fecha2);
        System.out.println("period = " + period);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses, %d días."
                , fecha1, fecha2, period.getYears(), period.getMonths(), period.getDays());

        System.out.println();

        LocalDate fecha3 = fecha2.withMonth(2); //Para modificar el mes de fecha 2 en fecha 3, fecha2 se mantiene.
        Period period1 = Period.between(fecha1, fecha3);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses, %d días."
                , fecha1, fecha3, period1.getYears(), period1.getMonths(), period1.getDays());

    }
}
