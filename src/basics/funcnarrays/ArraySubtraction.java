package basics.funcnarrays;

import java.util.Scanner;

public class ArraySubtraction {
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

        diff(one, two);

    }

    public static void diff(int[] one, int[] two) {
        // Given: array 2 > array 1
        int rv[] = new int[two.length];
        int borrow = 0;

        int i = one.length - 1;
        int j = two.length - 1;
        int k = rv.length - 1;

        while (k >= 0) {
            int digit = two[j] - borrow;
            if (i >= 0) {
                digit -= one[i];
            }

            if (digit < 0) {
                digit += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            rv[k] = digit;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        for (k = 0; k < rv.length; k++) {
            if (rv[k] > 0) {
                idx = k;
                break;
            }
        }

        for (k = idx; k < rv.length; k++) {
            System.out.println(rv[k]);
        }

    }

}
