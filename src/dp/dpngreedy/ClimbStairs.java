package dp.dpngreedy;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        System.out.println(countStairPaths(n));
    }

    public static int countStairPaths(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }

        int nm1 = countStairPaths(n - 1);
        int nm2 = countStairPaths(n - 2);
        int nm3 = countStairPaths(n - 3);

        int count = nm1 + nm2 + nm3;

        return count;
    }

}
