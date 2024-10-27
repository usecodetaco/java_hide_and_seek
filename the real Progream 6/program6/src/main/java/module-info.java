module com.cis2235.program6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cis2235.program6 to javafx.fxml;
    exports com.cis2235.program6;
}