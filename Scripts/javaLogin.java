import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Scene login = new Scene(vbox, 300, 150);
        primaryStage.setScene(login);
        primaryStage.show();

        Label pealkiri = new Label("Mis on parool?");
        TextField paroolField = new TextField();
        Button submitButton = new Button("Login");

        vbox.getChildren().addAll(pealkiri, paroolField, submitButton);

        Circle ring = new Circle(50);
        Pane pane = new Pane();
        pane.getChildren().add(ring);
        Scene seesStseen = new Scene (pane, 600, 500);

        submitButton.setOnAction(event -> {
            System.out.println("klikk");
            String parool = paroolField.getText();
            System.out.println(parool);
            pealkiri.setText(parool);
            if (parool.equals("pass")){
                System.out.println("oige");
                primaryStage.setScene(seesStseen);
            } else {
                System.out.println("Pass on vale");
            }
        });


    }
}