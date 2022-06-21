module com.example.obrowser {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.obrowser to javafx.fxml;
    exports com.example.obrowser;
}