package basics.funcnarrays;

import java.util.Scanner;

public class FirstIdxLastIdx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        scn.close();

        int lo = 0;
        int hi = a.length - 1;
        int firstIdx = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > a[mid]) {
                lo = mid + 1;
            } else if (data < a[mid]) {
                hi = mid - 1;
            } else {
                firstIdx = mid;
                hi = mid - 1;
            }
        }

        System.out.println(firstIdx);

        lo = 0;
        hi = a.length - 1;
        int lastIdx = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > a[mid]) {
                lo = mid + 1;
            } else if (data < a[mid]) {
                hi = mid - 1;
            } else {
                lastIdx = mid;
                lo = mid + 1;
            }
        }

        System.out.println(lastIdx);

    }

}
