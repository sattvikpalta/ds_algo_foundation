package bas.funcnarrays;

import java.util.Scanner;

public class AnyBaseSub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int rv = 0;
        int power = 1;
        int borrow = 0;

        if (n2 < n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        while (n2 != 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int digit = r2 - r1 - borrow;
            if (digit < 0) {
                borrow = 1;
                digit += b;
            } else {
                borrow = 0;
            }

            rv += digit * power;
            power *= 10;
        }

        return rv;
    }

}
