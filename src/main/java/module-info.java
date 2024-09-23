module com.example.myfirsthelloworld {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.myfirsthelloworld to javafx.fxml;
    exports com.example.myfirsthelloworld;
}