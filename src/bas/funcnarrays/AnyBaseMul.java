package bas.funcnarrays;

import java.util.Scanner;

public class AnyBaseMul {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;
        int power = 1;

        while (n2 != 0) {
            int rem = n2 % 10;
            n2 /= 10;

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
            int r1 = n1 % 10;
            n1 /= 10;

            int digit = r1 * n2 + carry;
            carry = digit / b;
            digit = digit % b;

            rv += digit * power;
            power *= 10;
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
