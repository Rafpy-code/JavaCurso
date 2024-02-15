package com.example.login;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class MatematicasBasicasController {

    @javafx.fxml.FXML
    private TextField txt_resultado;
    @javafx.fxml.FXML
    private TextField txt_num1;
    @javafx.fxml.FXML
    private TextField txt_num2;
    private double num1;
    private double num2;
    private double total;

    //Constructor
    public MatematicasBasicasController() {    }
/*
     //Método para que sólo se admitan números.
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char c = e.getKeyChar();
                if (c < '0' || c > '9'){
                    e.consume();
                }
            }
        });
*/
    @javafx.fxml.FXML
    public void btn_dividir(ActionEvent actionEvent) {

        total = Double.parseDouble(txt_num1.getText()) / Double.parseDouble(txt_num2.getText());
        txt_resultado.setText(String.valueOf(total));
    }

    @javafx.fxml.FXML
    public void btn_restar(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btn_exponente(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btn_sumar(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btn_mult(ActionEvent actionEvent) {
    }
}