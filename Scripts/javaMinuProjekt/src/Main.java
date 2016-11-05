import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by antz on 08/10/2016.
 */
public class Main {
    public static void main (String args[]){
        System.out.println("Tere");
        HashMap Investeeringud = new HashMap();
        ArrayList MinuRead = new ArrayList();

        for (int i=0; i < 2; i++){
            MinuRead.clear();

            for (int j = 0; j < 1; j++) {
                MinuRead.add((int) (24));
            }
            Investeeringud.put("Rida"+i, MinuRead);
        }
        System.out.println("Investeeringud = " + Investeeringud);
    }
}
