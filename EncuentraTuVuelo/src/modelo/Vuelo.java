package modelo;

import java.util.Date;
import java.util.Objects;

public class Vuelo {
    /*La clase Vuelo debe contener los atributos nombre (string), origen (string),
    destino (string), fecha de llegada que incluya fecha y hora (java.util.Date) y
    cantidad de pasajeros.*/

    private String vuelo;
    private String origen;
    private String destino;
    private Date fechaYhora;
    private int cantidadPasajeros;

    public Vuelo() {
    }

    public Vuelo(String vuelo, String origen, String destino, Date fechaYhora, int cantidadPasajeros) {
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaYhora = fechaYhora;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaYhora() {
        return fechaYhora;
    }

    public void setFechaYhora(Date fechaYhora) {
        this.fechaYhora = fechaYhora;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vuelo)) return false;
        Vuelo vuelo = (Vuelo) o;
        return cantidadPasajeros == vuelo.cantidadPasajeros && Objects.equals(this.vuelo, vuelo.vuelo) && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(fechaYhora, vuelo.fechaYhora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vuelo, origen, destino, fechaYhora, cantidadPasajeros);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                " nombre: " + vuelo +
                ", origen: " + origen +
                ", destino: " + destino +
                ", fecha: " + fechaYhora +
                ", cantidadPasajeros: " + cantidadPasajeros + " }";
    }
}
