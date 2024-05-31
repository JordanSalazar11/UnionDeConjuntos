module com.example.uniondeconjuntos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uniondeconjuntos to javafx.fxml;
    exports com.example.uniondeconjuntos;
}