package bas.patterns;

import java.util.Scanner;

public class NumHalfDiamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();

        int csp = numRows / 2;
        int cst = 1;

        for (int row = 1; row <= numRows; row++) {
            for (int col = 1; col <= csp; col++) {
                System.out.print("* ");
            }

            for (int col = 1; col <= cst; col++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= csp; col++) {
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
