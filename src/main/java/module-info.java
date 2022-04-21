module com.example.aisd_labaratorywork5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.aisd_labaratorywork5 to javafx.fxml;
    exports com.example.aisd_labaratorywork5;
}