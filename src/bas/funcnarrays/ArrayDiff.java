package bas.funcnarrays;

import java.util.Scanner;

public class ArrayDiff {
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

        diff(one, two);

    }

    public static void diff(int[] one, int[] two) {
        int rv[] = new int[two.length];
        int borrow = 0;

        for (int i = 1; i <= one.length; i++) {
            int digit = two[two.length - i] - one[one.length - i] - borrow;

            if (digit < 0) {
                borrow = 1;
                digit += 10;
            } else {
                borrow = 0;
            }

            rv[rv.length - i] = digit;
        }

        int index = 0;
        for (int i = 0; i < rv.length; i++) {
            if (rv[i] == 0) {
                index++;
            } else {
                break;
            }
        }

        for (int i = index; i < rv.length; i++) {
            System.out.print(rv[i] + " ");
        }

    }

}
