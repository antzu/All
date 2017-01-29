import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main extends Application {
        public void start (Stage primaryStage) throws Exception {
            Stage s = new Stage();
            GridPane gp = new GridPane();
            Scene sc = new Scene(gp, 500, 500);
            s.setScene(sc);
            Kassa kassa = new Kassa();

            TextField nimi = new TextField("Nimi");
            TextField kogus = new TextField("Kogus");
            TextField hind = new TextField("Hind");
            Button kinnita = new Button("Kinnita");
            gp.add(nimi, 1, 1);
            gp.add(kogus, 1, 2);
            gp.add(hind, 1, 3);
            gp.add(kinnita, 1, 4);

            Label laoskokku = new Label("Laos hetkel tooteid: " + kassa.laoskokku);

            gp.add(laoskokku, 1, 5);

            kinnita.setOnAction(event -> {
                Date now = new Date();
                Toode toode = new Toode(nimi.getText(), Integer.parseInt(kogus.getText()), Integer.parseInt(hind.getText()), now);
                kassa.lisaLattu(toode);
                laoskokku.setText("Laos hetkel tooteid: " + kassa.laoskokku);
            });


            s.show();
        }


}
