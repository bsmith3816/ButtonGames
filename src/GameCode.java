import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameCode extends Application {


    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("window.fxml"));
        primaryStage.setTitle("Fast Clicker");
        primaryStage.setScene(new Scene(root, 300, 275));
        Text score = new Text(0,0,"Score:");

        primaryStage.show();


        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                score.setText("Timer: " + (now / 1_000_000_000.0));
                if(now / 1_000_000_000.0 == 10.0){
                    stop();
                }
            }
        };
        timer.start();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
