package basics.funcnarrays;

import java.util.Scanner;

public class AnyBaseAdd {
    // Program to add 2 numbers of a given base

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(); // Input: base value (Example: 2)
        int n1 = scn.nextInt(); // Input: first number (Example: 101)
        int n2 = scn.nextInt(); // Input: second number (Example: 110)
        scn.close();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int sum = 0;
        int carry = 0;
        int power = 1;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int r1 = n1 % 10; // r1 = 1
            int r2 = n2 % 10; // r2 = 0

            n1 /= 10; // n1 = 10
            n2 /= 10; // n2 = 11

            int digit = r1 + r2 + carry; // digit = 1 + 0 + 0 = 1

            carry = digit / b; // carry = 1 / 2 = 0
            digit = digit % b; // digit = 1 % 2 = 0

            sum += power * digit; // sum = 1 x 1
            power *= 10; // power = 1 x 10
        }

        return sum;
    }
}