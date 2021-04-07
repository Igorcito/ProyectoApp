module com.mycompany.primerproyecto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.primerproyecto to javafx.fxml;
    exports com.mycompany.primerproyecto;
}
