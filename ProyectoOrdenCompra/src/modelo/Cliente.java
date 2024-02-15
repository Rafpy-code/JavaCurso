package modelo;

public class Cliente {
    //Atributos.
    private String nombre;
    private String apellido;

    //Costructores.
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters y setters.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ".";
    }
}
