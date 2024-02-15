package org.ramofpy.patrones.factory;

import org.ramofpy.patrones.factory.producto.PizzaNewYorkItaliana;
import org.ramofpy.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.ramofpy.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        //Desde Java 13 el switch se simplifica.
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
