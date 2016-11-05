import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by antz on 28/10/2016.
 */
public class main extends Application{
    public void start(Stage primaryStage) throws Exception {
        Raamatukogu Raamatukogu;
        Raamatukogu = new Raamatukogu();
        //Scanner uus = new Scanner(System.in);
        //String raamat = uus.next();
        //Raamat raamat = new Raamat("nimi1", "autor1", "asukoht3");
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();


        Label raamatnim = new Label("Raamatu nimi");
        Label raamataut = new Label("Raamatu autor");
        Label raamatasu = new Label("Raamatu asukoht");
        TextField raamatnimi = Raamatukogu.raamatnimi;
        TextField raamatautor = Raamatukogu.raamatautor;
        TextField raamatasukoht = Raamatukogu.raamatasukoht;

        vbox.getChildren().addAll(raamatnim, raamatnimi, raamataut, raamatautor,raamatasu, raamatasukoht);

        Button lisa = new Button("Lisa raamat");
        Button kokku = new Button("Koik raamatud");
        Label otsiraamat = new Label("Otsi raamatut nime jargi");
        TextField otsi = Raamatukogu.otsi;
        Button otsiotsi = new Button("Otsi");
        vbox.getChildren().addAll(lisa, kokku, otsiraamat, otsi, otsiotsi);
        lisa.setOnAction(event -> {
            Raamatukogu.lisaRaamat();
        });
        kokku.setOnAction(event -> {
            Raamatukogu.Raamatukoguraamatud();
        });
        otsiotsi.setOnAction(event -> {
            Raamatukogu.Otsinimega();
        });


       // System.out.println(raamat.getAsukoht());

    }
}
