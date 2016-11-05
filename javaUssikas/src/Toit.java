import javafx.scene.shape.Circle;

/**
 * Created by antz on 30/10/2016.
 */
public class Toit {
    Circle s88k = new Circle (20);
    int mitus88ki = 0;

    public Toit (){

    }
    public void VotaToit (int x, int y, Uss uss) {
        if (x <= 20 + s88k.getCenterX() && x >= s88k.getCenterX() -20){
            if (y <= 20 + s88k.getCenterY() && y >= s88k.getCenterY() -20){
                mitus88ki = mitus88ki++;
                uss.Pikenda(mitus88ki);
                s88k.setCenterX((int) (Math.random()*560));
                s88k.setCenterY((int) (Math.random()*560));

            }
        }
    }
}
