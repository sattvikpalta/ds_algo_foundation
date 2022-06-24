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
        int[] diff = new int[two.length];

        int carry = 0;
        int ptr1 = one.length - 1;
        int ptr2 = two.length - 1;
        int ptr3 = diff.length - 1;

        while (ptr3 >= 0) {
            int digit = 0;
            int oneVal = ptr1 >= 0 ? one[ptr1] : 0;

            if (two[ptr2] + carry >= oneVal) {
                digit = two[ptr2] + carry - oneVal;
                carry = 0;
            } else {
                digit = two[ptr2] + carry + 10 - oneVal;
                carry = -1;
            }

            diff[ptr3] = digit;

            ptr1--;
            ptr2--;
            ptr3--;

        }

        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] != 0)
                break;
            else
                idx++;
        }

        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
