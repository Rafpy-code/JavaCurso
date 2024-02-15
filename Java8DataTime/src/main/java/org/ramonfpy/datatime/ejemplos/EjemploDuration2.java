package org.ramonfpy.datatime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDuration2 {

    public static void main(String[] args) {

        Instant i1 = Instant.now();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant i2 = Instant.now();
        Duration duration1 = Duration.between(i1, i2);
        System.out.println("duration1 = " + duration1);
    }
}