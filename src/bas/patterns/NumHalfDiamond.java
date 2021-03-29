package bas.patterns;

import java.util.Scanner;

public class NumHalfDiamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();

        int csp = 2 * numRows - 3;
        int cst = 1;

        for (int row = 1; row <= numRows; row++) {
            int val = 1;
            for (int col = 1; col <= cst; col++) {
                System.out.print(val + " ");
                val++;
            }

            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            if (row == numRows) {
                cst--;
                val--;
            }

            for (int col = 1; col <= cst; col++) {
                val--;
                System.out.print(val + " ");
            }

            csp -= 2;
            cst++;
            System.out.println();
        }

    }

}
