import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList autod = new ArrayList();
    public static int [] DATA = {5, 5, 5, 10, 10, 5, 5, 5, 5, 5, 5, 5, 5, 6};

    public static void main(String[] args) {
        autod.add(10);
        autod.add(20);
        autod.add(20);
        autod.add(20);
        autod.add(10);
        autod.add(10);
        sitt sitt = new sitt();
        int sum = 0;
        for (int i = 0; i < DATA.length; i++) {
            sum+= DATA[i];

        }
        System.out.println(sum);
        sitt.autokoormad(autod, DATA);
    }
}