import modelo.Cliente;
import modelo.OrdenCompra;
import modelo.Producto;

import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compra charcutería");
        orden1.setCliente(new Cliente("Ramón", "Portyer"));
        orden1.setFecha(new Date());
        orden1.addProductoOrdenCompra(new Producto("Don cerdillo", "Filetes", 5.60));
        orden1.addProductoOrdenCompra(new Producto("Doña vaca", "Solomillo", 7.90));
        orden1.addProductoOrdenCompra(new Producto("Sr jamón", "Paletilla", 68.34));
        orden1.addProductoOrdenCompra(new Producto("Matanza", "Costillas", 23.45));
        orden1.addProductoOrdenCompra(new Producto("Campos", "Filetes de cordero",16.89));

        OrdenCompra orden2 = new OrdenCompra("Compra heladería");
        orden2.setCliente(new Cliente("Ramón", "Portyer"));
        orden2.setFecha(new Date());
        orden2.addProductoOrdenCompra(new Producto("Casa D", "fresa", 15.60));
        orden2.addProductoOrdenCompra(new Producto("Vasca", "ron pasas", 17.95));
        orden2.addProductoOrdenCompra(new Producto("Sr j", "chocolate", 18.39));
        orden2.addProductoOrdenCompra(new Producto("Maas", "mora", 13.45));
        orden2.addProductoOrdenCompra(new Producto("Vint", "pistacho",16.89));

        OrdenCompra orden3 = new OrdenCompra("Compra bar");
        orden3.setCliente(new Cliente("Ramón", "Portyer"));
        orden3.setFecha(new Date());
        orden3.addProductoOrdenCompra(new Producto("Ramoncín", "ginebra", 215.65));
        orden3.addProductoOrdenCompra(new Producto("Ramoncín", "ron", 27.90));
        orden3.addProductoOrdenCompra(new Producto("Ramoncín", "whisky", 168.34));
        orden3.addProductoOrdenCompra(new Producto("Ramoncín", "cream", 13.15));
        orden3.addProductoOrdenCompra(new Producto("Ramoncín", "Guanchaca",1000.00));

        //Arreglo de las órdenes de compra para poder recorrerlas.
        OrdenCompra[] compras = {orden1, orden2, orden3};

        for (OrdenCompra orden : compras) {
            if (compras.length > 0) {
                System.out.println("=========================================== Siguiente Orden ===========================================");
            }
            System.out.println("\nNº de orden: " + orden.getId());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripción: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());

            //for para recorrer los productos añadidos
            int i = 1;
            for (Producto producto : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + producto.getNombreProducto() + " " + producto.getFabricante()
                        + " precio €" + producto.getPrecioProducto());
                i++;
            }
            System.out.println("Total en euros: " + orden.getGranTotal() + "\n");
        }
    }

}