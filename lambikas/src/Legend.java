import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.FileNotFoundException;

import static java.lang.Integer.*;

public class Legend extends Application {
    public void start(Stage primaryStage) throws Exception {
        Stage s = new Stage();
        Pane p = new Pane();
        Scene sc = new Scene(p, 500, 500);
        s.setScene(sc);
        s.show();
        Label l = new Label("sonum");
        l.setLayoutX(200);
        l.setLayoutY(200);
        p.getChildren().addAll(l);
        //ringid(p);
        ristkulik(p);
    }
    public void ringid (Pane p){

        for (int i = 0; i < 800; i++) {
            Circle c = new Circle(Math.random()*400, Math.random()*400, 20);
            c.setFill(Color.RED);
            p.getChildren().addAll(c);
            c.setOnMouseEntered(event -> {
                //c.setFill(Color.TRANSPARENT);
                c.setVisible(false);
            });
        }
    }
    public void ristkulik (Pane p){
        for (int i = 0; i < 20; i++) {
            Rectangle r = new Rectangle(20, 40);
            r.setX(Math.random()*400);
            r.setY(Math.random()*400);
            p.getChildren().addAll(r);
            r.setOnMouseClicked(event ->{
                r.setWidth(20/2);
                r.setHeight(40/2);
                r.setOnMouseClicked(event1 -> {
                    r.setVisible(false);
                });
            });
        }
    }
}