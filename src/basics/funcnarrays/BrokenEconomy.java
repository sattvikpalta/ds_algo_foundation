package basics.funcnarrays;

import java.util.Scanner;

public class BrokenEconomy {
    // Pepcoding level 1 problem - Broken Economy

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
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > a[mid]) {
                lo = mid + 1;
                floor = a[mid];
            } else if (data < a[mid]) {
                hi = mid - 1;
                ceil = a[mid];
            } else {
                ceil = a[mid];
                floor = a[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

}
