package lab7.finaltask.Controllers;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;

import lab7.finaltask.main;


public class ChooseLabController {

    private static Stage root;
    public void setRoot(Stage root) {
        ChooseLabController.root = root;
    }

    @FXML
    private VBox toggle_menu_VB;
    private TranslateTransition menuAnimation;
    @FXML
    private Button GPS_button;
    @FXML
    private Button side_menu;
    @FXML
    private Text inside_temperature;
    @FXML
    private Text outside_temperature;
    @FXML
    private Text battery_charge_percent;
    @FXML
    private Text battery_charge_kilometres;
    @FXML
    private Text total_mileage;
    @FXML
    private Text today_mileage;
    @FXML
    private Text total_drive_time;

    @FXML
    private void goto_doors(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("lab1.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setScene(this_scene);

        lab1Controller doors_controller = fxmlLoader.getController();
        doors_controller.setRoot(root);
    }

    @FXML
    private void goto_driving(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("driving.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setScene(this_scene);

        DrivingController driving_controller = fxmlLoader.getController();
        driving_controller.setRoot(root);
    }

    @FXML
    private void goto_lights(ActionEvent event) throws IOException {


    }

    @FXML
    private void goto_climate(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("climate.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setScene(this_scene);

        climateController climate_controller = fxmlLoader.getController();
        climate_controller.setRoot(root);
    }

    @FXML
    private void goto_GPS(ActionEvent event) throws IOException {


    }

    @FXML
    private void toggleMenu(ActionEvent event) {
        double targetX = 0;
        if (toggle_menu_VB.getTranslateX() == 0) {
            targetX = 150;
            toggle_menu_VB.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
        }
        else {
            toggle_menu_VB.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
        }
        menuAnimation.setToX(targetX);
        menuAnimation.play();
    }


    @FXML
    void initialize() {
        menuAnimation = new TranslateTransition(Duration.millis(300), toggle_menu_VB);
        menuAnimation.setToX(-toggle_menu_VB.getPrefWidth());
    }
}





