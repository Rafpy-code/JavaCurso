package modelo;

public class Empleado extends Persona{

    //Atributos.
    private int empleadoId;
    private Double remuneracion;

    //Constructor.
    public Empleado(String nombre, String apellido, String nif, String diereccion, int empleadoId, double remuneracion) {
        super(nombre, apellido, nif, diereccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }

    //getters.
    public int getEmpleadoId() {
        return empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion){
        this.remuneracion = remuneracion;
    }

    public double aumentarRemuneracion(double porcentage) {
        double aumento = this.remuneracion + (this.remuneracion * porcentage);
        return aumento;
    }

    //ToString sobreescrito.
    @Override
    public String toString() {
        return super.toString() +
                "\nempleadoId = " + getEmpleadoId() +
                ", remuneracion = " + getRemuneracion();
    }
}
