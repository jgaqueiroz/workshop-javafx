module org.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.demojavafx to javafx.fxml;
    exports org.example.demojavafx;
}