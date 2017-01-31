import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Date;

public class Main extends Application {
        public void start (Stage primaryStage) throws Exception {
            Stage s = new Stage();
            GridPane gp = new GridPane();
            Scene sc = new Scene(gp, 500, 500);
            s.setScene(sc);
            Kassa kassa = new Kassa();

            Label lnimi = new Label("Toote nimi:");
            TextField nimi = new TextField("Banaan");
            Label lkogus = new Label("Toote kogus:");
            TextField kogus = new TextField("10");
            Label lhind = new Label("Toote hind:");
            TextField hind = new TextField("2");
            Button kinnita = new Button("Kinnita");
            Label laoskokku = new Label("Laos hetkel tooteid: " + kassa.laoskokku);
            Label kokkuhind = new Label("Toodete hind kokku: " + kassa.hindkokku);
            Label keskmhind = new Label("Toodete hind keskmine: " + kassa.keskminehind);
            gp.add(lnimi, 1, 1);
            gp.add(nimi, 2, 1);
            gp.add(lkogus, 1, 2);
            gp.add(kogus, 2, 2);
            gp.add(lhind, 1, 3);
            gp.add(hind, 2, 3);
            gp.add(kinnita, 2, 4);
            gp.add(laoskokku, 1, 5);
            gp.add(kokkuhind, 1, 6);
            gp.add(keskmhind, 1, 7);

            kinnita.setOnAction(event -> {
                Date now = new Date();
                Toode toode = new Toode(nimi.getText(), Integer.parseInt(kogus.getText()), Integer.parseInt(hind.getText()), now);
                kassa.lisaArhiivi(toode);
                laoskokku.setText("Laos hetkel tooteid: " + kassa.laoskokku);
                kokkuhind.setText("Toodete hind kokku: " + kassa.hindkokku);
                keskmhind.setText("Toodete hind kokku: " + kassa.keskminehind);
                //kassa.prindiLadu();
            });


            s.show();
        }


}
