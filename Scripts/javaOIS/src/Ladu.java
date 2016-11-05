import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by antz on 17/10/2016.
 */
public class Ladu {

    HashMap<String, ArrayList> joogid = new HashMap();
    ArrayList HindKogus = new ArrayList();
    int ArrayHind = 0;
    int ArrayKogus = 1;

    public void LisaJook (String jook, int hind) {
        HindKogus.add(0, hind);
        joogid.put(jook, HindKogus);

        System.out.println(jook + " hinnaga "+ hind + " lisatud");
    }

    public void LaoSeisHinnad(){
        System.out.println(joogid);
    }

    public void UuendaKogus (String jook, int kogus) {
        if(joogid.containsKey(jook)) {
            HindKogus.add(1, kogus);
            joogid.put(jook, HindKogus);

        } else {
            throw new IllegalArgumentException(jook + " does not exist");
        }
    }
}
