import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameCode extends Application {

    private static final int count = 10;

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("window.fxml"));
        primaryStage.setTitle("Fast Clicker");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        long start = System.nanoTime();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            }
        };
        timer.start();


    }

    public void check(AnimationTimer timer, long now){

    }

    public static void main(String[] args) {
        launch(args);
    }

}
