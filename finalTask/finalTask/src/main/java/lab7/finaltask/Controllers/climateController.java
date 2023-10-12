package lab7.finaltask.Controllers;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import lab7.finaltask.main;

import java.io.IOException;

public class climateController {
    private static Stage root;
    public void setRoot(Stage root) {
        climateController.root = root;
    }

    @FXML
    private VBox toggle_menu_VB_climate;
    private TranslateTransition menuAnimation;


    @FXML
    private void toggleMenu(ActionEvent event) {
        double targetX = 0;
        if (toggle_menu_VB_climate.getTranslateX() == 0) {
            targetX = 150;
            toggle_menu_VB_climate.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
        }
        else {
            toggle_menu_VB_climate.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
        }
        menuAnimation.setToX(targetX);
        menuAnimation.play();
    }

    @FXML
    private void goto_main(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("hello-view.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setTitle("main");
        main.root.setScene(this_scene);

        climateController climate_controller = fxmlLoader.getController();
        climate_controller.setRoot(root);
    }

    @FXML
    private void goto_dors(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("lab1.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setTitle("main");
        main.root.setScene(this_scene);

        climateController climate_controller = fxmlLoader.getController();
        climate_controller.setRoot(root);
    }

    @FXML
    private void goto_driving(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("driving.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, main.IMAGE_WIDTH, main.IMAGE_HEIGHT);
        main.root.setTitle("main");
        main.root.setScene(this_scene);

        climateController climate_controller = fxmlLoader.getController();
        climate_controller.setRoot(root);
    }




    @FXML
    void initialize() {
        menuAnimation = new TranslateTransition(Duration.millis(300), toggle_menu_VB_climate);
        menuAnimation.setToX(-toggle_menu_VB_climate.getPrefWidth());
    }
}
