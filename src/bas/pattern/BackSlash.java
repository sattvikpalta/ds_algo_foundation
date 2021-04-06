package bas.pattern;

import java.util.Scanner;

public class BackSlash {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Method - 1
        /*
         * int csp = 0; int cst = 1;
         * 
         * for (int row = 1; row <= numRows; row++) { for (int col = 1; col <= csp;
         * col++) { System.out.print("  "); }
         * 
         * for (int col = 1; col <= cst; col++) { System.out.print("* "); }
         * 
         * csp++; System.out.println(); }
         */

        // Method - 2
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                if (row == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

}
