import java.util.ArrayList;

/**
 * Created by antz on 29/01/2017.
 */
public class Kassa {
    ArrayList<Toode> ladu = new ArrayList<>();
    static int laoskokku = 0;

    public void lisaLattu (Toode toode){
        ladu.add(toode);
        laoskokku = laoskokku + toode.getKogus();
    }

}
