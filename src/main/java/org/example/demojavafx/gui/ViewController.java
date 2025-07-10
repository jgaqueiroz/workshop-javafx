package org.example.demojavafx.gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.example.demojavafx.model.entites.Person;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class ViewController implements Initializable {

    @FXML
    private ComboBox<Person> comboBoxPerson;

    @FXML
    private Button btnAll;

    private ObservableList<Person> obsListPerson;

    @FXML
    public void onBtnAllAction() {
        for (Person person : comboBoxPerson.getItems()) {
            System.out.println(person);
        }
    }

    @FXML
    public void onComboBoxPersonAction() {
        Person selectedPerson = comboBoxPerson.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            System.out.println("Selected Person: " + selectedPerson);
        } else {
            System.out.println("No person selected.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Person> list = List.of(
                new Person(1, "Alice", "alice@gmail.com"),
                new Person(2, "Bob", "bob@gmail.com"),
                new Person(3, "Charlie", "charlie@gmail.com"));
        obsListPerson = FXCollections.observableArrayList(list);
        comboBoxPerson.setItems(obsListPerson);

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
            @Override
            protected void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());
            }
        };
        comboBoxPerson.setCellFactory(factory);
        comboBoxPerson.setButtonCell(factory.call(null));
    }

}
