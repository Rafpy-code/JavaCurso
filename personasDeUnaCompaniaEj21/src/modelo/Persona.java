package modelo;

public class Persona {
    //Atributos.
    private String nombre;
    private String apellido;
    private String nif;
    private String diereccion;

    //Constructor.
    public Persona(String nombre, String apellido, String nif, String diereccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.diereccion = diereccion;
    }

    //getters.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNif() {
        return nif;
    }

    public String getDiereccion() {
        return diereccion;
    }

    @Override
    public String toString() {
        return "\nnombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                ", diereccion='" + diereccion + '\'';
    }
}
