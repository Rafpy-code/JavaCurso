package modelo;

import java.util.Date;

public class OrdenCompra {

    //Atributos.
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private int indiceProductos = 0;
    private Producto[] productos;
    private static int ultimoId;


    //Constructores.
    public OrdenCompra (String descripcion) {
        this.id = ++ultimoId;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    //getters y setters.
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Método para añadir productos.
    public void addProductoOrdenCompra(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }



    //Método para sumar el total de los productos.
    public double getGranTotal(){
        double total = 0;
        for(Producto p: productos){
            total += p.getPrecioProducto();
        }
        return total;
    }
}