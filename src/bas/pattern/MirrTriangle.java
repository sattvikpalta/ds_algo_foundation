package bas.pattern;

import java.util.Scanner;

public class MirrTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        //Method - 1
        /*
         * for (int row = 1; row <= numRows; row++) { for (int colSpace = row; colSpace
         * < numRows; colSpace++) { System.out.print("  "); }
         * 
         * for (int colStar = 1; colStar <= row; colStar++) { System.out.print("* "); }
         * 
         * System.out.println(); }
         */

         //Method - 2
        int csp = numRows - 1;
        int cst = 1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            csp--;
            cst++;
            System.out.println();
        }
    }

}
