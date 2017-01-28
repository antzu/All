import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
        //ristkulik(p);
        joon(p);

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
    public void joon (Pane p){
        Stage s = new Stage();
        s.show();
        GridPane pane = new GridPane();
        Scene sc = new Scene(pane, 300, 300);
        s.setScene(sc);
        TextField tf1 = new TextField("X alg");
        TextField tf2 = new TextField("X lopp");
        TextField tf3 = new TextField("y alg");
        TextField tf4 = new TextField("y lopp");
        Button b = new Button("Kinnita ja joonista");
        pane.add(tf1, 1, 1);
        pane.add(tf2, 1, 2);
        pane.add(tf3, 1, 3);
        pane.add(tf4, 1, 4);
        pane.add(b, 1, 5);
        b.setOnAction(event -> {
            Line l = new Line(parseInt(tf1.getText()),parseInt(tf2.getText()),parseInt(tf3.getText()),parseInt(tf4.getText()));
            p.getChildren().addAll(l);
            s.close();
        });


    }
}