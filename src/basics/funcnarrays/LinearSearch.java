package basics.funcnarrays;

import java.util.Scanner;

public class LinearSearch {
    // Program to implement Linear Search

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        scn.close();

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                idx = i;
                break;
            }
        }

        System.out.println(idx);
    }

}
