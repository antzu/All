import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Legend extends Application {
    public void start(Stage primaryStage) throws Exception{
        Stage s = new Stage();
        Pane p = new Pane();
        Scene sc = new Scene(p, 600, 600);
        s.setScene(sc);
        s.show();
    }
}