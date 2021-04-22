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

        System.out.println(countStairPaths(n, arr));

    }

    // Tabulation
    public static int countStairPaths(int n, int[] arr) {
        int[] bank = new int[n + 1];
        bank[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i + j < bank.length; j++) {
                bank[i] += bank[i + j];
            }
        }

        return bank[0];
    }
}
