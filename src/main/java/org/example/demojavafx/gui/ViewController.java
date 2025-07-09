package org.example.demojavafx.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import org.example.demojavafx.gui.util.Alerts;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    public void onBtTestAction() {
        Alerts.showAlert("Title here", "Header here", "Some message here!", Alert.AlertType.WARNING);
    }


}
