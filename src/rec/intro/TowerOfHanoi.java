package rec.intro;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int tower1 = scn.nextInt();
        int tower2 = scn.nextInt();
        int tower3 = scn.nextInt();
        scn.close();

        toh(num, tower1, tower2, tower3);
    }

    public static void toh(int num, int tower1, int tower2, int tower3) {
        if (num == 0)
            return;

        toh(num - 1, tower1, tower3, tower2);
        System.out.println(num + "[" + tower1 + " -> " + +tower2 + "]");
        toh(num - 1, tower3, tower2, tower1);
    }

}
