package com.example.formulario;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Window;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Optional;

/**
 * @author RamónFPY.
 */
public class ViewUIControls1_Controller extends JFrame implements ActionListener {

    @FXML
    private TextField txt_nombre;
    @FXML
    private TextField txt_apellido;
    @FXML
    private TextField txt_dni;
    @FXML
    private TextField txt_dni_letra;
    @FXML
    private TextField txt_email;
    @FXML
    private DatePicker txt_edad;
    @FXML
    private RadioButton hombre;
    @FXML
    private RadioButton mujer;
    @FXML
    private Button btn_aceptar;

}
