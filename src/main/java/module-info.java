module com.example.bobyas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bobyas to javafx.fxml;
    exports com.example.bobyas;
}