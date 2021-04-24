package basics.patterns;

import java.util.Scanner;

public class W {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Method - 1
        /*
         * for (int row = 1; row <= numRows; row++) { for (int col = 1; col <= numRows;
         * col++) { if (row >= 1 && row <= numRows / 2) { if (col == 1 || col ==
         * numRows) { System.out.print("* "); } else { System.out.print("  "); } } else
         * { if (col == 1 || col == numRows) { System.out.print("* "); } else { if (row
         * == col || row + col == numRows + 1) { System.out.print("* "); } else {
         * System.out.print("  "); } } } }
         * 
         * System.out.println(); }
         */

        // Method - 2
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                if (col == 1 || col == numRows) {
                    System.out.print("* ");
                } else {
                    if (row > numRows / 2 && (col == row || col + row == numRows + 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }

    }

}
