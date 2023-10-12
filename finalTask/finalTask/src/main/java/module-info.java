module lab7.finaltask {
    requires javafx.controls;
    requires javafx.fxml;


    opens lab7.finaltask to javafx.fxml;
    exports lab7.finaltask;
    exports lab7.finaltask.Controllers;
    opens lab7.finaltask.Controllers to javafx.fxml;
}