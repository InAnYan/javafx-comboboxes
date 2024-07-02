package com.example.javafxcomboboxes;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private ComboBox<String> firstComboBox;

    @FXML
    private ComboBox<String> secondComboBox;

    @FXML
    private void initialize() {
        firstComboBox.getItems().addAll("Item 1", "Item 2", "Item 3");
        secondComboBox.getItems().addAll("Item 4", "Item 5", "Item 6");
    }
}