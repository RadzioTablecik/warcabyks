module com.example.warcabyks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.warcabyks to javafx.fxml;
    exports com.example.warcabyks;
}