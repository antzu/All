import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int veel;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kull voi kiri? vasta 1/kull 2/kiri");
            int vastus = sc.nextInt();
            kullkiri(vastus);
            System.out.println("Mangi veel?");
            veel = sc.nextInt();
        } while (veel == 1);
    }
    public static void kullkiri(int vastus){
        int mynt = (int)(Math.random()*2);
        if (mynt == vastus) {
            System.out.println("sinu voit");
        } else {
            System.out.println("vale, ei vedanud");
        }
    }
}