/**
 * Created by antz on 28/01/2017.
 */
public class Zelda {
    int elusid;
    public Zelda (int elusid){
        this.elusid = elusid;
    }
    public void kaklusKolliga(int kollilElusid){
        this.elusid = this.elusid - kollilElusid;
        if (this.elusid <= 0){
            this.elusid = 0;
            System.out.println("Suri ara");
        }
    }
    public void prindiMituEluAlles (){
        System.out.println(this.elusid);
    }
    public void prindiKasOnElus(){
        if (this.elusid > 0){
            System.out.println("Elus");
        } else {
            System.out.println("Surnud");
        }
    }
}
