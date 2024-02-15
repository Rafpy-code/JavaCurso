package org.ramon.jdbc337.examen17052022;

public class MainPractico {

    public static void main(String[] args) {
        try {
            InterfacePractico frame = new InterfacePractico();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}