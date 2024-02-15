package modelo;

public class Gerente extends Empleado {
    //Atributos.
    Double presupuesto;

    //Constructor.
    public Gerente(String nombre, String apellido, String nif, String diereccion, int empleadoId, double remuneracion, Double presupuesto) {
        super(nombre, apellido, nif, diereccion, empleadoId, remuneracion);
        this.presupuesto = presupuesto;
    }

    //getter y setter.
    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    //toString sobreescrito.

    @Override
    public String toString() {
        return super.toString() +
                "\npresupuesto = " + getPresupuesto();
    }
}
