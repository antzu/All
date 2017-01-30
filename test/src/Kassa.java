import java.util.ArrayList;

/**
 * Created by antz on 29/01/2017.
 */
public class Kassa {
    ArrayList<Toode> arhiiv = new ArrayList<>();
    ArrayList<Toode> ladu = new ArrayList<>();

    private static int laoskokku = 0;
    private static int keskminehind = 0;
    private static int hindkokku = 0;

    public void lisaArhiivi(Toode toode) {
        arhiiv.add(toode);
        laoskokku = laoskokku + toode.getKogus();
        hindkokku = hindkokku + toode.getHind()*toode.getKogus();
        keskminehind = hindkokku / laoskokku;
    }
    public void lisaMüük(Toode toode){
        arhiiv.add(toode)
        laoskokku = laoskokku - toode.getKogus();
        hindkokku = hindkokku - toode.getHind()*toode.getKogus();
        keskminehind = hindkokku / laoskokku;
    }


    public void setToodeKeskmHind(int i, Toode toode) {
        int alghind = ladu.get(i).getHind();
        int kogus = ladu.get(i).getKogus();
        int uushind = (alghind*kogus + toode.getHind()*toode.getKogus()) / (kogus + toode.getKogus());
        ladu.get(i).setHind(uushind);
    }

    public void laoSaldo() {
        
    }

    public void eemaldaLaost(Toode toode) {

    }


    public void prindiLadu() {
        System.out.println(ladu);
    }

    public int HindKokku() {
        int sum = 0;
        for (int i = 0; i < ladu.size(); i++) {
            sum += ladu.get(i).getHind();
        }
        return sum;
    }
}

