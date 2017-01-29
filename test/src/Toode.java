import java.util.Date;

/**
 * Created by antz on 29/01/2017.
 */
public class Toode {
    static String nimi;
    static int kogus;
    static int hind;
    static Date kpv;

    public Toode (String nimi, int kogus, int hind, Date kpv){
        this.nimi = nimi;
        this.kogus = kogus;
        this.hind = hind;
        this.kpv = kpv;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getKogus() {
        return kogus;
    }

    public void setKogus(int kogus) {
        this.kogus = kogus;
    }

    public int getHind() {
        return hind;
    }

    public void setHind(int hind) {
        this.hind = hind;
    }

    public Date getKpv() {
        return kpv;
    }

    public void setKpv(Date kpv) {
        this.kpv = kpv;
    }

}
