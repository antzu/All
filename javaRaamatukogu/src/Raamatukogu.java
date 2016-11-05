import javafx.scene.control.TextField;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by antz on 28/10/2016.
 */
public class Raamatukogu {
    int Raamatudkokku = 0;
    TextField raamatnimi = new TextField();
    TextField raamatautor = new TextField();
    TextField raamatasukoht = new TextField();
    TextField otsi = new TextField();
    List<Raamat> Raamatud = new ArrayList();

    public void lisaRaamat() {
        if (Raamatudkokku == 0){
            String nimi = raamatnimi.getText();
            String autor = raamatautor.getText();
            String asukoht = raamatasukoht.getText();
            Raamat raamat = new Raamat(nimi, autor, asukoht);
            Raamatud.add(raamat);
            Raamatudkokku = Raamatudkokku + 1;
            raamatnimi.clear();
            raamatautor.clear();
            raamatasukoht.clear();
        } else {
            for (int i = 0; i < Raamatudkokku; i++) {
                if (Raamatud.get(i).getPealkiri().contains(raamatnimi.getText())){
                    System.out.println(Raamatud.get(i).getPealkiri()+ " on juba olemas");
                    raamatnimi.clear();
                    raamatautor.clear();
                    raamatasukoht.clear();
                } else {
                    String nimi = raamatnimi.getText();
                    String autor = raamatautor.getText();
                    String asukoht = raamatasukoht.getText();
                    Raamat raamat = new Raamat(nimi, autor, asukoht);
                    Raamatud.add(raamat);
                    Raamatudkokku = Raamatudkokku + 1;
                    raamatnimi.clear();
                    raamatautor.clear();
                    raamatasukoht.clear();
                }
            }
        }
    }

    public void Raamatukoguraamatud() {
        System.out.println(Raamatud);
    }

    public void Otsinimega() {
        for (int i = 0; i < Raamatudkokku; i++) {
            if (Raamatud.get(i).getPealkiri().contains(otsi.getText())){
                System.out.println(Raamatud.get(i).getPealkiri());
            } else {
                System.out.println("Ei ole olemas");
            }
        }
    }
}
    /*
    eemaldaRaamat (string Nimi){

    }
    laenutaRaamat (string Nimi){

    }
    getRaamat (string Nimi){

    }
}*/
