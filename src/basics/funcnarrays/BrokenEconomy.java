package basics.funcnarrays;

import java.util.Scanner;

public class BrokenEconomy {

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
        int floor = 0;
        int ceil = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid + 1];
            } else if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid - 1];
            } else {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }

        System.out.println(floor);
        System.out.println(ceil);
    }
}
