module com.example.javafxcomboboxes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxcomboboxes to javafx.fxml;
    exports com.example.javafxcomboboxes;
}