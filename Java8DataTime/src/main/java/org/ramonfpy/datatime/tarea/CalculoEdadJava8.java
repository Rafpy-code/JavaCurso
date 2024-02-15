package org.ramonfpy.datatime.tarea;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculoEdadJava8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento, con formato yyyy-MM-dd:");
        String fechaIngresada = scanner.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        long edad = ChronoUnit.YEARS.between(fechaNacimiento, actual); //debe ser long no int.
        System.out.println("Edad = " + edad + " años.");

    }
}
