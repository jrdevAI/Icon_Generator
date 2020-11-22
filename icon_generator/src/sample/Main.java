package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
    private static final int maxWidthH = 200;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Generated User Icon");
        primaryStage.setWidth(maxWidthH);
        primaryStage.setHeight(140);
        populateStage(primaryStage);
    }

    public static void populateStage(Stage primaryStage) throws Exception{
        Group root = new Group();
        Random rand = new Random();
        for(int i = 0; i < 25; i++) {
            int upper_bound = maxWidthH / 2;
            int random_x = (rand.nextInt(upper_bound)/10)*10;
            int random_y = (rand.nextInt(upper_bound)/10)*10;
            System.out.println(random_x + " " + random_y + " " + (maxWidthH/2 - random_x) + " " + (maxWidthH/2 + random_x));

            Rectangle rectangle = new Rectangle(((maxWidthH-5)/2 - random_x), random_y, 10, 10);
            Rectangle rectangle2 = new Rectangle(((maxWidthH-5)/2 + random_x), random_y, 10, 10);
            root.getChildren().add(rectangle);
            root.getChildren().add(rectangle2);

        }
        Scene scene = new Scene(root ,0, 0);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
