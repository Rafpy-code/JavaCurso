package org.ramonfpy.tarea;

import java.util.concurrent.TimeUnit;

public class AlfanumericoRunnable implements Runnable {

    private Tipo tipo;

    public AlfanumericoRunnable() {
    }

    public AlfanumericoRunnable(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (tipo == Tipo.NUMERO) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        if (tipo == Tipo.LETRA) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(c);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
