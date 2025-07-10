package org.example.demojavafx.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.Locale;

import org.example.demojavafx.gui.util.Alerts;

public class ViewController {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label lblResult;

    @FXML
    private Button btSum;

    @FXML
    public void onBtSumAction() {
        Locale.setDefault(Locale.US);
        try {
            Double number1 = Double.parseDouble(txtNumber1.getText());
            Double number2 = Double.parseDouble(txtNumber2.getText());
            Double sum = number1 + number2;
            lblResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Error", "Invalid input", "Please enter valid numbers.", Alert.AlertType.ERROR);
        }
    }


}
