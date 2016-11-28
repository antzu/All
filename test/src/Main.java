import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] DATA = {1, 3, 4, 5, 6, 7, 8, 9, 2, 5, 6, 7, 8};

       System.out.println(Arrays.toString(DATA));
        GetAllSubsetsByStack koormad = new GetAllSubsetsByStack(15);

        koormad.populateSubset(DATA, 0, DATA.length);

        koormad.toStacklist(15);
        System.out.println(koormad.stackslist);

        System.out.println(koormad.stacks);
        //System.out.println(koormad.stackslist);
    }

}