package lab7.finaltask.Controllers;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import lab7.finaltask.main;

import java.io.IOException;

public class DrivingController {

    private static Stage root;
    public void setRoot(Stage root) {
        DrivingController.root = root;
    }


    @FXML
    private VBox toggle_menu_VB_drive;
    private TranslateTransition menuAnimation;

    @FXML
    private void toggle_menu_2(ActionEvent event) {
        double targetX = 0;
        if (toggle_menu_VB_drive.getTranslateX() == 0) {
            targetX = 150;
            toggle_menu_VB_drive.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
        }
        else {
            toggle_menu_VB_drive.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
        }
        menuAnimation.setToX(targetX);
        menuAnimation.play();
    }



    @FXML
    private void goto_doors(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("lab1.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setTitle("doors");
        main.root.setScene(this_scene);

        ChooseLabController main_controller = fxmlLoader.getController();
        main_controller.setRoot(root);

    }

    @FXML
    private void goto_main(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("hello-view.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setTitle("doors");
        main.root.setScene(this_scene);

        ChooseLabController main_controller = fxmlLoader.getController();
        main_controller.setRoot(root);
    }

    @FXML
    private void goto_lights(ActionEvent event) throws IOException {


    }

    @FXML
    private void goto_climate(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("climate.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setTitle("doors");
        main.root.setScene(this_scene);

        climateController climate_controller = fxmlLoader.getController();
        climate_controller.setRoot(root);
    }



    @FXML
    void initialize() {
        menuAnimation = new TranslateTransition(Duration.millis(300), toggle_menu_VB_drive);
        menuAnimation.setToX(-toggle_menu_VB_drive.getPrefWidth());
    }
}
