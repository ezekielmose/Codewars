module com.example.codewars {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codewars to javafx.fxml;
    exports com.example.codewars;
}