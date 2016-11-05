import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.util.ArrayList;

/**
 * Created by antz on 30/10/2016.
 */
public class Uss {
    Circle[] ring = new Circle[100];
    ArrayList ussarrayX = new ArrayList();
    ArrayList ussarrayY = new ArrayList();
    Pane pane = new Pane();

    public Uss (){
        ring[0] = new Circle(20);

    }
    public void Pikenda (int i){
        ring[i] = new Circle(20);
        ring[i].setCenterX((int) ussarrayX.get(0));
        ring[i].setCenterY((int) ussarrayY.get(0));


    }
    public void Pikendus (){

    }
}
