package basics.patterns;

import java.util.Scanner;

public class HollowDiamond {
    // Program to print hollow diamond pattern

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Input (Example: 5)
        int numRows = scn.nextInt();
        scn.close();

        int csp = 1;
        int cst = numRows / 2 + 1; // cst = 5 / 2 + 1 = 3

        for (int row = 1; row <= numRows; row++) {
            // Loop to print stars
            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            // Loop to print spaces
            for (int col = 1; col <= csp; col++) {
                System.out.print("  ");
            }

            // Loop to print stars
            for (int col = 1; col <= cst; col++) {
                System.out.print("* ");
            }

            // For first half increase csp by 2 and decrease cst by 1
            // For second half decrease csp by 1 and increase cst by 1
            if (row <= numRows / 2) {
                csp += 2;
                cst--;
            } else {
                csp -= 2;
                cst++;
            }

            System.out.println();
        }
    }

}
