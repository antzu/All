import java.util.ArrayList;

/**
 * Created by antz on 29/01/2017.
 */
public class Kassa {
    ArrayList<Toode> arhiiv = new ArrayList<>();
    ArrayList<Toode> ladu = new ArrayList<>();

    static int laoskokku = 0;

    public void lisaArhiivi(Toode toode) {
        arhiiv.add(toode);
        laoskokku = laoskokku + toode.getKogus();
        for (int i = 0; i < ladu.size(); i++) {
            if (ladu.get(i).getNimi() == toode.getNimi()) {
                ladu.get(i).setKogus(ladu.get(i).getKogus() + toode.getKogus());
                setToodeUusHind(i, toode);
            } else {
                ladu.add(toode);

            }
        }
    }

    public void setToodeUusHind(int i, Toode toode) {
        int alghind = ladu.get(i).getHind();
        int kogus = ladu.get(i).getKogus();
        int uushind = (alghind + toode.getHind()) / (kogus + toode.getKogus());
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

