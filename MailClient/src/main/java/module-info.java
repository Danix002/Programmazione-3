module com.example.mailclient {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.mailclient to javafx.fxml;
    exports com.example.mailclient;
}