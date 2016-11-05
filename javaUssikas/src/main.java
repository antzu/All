import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

    public class main extends Application {
        double muutuja = 0.01;  //see on m2ngu kiirus, mida v2iksem, seda kiirem
        int konstant = 4;       //alla 4 l2heb m2ng liiga aeglaseks
        int paremale = konstant;
        int vasakule = -konstant;
        int ules = -konstant;
        int alla = konstant;
        int liikuminex = 0;
        int liikuminey = 0;
        long timeRendered;
        @Override
        public void start(Stage primaryStage) throws Exception {
            System.out.println("algus");
            primaryStage.show();

            Uss uss = new Uss();
            Pane pane = uss.pane;
            Scene scene = new Scene(pane, 600, 600);
            primaryStage.setScene(scene);


            Circle ring[] = uss.ring;
            pane.getChildren().add(ring[0]);

            Toit toit = new Toit();
            Circle s88k = toit.s88k;
            pane.getChildren().add(s88k);
            s88k.setCenterX(100);
            s88k.setCenterY(100);

            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    if(now < timeRendered + muutuja*(1000000)){
                    return;
                    }
                    timeRendered = now;
                    int ringPraeguY = (int)ring[0].getCenterY();
                    int ringPraeguX = (int)ring[0].getCenterX();
                    int uusRingiY = Math.min(Math.abs(ringPraeguY + liikuminey), 580);
                    int uusRingiX = Math.min(Math.abs(ringPraeguX + liikuminex), 580);
                    uss.ussarrayX.add(ringPraeguX);
                    uss.ussarrayY.add(ringPraeguY);
                    ring[0].setCenterY(uusRingiY);
                    ring[0].setCenterX(uusRingiX);
                    toit.VotaToit(uusRingiX, uusRingiY, uss);
                    if (uss.ussarrayX.size() > 5){
                        uss.ussarrayX.remove(0);
                        uss.ussarrayY.remove(0);

                    }
                }
            }.start();

            scene.setOnKeyPressed(event -> {
                KeyCode code = event.getCode();
                if (code == KeyCode.RIGHT) {
                    if (liikuminex == vasakule){
                        liikuminex = vasakule;
                        liikuminey = 0;
                    } else {
                        liikuminex = paremale;
                        liikuminey = 0;
                    }

                } else if (code == KeyCode.LEFT) {
                    if (liikuminex == paremale){
                        liikuminex = paremale;
                        liikuminey = 0;
                    } else {
                        liikuminex = vasakule;
                        liikuminey = 0;
                    }

                } else if (code == KeyCode.UP) {
                   if (liikuminey == alla){
                       liikuminey = alla;
                       liikuminex = 0;
                   } else {
                       liikuminey = ules;
                       liikuminex = 0;
                   }

                } else if (code == KeyCode.DOWN){
                    if (liikuminey == ules){
                        liikuminey = ules;
                        liikuminex = 0;
                    } else {
                        liikuminey = alla;
                        liikuminex = 0;
                    }
                }
            });

        }
    }


