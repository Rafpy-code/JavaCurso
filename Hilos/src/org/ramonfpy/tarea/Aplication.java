package org.ramonfpy.tarea;

public class Aplication {

    public static void main(String[] args) {

        System.out.println("Ejemplo de 2 Threads");
        System.out.println("====================");

        AlfanumericoRunnable anr1 = new AlfanumericoRunnable(Tipo.LETRA);
        AlfanumericoRunnable anr2 = new AlfanumericoRunnable(Tipo.NUMERO);

        Thread t1 = new Thread(anr1);
        Thread t2 = new Thread(anr2);

        t1.start();
        t2.start();
    }
}
