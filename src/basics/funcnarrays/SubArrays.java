package basics.funcnarrays;

import java.util.Scanner;

public class SubArrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arrLen = scn.nextInt();
        int[] arr = new int[arrLen];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();
        subArrays(arr);
    }

    public static void subArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
}
