package basics.funcnarrays;

import java.util.Scanner;

public class ArrayAdition {
    // Program to add 2 arrays

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt(); // Input (Example: n1 = 6)
        int[] one = new int[n1];
        for (int i = 0; i < one.length; i++) {
            one[i] = scn.nextInt();
        }

        int n2 = scn.nextInt(); // Input (Example: n2 = 3)
        int[] two = new int[n2];
        for (int i = 0; i < two.length; i++) {
            two[i] = scn.nextInt();
        }

        scn.close();
        add(one, two);
    }

    public static void add(int[] one, int[] two) {
        // one = {3, 0, 4, 2, 1, 6}
        // two = {1, 2, 3}
        int[] sum = new int[one.length > two.length ? one.length : two.length];

        int carry = 0;
        int i = one.length - 1;
        int j = two.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int digit = carry; // digit = 0

            // If one is not empty, add one[i] to digit
            if (i >= 0) {
                digit += one[i]; // digit = 0 + 6 = 6
            }

            // If two is not empty, add two[i] to digit
            if (j >= 0) {
                digit += two[j]; // digit = 6 + 3 = 9
            }

            carry = digit / 10; // carry = 9 / 10 = 0
            digit = digit % 10; // digit = 9 % 10 = 0

            sum[k] = digit; // sum[0] = 9

            i--;
            j--;
            k--;
        }

        // To print the very first number of the sum if carry is present.
        // For example, 984 + 950 = 1934
        // Now the sum array isn't large enough to accommodate 1934,
        // It can only store 934, hence we print 1 before printing sum.
        if (carry != 0) {
            System.out.println(carry);
        }

        for (k = 0; k < sum.length; k++) {
            System.out.println(sum[k]);
        }
    }

}
