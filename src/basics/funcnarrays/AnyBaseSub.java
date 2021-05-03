package basics.funcnarrays;

import java.util.Scanner;

public class AnyBaseSub {
    // Program to subtract 2 numbers of a given base

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(); // Input: base value (Example: 10)
        int n1 = scn.nextInt(); // Input: first number (Example: 54)
        int n2 = scn.nextInt(); // Input: second number (Example: 23)
        scn.close();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int rv = 0;
        int power = 1;
        int borrow = 0;

        // To get larger number in n1 and smaller one in n2
        if (n2 < n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        while (n2 != 0) {
            int r1 = n1 % 10; // r1 = 54 % 10 = 4
            int r2 = n2 % 10; // r2 = 23 % 10 = 3

            n1 /= 10; // n1 = 5
            n2 /= 10; // n2 = 2

            int digit = r2 - r1 - borrow; // 3 - 4 - 0 = -1
            if (digit < 0) {
                borrow = 1; // borrow = 1
                digit += b; // digit = -1 + 10 = 9
            } else {
                borrow = 0;
            }

            rv += digit * power; // rv = 0 + 9 x 1
            power *= 10; // power = 10
        }

        return rv;
    }

}
