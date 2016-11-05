/**
 * Created by antz on 28/10/2016.
 */
public class Raamat {
    private String Nimi;
    private String Autor;
    private String Asukoht;
    private boolean Laenutatud;

    public Raamat(String nimi, String autor, String asukoht) {
        this.Nimi = nimi;
        this.Autor = autor;
        this.Asukoht = asukoht;
        this.Laenutatud = false;

    }
    public String toString (){
        return (this.getPealkiri() +" "+ this.getAutor()+" "+ this.getAsukoht());
    }
    public String getPealkiri(){
        return Nimi;
    }
    public String getAutor(){
        return Autor;
    }
    public String getAsukoht () {
        return Asukoht;
    }
}
    /*
    public boolean isLaenutatud (){
        if (this.Laenutatud = true) {
            return true;
        }
    }
    public void setLaenutatud (){
        if (this.isLaenutatud() = false) {
            this.Laenutatud = true;
        }
    }
}
*/
