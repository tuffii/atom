package lab7.finaltask.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.util.Duration;
import lab7.finaltask.first.Hero.*;
import lab7.finaltask.first.Interfaces.*;
import lab7.finaltask.main;

public class lab1Controller {

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private VBox toggle_menu_VB_doors;
  private TranslateTransition menuAnimation;

  private static Stage root;
  public void setRoot(Stage root) {
    lab1Controller.root = root;
  }

  @FXML
  private void toggleMenu(ActionEvent event) {
    double targetX = 0;
    if (toggle_menu_VB_doors.getTranslateX() == 0) {
      targetX = 150;
      toggle_menu_VB_doors.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
    }
    else {
      toggle_menu_VB_doors.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
    }
    menuAnimation.setToX(targetX);
    menuAnimation.play();
  }




  @FXML
  void initialize() {
    menuAnimation = new TranslateTransition(Duration.millis(300), toggle_menu_VB_doors);
    menuAnimation.setToX(-toggle_menu_VB_doors.getPrefWidth());
  }



}
