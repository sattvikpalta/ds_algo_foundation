package basics.patterns;

import java.util.Scanner;

public class Swastik {
    // Program to print Swastik pattern
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();
        scn.close();

        // Method - 1
        /*
         * int csp = numRows / 2;
         * 
         * for (int row = 1; row <= numRows; row++) { for (int col = 1; col <= csp;
         * col++) { if (row == 1 || row == numRows / 2 + 1) { System.out.print("* "); }
         * else { if (row > numRows / 2 && col == 1) { System.out.print("* "); } else {
         * System.out.print("  "); } } }
         * 
         * System.out.print("* ");
         * 
         * for (int col = 1; col <= csp; col++) { if (row == numRows || row == numRows /
         * 2 + 1) { System.out.print("* "); } else { if (row <= numRows / 2 && col ==
         * csp) { System.out.print("* "); } else { System.out.print("  "); } } }
         * 
         * System.out.println(); }
         */

        // Method - 2
        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= numRows; col++) {
                if (row == 1) {
                    if (col <= numRows / 2 + 1|| col == numRows) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (row > 1 && row <= numRows / 2) {
                    if (col == numRows / 2 + 1 || col == numRows) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (row == numRows / 2 + 1) {
                    System.out.print("* ");
                } else if (row > numRows / 2 + 1 && row < numRows) {
                    if (col == 1 || col == numRows / 2 + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (col == 1 || col > numRows / 2) {
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
