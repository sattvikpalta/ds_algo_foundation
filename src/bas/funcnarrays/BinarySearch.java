package bas.funcnarrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        scn.close();

        System.out.println(binarySearch(a, data));
    }

    public static boolean binarySearch(int[] a, int data) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > a[mid]) {
                lo = mid + 1;
            } else if (data < a[mid]) {
                hi = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

}
