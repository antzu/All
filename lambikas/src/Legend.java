import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Legend extends Application {
    public void start(Stage primaryStage) throws Exception {
        Stage s = new Stage();
        Pane p = new Pane();
        Scene sc = new Scene(p, 500, 500);
        s.setScene(sc);
        s.show();
        ringid(p);
    }
    public void ringid (Pane p){
        for (int i = 0; i < 50; i++) {
            Circle c = new Circle(Math.random()*400, Math.random()*400, 20);
            c.setFill(Color.RED);
            p.getChildren().addAll(c);
            c.setOnMouseEntered(event -> {
                c.setFill(Color.GREEN);
            });
        }


    }
}