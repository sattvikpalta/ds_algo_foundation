package basics.funcnarrays;

import java.util.Scanner;

public class AnyToDec {
    // Program to convert a number from any base to decimal base

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input: number (Example: 1101)
        int b = scn.nextInt(); // Input: source base (Example: 2)
        int d = getValueIndecimal(n, b);
        scn.close();

        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int rv = 0;
        int bPower = 1;

        // Method to convert a number from a given base (i.e. binary) to decimal
        // 2 ^ 0 x 1 = 1
        // 2 ^ 1 x 0 = 0
        // 2 ^ 2 x 1 = 4
        // 2 ^ 3 x 1 = 8

        // Return value = 1 + 0 + 4 + 8 = 13

        while (n != 0) {
            int rem = n % 10;
            rv += rem * bPower;
            bPower *= b;
            n /= 10;
        }

        return rv;
    }
}
