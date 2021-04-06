package bas.getstart;

import java.util.Scanner;

public class RotNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.close();

        int temp = n;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        k = k % count;
        if (k < 0) {
            k = k + count;
        }

        int div = (int) Math.pow(10, k);
        int mul = (int) Math.pow(10, count - k);
        int quo = n / div;
        int rem = n % div;

        int rotNum = quo + rem * mul;
        System.out.println(rotNum);
    }

}
