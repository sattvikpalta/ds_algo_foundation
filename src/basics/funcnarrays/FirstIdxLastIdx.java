package basics.funcnarrays;

import java.util.Scanner;

public class FirstIdxLastIdx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        scn.close();

        int lo = 0;
        int hi = arr.length - 1;
        int lastIdx = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                lastIdx = mid;
                lo = mid + 1;
            }
        }

        lo = 0;
        hi = arr.length - 1;
        int firstIdx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (data > arr[mid]) {
                lo = mid + 1;
            } else if (data < arr[mid]) {
                hi = mid - 1;
            } else {
                firstIdx = mid;
                hi = mid - 1;
            }
        }

        System.out.println(firstIdx);
        System.out.println(lastIdx);
    }
}
