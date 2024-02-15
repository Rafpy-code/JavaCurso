package org.ramonfpy.datatime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {

    public static void main(String[] args) {

        LocalDateTime fecha1 = LocalDateTime.now();
        //fecha1 = fecha1.withMonth(3); //Lo correcto sería crear fecha 3 y asignarle el valor.
        LocalDateTime fecha2 = LocalDateTime.now().plusHours(3).plusMinutes(34).plusSeconds(57);


        Duration duration = Duration.between(fecha1, fecha2);
        System.out.println("duration = " + duration);
        System.out.println("Duration en segundos -> " + duration.getSeconds());
        System.out.println("Duration en minutos -> " + duration.toMinutes());
        System.out.println("Duration en horas -> " + duration.toHours());

    }
}
