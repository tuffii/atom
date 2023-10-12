package lab7.finaltask;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import lab7.finaltask.Controllers.ChooseLabController;

import java.io.IOException;

public class main extends Application {

    public static final int IMAGE_HEIGHT = 920;
    public static final int IMAGE_WIDTH = 564;
    public static Stage root;

    @Override
    public void start(Stage this_stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("hello-view.fxml"));
        AnchorPane rootLayout = fxmlLoader.load();

        Scene this_scene = new Scene(rootLayout, IMAGE_WIDTH, IMAGE_HEIGHT);
        root = this_stage;
        root.setTitle("atom");
        root.setScene(this_scene);

        ChooseLabController controller = fxmlLoader.getController();
        controller.setRoot(root);

        root.show();
    }




    public static void main(String[] args) {
        launch();
    }
}