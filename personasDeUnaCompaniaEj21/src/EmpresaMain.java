import modelo.*;

public class EmpresaMain {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Ramón", "Portyer", "55555555S", "Riobamba", 13, 7500.00);

        Gerente gerente = new Gerente("Fran", "Ortyer", "444444444R", "Chimborazo", 1, 7500.00, 250000.00);

        Cliente cliente = new Cliente("Cisco", "Rtyer", "222222222T", "Ecuador", 15000);

        System.out.println("----------------------------------------------------");
        System.out.println("gerente:" + gerente);
        System.out.println("----------------------------------------------------");
        System.out.println("empleado:" + empleado);
        System.out.println("----------------------------------------------------");
        System.out.println("cliente:" + cliente);

        System.out.println("------------------Set del presupuesto---------------");
        gerente.setPresupuesto(457890.91);
        System.out.println("gerente:" + gerente);

        System.out.println("--------------aumento de remuneracion---------------");
        empleado.setRemuneracion(empleado.aumentarRemuneracion(0.5));
        System.out.println("empleado:" + empleado);
    }
}
//Esto es un comentario. JAJAJA.