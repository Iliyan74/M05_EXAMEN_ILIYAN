module my.company.mvchospital {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens my.company.mvchospital to javafx.fxml;
    exports my.company.mvchospital;
}
