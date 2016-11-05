import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList mass = new ArrayList();
        for (int j = 0; j < 1 + (int)(Math.random()*10); j++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ytle number");
            int arv = sc.nextInt();

            mass.add(arv);
            System.out.println(mass);
        }
        Collections.sort(mass);
        System.out.println(mass);
    }
}