package bas.patterns;

import java.util.Scanner;

public class InvPyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numRows = scn.nextInt();

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
            cst -= 2;
            System.out.println();
        }
    }

}
