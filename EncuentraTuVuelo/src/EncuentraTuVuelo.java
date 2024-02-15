import modelo.Vuelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EncuentraTuVuelo {

    public static void main(String[] args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        List<Vuelo> llegadas = new ArrayList<>();

        llegadas.add(new Vuelo("AAL 933", "New York", "Santiago", dateFormat.parse("2021-08-29 05:39"), 62));
        llegadas.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", dateFormat.parse("2021-08-31 04:45"), 47));
        llegadas.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", dateFormat.parse("2021-08-30 16:00"), 52));
        llegadas.add(new Vuelo("DAL 147", "Atlanta", "Santiago", dateFormat.parse("2021-08-29 13:22"), 59));
        llegadas.add(new Vuelo("AVA 241", "Bogota", "Santiago", dateFormat.parse("2021-08-31 14:05"), 25));
        llegadas.add(new Vuelo("AMX 10", "Mexico City", "Santiago", dateFormat.parse("2021-08-31 05:20"), 29));
        llegadas.add(new Vuelo("IBE 6833", "Londres", "Santiago", dateFormat.parse("2021-08-30 08:45"), 55));
        llegadas.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", dateFormat.parse("2021-08-29 07:41"), 51));
        llegadas.add(new Vuelo("SKU 803", "Lima", "Santiago", dateFormat.parse("2021-08-30 10:35"), 48));
        llegadas.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", dateFormat.parse("2021-08-29 09:14"), 59));
        llegadas.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", dateFormat.parse("2021-08-31 08:33"), 31));
        llegadas.add(new Vuelo("CMP 111", "Panama City", "Santiago", dateFormat.parse("2021-08-31 15:15"), 29));
        llegadas.add(new Vuelo("LAT 705", "Madrid", "Santiago", dateFormat.parse("2021-08-30 08:14"), 47));
        llegadas.add(new Vuelo("AAL 957", "Miami", "Santiago", dateFormat.parse("2021-08-29 22:53"), 60));
        llegadas.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", dateFormat.parse("2021-08-31 09:57"), 32));
        llegadas.add(new Vuelo("LAT 1283", "Cancún", "Santiago", dateFormat.parse("2021-08-31 04:00"), 35));
        llegadas.add(new Vuelo("LAT 579", "Barcelona", "Santiago", dateFormat.parse("2021-08-29 07:45"), 61));
        llegadas.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", dateFormat.parse("2021-08-30 07:12"), 58));
        llegadas.add(new Vuelo("LAT 501", "París", "Santiago", dateFormat.parse("2021-08-29 18:29"), 49));
        llegadas.add(new Vuelo("LAT 405", "Montevideo", "Santiago", dateFormat.parse("2021-08-30 15:45"), 39));

        //Ordenar por llagada de forma descendente.
        //System.out.println("\n---------------------------Lista de vuelos----------------------------------");
        //llegadas.sort((v1, v2) -> v2.getFechaYhora().compareTo(v1.getFechaYhora()));
        //llegadas.sort((o1, o2) -> o2.getOrigen().compareTo(o1.getOrigen())); //Ordenar descendente por origen.
        //llegadas.forEach(System.out::println); //Imprime en el orden añadido.
        //Ordenar por llagada de forma ascendente.
        System.out.println("\n---------------------------Lista de vuelos----------------------------------");
        llegadas.sort(Comparator.comparing(Vuelo::getFechaYhora)); //Ordena en forma ascendente.
        llegadas.forEach(System.out::println);

        //Obtener el último vuelo en llegar.
        System.out.println("\n---------------------------Último vuelo----------------------------------");
        Vuelo ultimoVuelo = llegadas.get(llegadas.size()-1); //Al estar ordenada ascendentemente tomo el último valor.
        System.out.println("El último vuelo en llegar es el: " + ultimoVuelo.getVuelo() + ", Origen: " + ultimoVuelo.getOrigen() + ", Destino: " + ultimoVuelo.getDestino() + ", aterriza el: " + ultimoVuelo.getFechaYhora());

        //Obtener el vuelo que tiene menor cantidad de pasajeros.
        System.out.println("\n---------------------------Vuelo con menor cantidad de pasajeros----------------------------------");
        llegadas.sort((v1, v2) -> Integer.valueOf(v2.getCantidadPasajeros()).compareTo(v1.getCantidadPasajeros()));
        Vuelo menorCantidadPasajeros = new LinkedList<>(llegadas).peekLast();
        System.out.println("El vuelo con menor cantidad de pasajeros es el: " + menorCantidadPasajeros.getVuelo() +
                ", Origen: " + menorCantidadPasajeros.getOrigen() + ", Destino: "+ menorCantidadPasajeros.getDestino() +
                ", con: " + menorCantidadPasajeros.getCantidadPasajeros() + " pasajeros.");
    }
}