import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by antz on 12/10/2016.
 */

public class Main {
        public static void main(String args[]){
            int [][] lauaAlgseis = new int [9][9];
            int [][] lauaSeis = new int [9][9];

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++){
                    lauaAlgseis [i][j] = (int) (Math.random() * 1.03);
                }
            }
            prindiLaud(lauaSeis);
            System.out.println();
            prindiLaud(lauaAlgseis);
            Scanner sc = new Scanner(System.in);
            while (true) {

                System.out.println("Kuhu tahad pommitada? Formaat: x-y");
                String input = sc.nextLine();
                String[] xy = input.split("-");
                int x = Integer.parseInt(xy[0]) - 1;
                int y = Integer.parseInt(xy[1]) - 1;

                int tabamus = lauaAlgseis[y][x];
                System.out.println(tabamus);
                if (tabamus == 1) {
                    lauaAlgseis [y][x] = 2;
                    lauaSeis[y][x] = 2;
                    System.out.println("pihtas!");
                } else if (tabamus == 0) {
                    lauaSeis[y][x] = 3;
                    System.out.println("Mooda!");
                } else if (tabamus == 2) {
                    System.out.println("Juba lasid siia!");
                } else {
                    System.out.println("Error: kuidas sa yldse siia said?");
                }
                prindiLaud(lauaSeis);

                boolean labi = kasOnMangLabi(lauaAlgseis);
                if (labi == true){
                    break;
                }
            }
            System.out.println("Mang on labi!");
        }

    private static boolean kasOnMangLabi(int[][] lauaAlgseis) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(lauaAlgseis[j][i] == 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void prindiLaud(int [][] laud) {
            for (int i = 0; i < 9; i++){
                System.out.println(Arrays.toString(laud[i]));
            }
        }
    }

