package basics.funcnarrays;

import java.util.Scanner;

public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();

        subsets(arr);
    }

    public static void subsets(int[] arr) {
        int limit = (int) Math.pow(2, arr.length);
        
        for (int i = 0; i < limit; i++) {
            String subset = "";
            int temp = i;

            for (int j = arr.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp /= 2;

                if (rem == 0)
                    subset = "-\t" + subset;
                else
                    subset = arr[j] + "\t" + subset;
            }

            System.out.println(subset);
        }
    }

}
