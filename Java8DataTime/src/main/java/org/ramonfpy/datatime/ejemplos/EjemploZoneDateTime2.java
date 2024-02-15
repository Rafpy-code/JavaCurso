package org.ramonfpy.datatime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZoneDateTime2 {

    public static void main(String[] args) {

        //LocalDateTime fechaLocal = LocalDateTime.parse("2022-9-15T12:45");

        LocalDateTime fechaLocal = LocalDateTime.parse("2022/09/15 12:45"
                , DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        ZoneId espania = ZoneId.of("Europe/Madrid");
        //ZonedDateTime zonaBarcelona = ZonedDateTime.of(fechaLocal, espania);
        ZonedDateTime zonaBarcelona = ZonedDateTime.of(fechaLocal, ZoneOffset.of("+02:00"));
        System.out.println("Zona horaria de Barcelona = " + zonaBarcelona);

        ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNy = zonaBarcelona.withZoneSameInstant(newYork).plusHours(8).plusMinutes(50);
        ZonedDateTime zonaNy = zonaBarcelona.withZoneSameInstant(ZoneOffset.of("-04:00")).plusHours(8).plusMinutes(50);
        System.out.println("Zona horaria de New York = " + zonaNy);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm dd MMM yyyy");

        System.out.println();
        System.out.println("Detalles del viaje a New York.");
        System.out.println("Horario de partida desde Barcelona = " + dtf1.format(zonaBarcelona));
        System.out.println("Horario de llegada a New York = " + dtf1.format(zonaNy));

        /*Set<String> zoneId = ZoneId.getAvailableZoneIds();
        zoneId.forEach(System.out::println);*/
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
