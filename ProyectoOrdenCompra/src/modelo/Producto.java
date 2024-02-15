package modelo;

public class Producto {

    //Atributos.
    private String nombreProducto;
    private String fabricante;
    private double precioProducto;

    //Constructor.
    public Producto () {     }

    public Producto(String fabricante, String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.fabricante = fabricante;
        this.precioProducto = precioProducto;
    }

    //getters.
    public String getFabricante() {
        return fabricante;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }
}
