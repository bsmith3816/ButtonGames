import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.util.ArrayList;

public class BackEnd {
    public Label score;
    private Integer sum = 0;

    public void add(ActionEvent actionEvent) {
        sum++;
        score.setText("Score: " + sum.toString());
    }

}
