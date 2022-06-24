package basics.funcnarrays;

import java.util.Scanner;

public class ArrayAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int oneLen = scn.nextInt();
        int[] one = new int[oneLen];
        for (int i = 0; i < one.length; i++)
            one[i] = scn.nextInt();

        int twoLen = scn.nextInt();
        int[] two = new int[twoLen];
        for (int i = 0; i < two.length; i++)
            two[i] = scn.nextInt();

        scn.close();
        addArrays(one, two);
    }

    public static void addArrays(int[] one, int[] two) {
        int[] sum = new int[one.length > two.length ? one.length : two.length];

        int carry = 0;
        int ptr1 = one.length - 1;
        int ptr2 = two.length - 1;
        int ptr3 = sum.length - 1;

        while (ptr3 >= 0) {
            int digit = carry;

            if (ptr1 >= 0)
                digit += one[ptr1];

            if (ptr2 >= 0)
                digit += two[ptr2];

            carry = digit / 10;
            digit %= 10;

            sum[ptr3] = digit;

            ptr1--;
            ptr2--;
            ptr3--;
        }

        if (carry != 0)
            System.out.println(carry);

        for (int num : sum)
            System.out.println(num);

    }
}
