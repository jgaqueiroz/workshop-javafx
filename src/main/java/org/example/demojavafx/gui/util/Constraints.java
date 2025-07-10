package org.example.demojavafx.gui.util;

import javafx.scene.control.TextField;

public class Constraints {

    public static void setTextFieldInteger(TextField txt) {
        txt.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*")) {
                txt.setText(oldValue);
            }
        });
    }

    public static void setTextFieldMaxLength(TextField txt, int maxLength) {
        txt.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && newValue.length() > maxLength) {
                txt.setText(oldValue);
            }
        });
    }

    public static void setTextFieldDouble(TextField txt) { 
        txt.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*([.,]\\d*)?")) {
                txt.setText(oldValue);
            }
        });
    }
    
}
