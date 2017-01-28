import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Legend extends Application {
    public void start(Stage primaryStage) throws Exception{
        Stage s = new Stage();
        Pane p = new Pane();
        Scene sc = new Scene(p, 500, 500);
        s.setScene(sc);
        Circle ring1 = new Circle(50, 50, 30);
        Circle ring2 = new Circle(450, 450, 30);
        Circle ring3 = new Circle(200, 200, 30);
        ring1.setVisible(false);
        ring2.setVisible(false);
        ring3.setVisible(false);
        ring1.setOnMouseEntered(event -> {
            ring1.setVisible(true);
        });
        ring2.setOnMouseEntered(event -> {
            ring2.setVisible(true);
        });
        ring3.setOnMouseEntered(event -> {
            ring3.setVisible(true);
        });
        p.getChildren().addAll(ring1, ring2, ring3);
        s.show();
    }
    public void hiir (){

    }
}