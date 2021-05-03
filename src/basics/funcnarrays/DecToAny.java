package basics.funcnarrays;

import java.util.Scanner;

public class DecToAny {
    // Program to convert a decimal number to a given base

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input: decimal number (Example: 855)
        int b = scn.nextInt(); // Input: base to convert number into (Example: 2)
        int dn = getValueInBase(n, b);
        scn.close();

        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0; // Return value
        int power = 0;

        // Method to convert a number from a decimal base to another base (example: 2)
        // 855 / 2, quotient = 427, remainder = 1
        // 427 / 2, quotient = 213, remainder = 1
        // 213 / 2, quotient = 106, remainder = 1
        // 106 / 2, quotient = 53, remainder = 0
        // 53 / 2, quotient = 26, remainder = 1
        // 26 / 2, quotient = 13, remainder = 0
        // 13 / 2, quotient = 6, remainder = 1
        // 6 / 2, quotient = 3, remainder = 0
        // 3 / 2, quotient = 1, remainder = 1
        // 1 / 2, quotient = 0, remainder = 1

        // Return value = 1101010111

        while (n != 0) {
            int rem = n % b; // rem = 1
            rv += rem * (int) Math.pow(10, power); // rv = 0 + 1 x 10 ^ 0
            n /= b; // n = 85
            power++; // power = 1
        }

        return rv;
    }

}
