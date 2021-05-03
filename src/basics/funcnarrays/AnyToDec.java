package basics.funcnarrays;

import java.util.Scanner;

public class AnyToDec {
    // Program to convert a number from any base to decimal base

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input number (Example: 421)
        int b = scn.nextInt(); //
        int d = getValueIndecimal(n, b);
        scn.close();

        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int rv = 0;
        int bPower = 1;

        while (n != 0) {
            int rem = n % 10;
            rv += rem * bPower;
            bPower *= b;
            n /= 10;
        }

        return rv;
    }
}
