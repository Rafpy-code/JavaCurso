package modelo;

public class Cliente extends Persona {
    //Atributos.
    int clienteId;

    //Constructor.
    public Cliente(String nombre, String apellido, String nif, String diereccion, int clienteId) {
        super(nombre, apellido, nif, diereccion);
        this.clienteId = clienteId;
    }

    //getter.
    public int getClienteId() {
        return clienteId;
    }

    //toString sobreescrito.

    @Override
    public String toString() {
        return super.toString() +
                "\nclienteId = " + getClienteId();
    }
}
