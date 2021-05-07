package basics.funcnarrays;

import java.util.Scanner;

public class AnyBaseMul {
    public static void main(String[] args) {
        // Program to multiply 2 numbers of a given base

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(); // Input: base value (Example: 10)
        int n1 = scn.nextInt(); // Input: first number (Example: 542)
        int n2 = scn.nextInt(); // Input: second number (Example: 51)
        scn.close();

        // Call to getProduct function which returns product of n1 and n2
        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;
        int power = 1;

        while (n2 != 0) {
            int rem = n2 % 10; // rem = 1
            n2 /= 10; // n2 = 5

            // Call to getSingleDigitProd which returns product of n1 and rem
            int singleProd = getSingleDigitProd(b, n1, rem);
            rv = getSum(b, rv, singleProd * power);
            power *= 10;
        }

        return rv;
    }

    public static int getSingleDigitProd(int b, int n1, int n2) {
        int rv = 0;
        int power = 1;
        int carry = 0;

        while (n1 != 0 || carry != 0) {
            int r1 = n1 % 10; // r1 = 2
            n1 /= 10; // n1 = 54

            int digit = r1 * n2 + carry; // digit = 2 x 5 + 0 = 10
            carry = digit / b; // 10 / 10 = 1
            digit = digit % b; // 10 / 10 = 0

            rv += digit * power; // rv = 10 x 1
            power *= 10; // power = 10
        }

        return rv;
    }

    public static int getSum(int b, int n1, int n2) {
        int sum = 0;
        int carry = 0;
        int power = 1;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int digit = r1 + r2 + carry;

            carry = digit / b;
            digit = digit % b;

            sum += power * digit;
            power *= 10;
        }

        return sum;
    }

}
