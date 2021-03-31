package bas.funcnarrays;

import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] one = new int[n1];
        for (int i = 0; i < one.length; i++) {
            one[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] two = new int[n2];
        for (int i = 0; i < two.length; i++) {
            two[i] = scn.nextInt();
        }

        scn.close();
        add(one, two);
    }

    public static void add(int[] one, int[] two) {
        int[] sum = new int[one.length > two.length ? one.length : two.length];

        int carry = 0;
        int i = one.length - 1;
        int j = two.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int digit = carry;
            if (i >= 0) {
                digit += one[i];
            }

            if (j >= 0) {
                digit += two[j];
            }

            carry = digit / 10;
            digit = digit % 10;

            sum[k] = digit;

            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.println(carry);
        }

        for (k = 0; k < sum.length; k++) {
            System.out.println(sum[k]);
        }
    }

}
