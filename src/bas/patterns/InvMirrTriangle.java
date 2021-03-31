package bas.patterns;

import java.util.Scanner;

public class InvMirrTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Method - 1
        /*
         * for (int row = 1; row <= numRows; row++) { for (int colSpace = 1; colSpace <
         * row; colSpace++) { System.out.print("  "); }
         * 
         * for (int colStar = row; colStar <= numRows; colStar++) {
         * System.out.print("* "); }
         * 
         * System.out.println(); }
         */

        // Method - 2
        int csp = 0;
        int cst = numRows;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            csp++;
            cst--;
            System.out.println();
        }
    }

}
