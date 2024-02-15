package org.ramonfpy.datatime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EjemploZoneDateTime {

    public static void main(String[] args) {

        LocalDateTime fechaLocal = LocalDateTime.now();

        ZoneId espania = ZoneId.of("Europe/Madrid");

        ZonedDateTime zonaBarcelona = ZonedDateTime.of(fechaLocal, espania);
        System.out.println("Zona horaria de Barcelona = " + zonaBarcelona);

        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNy = zonaBarcelona.withZoneSameInstant(newYork);

        System.out.println("Zona horaria de New York = " + zonaNy);
    }
}
