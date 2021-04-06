package bas.getstart;

import java.util.Scanner;

public class InvNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int inv = 0;

        int i = 1;
        while (n != 0) {
            int rem = n % 10;
            int iPlace = i * (int) Math.pow(10, rem - 1);
            inv = inv + iPlace;
            n /= 10;
            i++;
        }

        System.out.println(inv);
    }

}
