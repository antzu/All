public class Legend {
    public static void main(String[] args) {
        int kollilElusid;

        int elusid = 35;
        Zelda zelda = new Zelda(elusid);

        kollilElusid = 25;
        zelda.kaklusKolliga(kollilElusid);

        zelda.prindiMituEluAlles();

        kollilElusid = 57;
        zelda.kaklusKolliga(kollilElusid);

        zelda.prindiKasOnElus();

    }
}