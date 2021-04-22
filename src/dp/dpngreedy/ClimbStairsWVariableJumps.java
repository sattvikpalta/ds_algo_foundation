package dp.dpngreedy;

import java.util.Scanner;

public class ClimbStairsWVariableJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();

        countStairPaths(n, 0, arr);

    }

    // arr[10] = {3 3 0 2 1 2 4 2 0 0}
    public static void countStairPaths(int n, int count, int[] arr) {
        if (n == 0) {
            count += 1;
            return;
        } else if (n < 0) {
            return;
        }

        if (n < arr.length) {
            if (arr[n] == 0) {
                return;
            }
        }

        for (int i = 1; i <= arr[n - 1]; i++) {
            countStairPaths(n - i, count, arr);
        }

        System.out.println(count + 1);
    }

    // Tabulation
    /*
     * public static int countStairPaths(int n, int[] arr) { int[] bank = new int[n
     * + 1]; bank[n] = 1;
     * 
     * for (int i = n - 1; i >= 0; i--) { for (int j = 1; j <= arr[i] && i + j <
     * bank.length; j++) { bank[i] += bank[i + j]; } }
     * 
     * return bank[0]; }
     */
}
