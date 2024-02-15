package org.ramofpy.patrones.factory.ejemplo;

import org.ramofpy.patrones.factory.PizzaProducto;
import org.ramofpy.patrones.factory.PizzeriaCaliforniaFactory;
import org.ramofpy.patrones.factory.PizzeriaNewYorkFactory;
import org.ramofpy.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();
        
        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Ramón ordena la pizza " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Dulce ordena una " + pizza.getNombre());
        
        pizza = california.ordenarPizza("vegetariana");
        System.out.println("Jeydan ordena " + pizza.getNombre());
        
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Arely ordena la pizza " + pizza.getNombre());
        
        pizza = california.ordenarPizza("pepperoni");
        System.out.println("JIsrael ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }
}
