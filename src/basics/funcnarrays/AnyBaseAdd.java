package basics.funcnarrays;

import java.util.Scanner;

public class AnyBaseAdd {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();

        int d = getSum(b, n1, n2);
        System.out.println(d);
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