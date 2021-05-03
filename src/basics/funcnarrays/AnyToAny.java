package basics.funcnarrays;

import java.util.Scanner;

public class AnyToAny {
    // Program to convert a number from a source base to destination base

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input: number (Example: 341)
        int sourceBase = scn.nextInt(); // Input: source base (Example: 8)
        int destBase = scn.nextInt(); // Input: destination base (Example: 2)
        scn.close();

        // First, convert the number into a decimal number
        int decNum = anyToDec(n, sourceBase);
        // Next, convert the decimal number into a number with required base
        System.out.println(decToAny(decNum, destBase));
    }

    public static int anyToDec(int n, int sb) {
        int rv = 0;
        int sbPower = 1;

        while (n != 0) {
            int rem = n % 10;
            rv += rem * sbPower;
            sbPower *= sb;
            n /= 10;
        }

        return rv;
    }

    public static int decToAny(int decNum, int db) {
        int rv = 0;
        int tenPower = 1;

        while (decNum != 0) {
            int rem = decNum % db;
            rv += rem * tenPower;
            tenPower *= 10;
            decNum /= db;
        }

        return rv;
    }
}
