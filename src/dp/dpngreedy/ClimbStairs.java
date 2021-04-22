package dp.dpngreedy;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        System.out.println(countStairPaths(n, new int[n + 1]));
        System.out.println(countStairPaths(n));

    }

    // Memoization
    public static int countStairPaths(int n, int[] bank) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        if (bank[n] != 0) {
            return bank[n];
        }

        int nm1 = countStairPaths(n - 1, bank);
        int nm2 = countStairPaths(n - 2, bank);
        int nm3 = countStairPaths(n - 3, bank);

        int count = nm1 + nm2 + nm3;
        bank[n] = count;

        return count;
    }

    // Tabulation
    public static int countStairPaths(int n) {
        int[] bank = new int[n + 1];
        bank[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                bank[i] = bank[i - 1];
            } else if (i == 2) {
                bank[i] = bank[i - 1] + bank[i - 2];
            } else {
                bank[i] = bank[i - 1] + bank[i - 2] + bank[i - 3];
            }
        }

        return bank[n];
    }
}
