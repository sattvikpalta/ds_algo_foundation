package bas.pattern;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Method - 1
        /*
         * for (int row = 1; row <= numRows / 2 + 1; row++) { for (int colSpace = row;
         * colSpace <= numRows / 2; colSpace++) { System.out.print("  "); }
         * 
         * for (int colStar = 1; colStar <= 2 * row - 1; colStar++) {
         * System.out.print("* "); }
         * 
         * System.out.println(); }
         * 
         * for (int row = 1; row <= numRows / 2; row++) { for (int colSpace = 1;
         * colSpace <= row; colSpace++) { System.out.print("  "); }
         * 
         * for (int colStar = 1; colStar <= numRows - 2 * row; colStar++) {
         * System.out.print("* "); }
         * 
         * System.out.println(); }
         */

        // Method - 2
        int csp = numRows / 2;
        int cst = 1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            if (row <= numRows / 2) {
                csp--;
                cst += 2;
            } else {
                csp++;
                cst -= 2;
            }

            System.out.println();
        }

    }

}
